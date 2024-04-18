package com.example.praktikum_4.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.praktikum_4.ProfileActivity;
import com.example.praktikum_4.R;

public class HomeFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ImageView iv_posting = view.findViewById(R.id.iv_posting);
        ImageView iv_profile = view.findViewById(R.id.iv_profile);

        iv_posting.setOnClickListener(v-> {
            PostingFragment postingFragment = new PostingFragment();
            FragmentManager fragmentManager = getParentFragmentManager();
            fragmentManager
                    .beginTransaction()
                    .replace(R.id.frame_container, postingFragment)
                    .addToBackStack(null)
                    .commit();
        });

        iv_profile.setOnClickListener(v-> {
            ProfileFragment profileFragment = new ProfileFragment();
            FragmentManager fragmentManager = getParentFragmentManager();
            fragmentManager
                    .beginTransaction()
                    .replace(R.id.frame_container, profileFragment)
                    .addToBackStack(null)
                    .commit();
        });

//        iv_profile.setOnClickListener(view1 -> {
//            Intent i = new Intent(getActivity(), ProfileActivity.class);
//            startActivity(i);
//        });

    }
}