package com.example.praktikum6;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    LinearLayout llOn, llOff;
    RecyclerView recyclerView;
    TextView tvHead, tvBody;
    ImageView ivOff;
    Button btnMore, btnRetry;
    ProgressBar pbOn, pbOff;
    private ApiService apiService;
    private UserAdapter userAdapter;
    private int currentPage = 2;
    private boolean isLoading = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        llOn = findViewById(R.id.internetOn);
        llOff = findViewById(R.id.internetOff);
        tvHead = findViewById(R.id.tvHead);
        tvBody = findViewById(R.id.tvBody);
        ivOff = findViewById(R.id.ivOff);
        btnMore = findViewById(R.id.btnMore);
        btnRetry = findViewById(R.id.btnRetry);
        pbOff = findViewById(R.id.pbOff);
        pbOn = findViewById(R.id.pbOn);
        apiService = RetrofitClient.getClient().create(ApiService.class);
        recyclerView = findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // initialize adapter firstly settings and API calls
        loadData();

        btnMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnMore.setVisibility(View.GONE);
                // check, if its loading
                if (!isLoading) {
                    isLoading = true; // Set isLoading becomes "true" so there no double loading
                    // show ProgressBar
                    pbOn.setVisibility(View.VISIBLE);
                    // made and run thread for load data to next page (halaman)
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            try {
                                Thread.sleep(500); // delay the update for 0.5 seconds
                                currentPage++; // add 1 to page number when click the button "more"
                                // panggil method loadData again to load data from new page
                                loadData();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }).start();
                }
            }
        });

        btnRetry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // hide componens ui that offline
                ivOff.setVisibility(View.GONE);
                tvHead.setVisibility(View.GONE);
                tvBody.setVisibility(View.GONE);
                btnRetry.setVisibility(View.GONE);

                // show ProgressBar for show that app is trying to reconnect
                pbOff.setVisibility(View.VISIBLE);

                // make and run thread for try reconnecting
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        loadData();
                    }
                }).start();
            }
        });
    }

    private void loadData() {
        btnMore.setVisibility(View.GONE);
        pbOn.setVisibility(View.VISIBLE);

        // send API respons for get data from page that has found (tentukan)
        Call<UserResponse> call = apiService.getUsers(currentPage);
        call.enqueue(new Callback<UserResponse>() {
            @Override
            public void onResponse(Call<UserResponse> call, Response<UserResponse> response) {
                // hide progressBar after get respon
                pbOn.setVisibility(View.GONE);
                isLoading = false; // Set isLoading become false after upadet done
                if (response.isSuccessful()) {
                    llOn.setVisibility(View.VISIBLE);
                    btnMore.setVisibility(View.VISIBLE);
                    // if respons is success, add data to adapter RecyclerView
                    List<User> users = response.body().getData();
                    if (userAdapter == null) {
                        // if adapter inst thre, inisialisasi new baru
                        userAdapter = new UserAdapter(users);
                        recyclerView.setAdapter(userAdapter);
                    } else {
                        // if adapter is in, add new data in it
                        userAdapter.addUsers(users);
                        // update RecyclerView
                        userAdapter.notifyDataSetChanged();
                    }
                    // if, you want hide offline view
                    llOff.setVisibility(View.GONE);
                } else {
                    // add error message if respons is not success
                    showError("Failed to fetch data. Please try again later.");
                }
            }
            @Override
            public void onFailure(Call<UserResponse> call, Throwable t) {
                pbOn.setVisibility(View.GONE);
                btnMore.setVisibility(View.GONE);
                llOn.setVisibility(View.GONE);
                isLoading = false;
                // add componens UI that shows network (internet) is not connecting
                llOff.setVisibility(View.VISIBLE);
                ivOff.setVisibility(View.VISIBLE);
                tvHead.setVisibility(View.VISIBLE);
                tvBody.setVisibility(View.VISIBLE);
                btnRetry.setVisibility(View.VISIBLE);
                pbOff.setVisibility(View.GONE);
            }
        });
    }
    // Method for shows error message
    private void showError(String message) {
        // show error message that use toast (dialog)
        Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
    }
}