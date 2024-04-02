package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    //mengambil rv_post ke reccyleview dan atur tata letak (ukuran tetap) layout
        RecyclerView rvPostingan = findViewById(R.id.rv_post);
        rvPostingan.setHasFixedSize(true);
    //ambil apa yg ada di postingan trs diletakkan di layout
        PostinganAdapter postinganAdapter = new PostinganAdapter(DataSource.instagrams);
        rvPostingan.setAdapter(postinganAdapter);
    //same
        RecyclerView rvStory = findViewById(R.id.rv_story);
        rvStory.setHasFixedSize(true);

        StoryAdapter storyAdapter = new StoryAdapter(DataSource.instagrams);
        rvStory.setAdapter(storyAdapter);
    }
}