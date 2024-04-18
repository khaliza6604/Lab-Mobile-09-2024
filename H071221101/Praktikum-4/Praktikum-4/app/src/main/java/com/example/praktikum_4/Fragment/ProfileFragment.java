package com.example.praktikum_4.Fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.praktikum_4.R;

public class ProfileFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_profile, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ImageView iv_home = view.findViewById(R.id.iv_home);
        ImageView iv_posting = view.findViewById(R.id.iv_posting);

        iv_home.setOnClickListener(v-> {
            HomeFragment homeFragment = new HomeFragment();
            FragmentManager fragmentManager = getParentFragmentManager();
            fragmentManager
                    .beginTransaction()
                    .replace(R.id.frame_container, homeFragment)
                    .addToBackStack(null)
                    .commit();
        });

        iv_posting.setOnClickListener(v-> {
            PostingFragment postingFragment = new PostingFragment();
            FragmentManager fragmentManager = getParentFragmentManager();
            fragmentManager
                    .beginTransaction()
                    .replace(R.id.frame_container, postingFragment)
                    .addToBackStack(null)
                    .commit();
        });
    }
}