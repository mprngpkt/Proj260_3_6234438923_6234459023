package com.example.olymbus;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class DetailFragment extends Fragment {

    String mModel = "OlymBus";
    int p;
    String[] article;
    int[] image;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        image = new int[] {R.drawable.swim_final, R.drawable.swim_prelim};
        article = new String[] {};
    }
}
