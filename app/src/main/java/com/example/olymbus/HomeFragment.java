package com.example.olymbus;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class HomeFragment extends Fragment {

    private ImageButton ceremonyBut;
    private ImageButton marathonBut;
    private ImageButton swimmingBut;
    private ImageButton weightliftingBut;
    private ImageButton divingBut;

    @Nullable
    @Override
    public View onCreateView(@NonNull final LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);

        ceremonyBut = view.findViewById(R.id.ceremonyButton);
        marathonBut = view.findViewById(R.id.marathonButton);
        swimmingBut = view.findViewById(R.id.swimmingButton);
        divingBut = view.findViewById(R.id.divingButton);
        weightliftingBut = view.findViewById(R.id.weightliftingButton);

        ceremonyBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ceremony ceremony = new Ceremony();
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container,ceremony).commit();

            }
        });

        marathonBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Athletic athletic = new Athletic();
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container,athletic).commit();
            }
        });

        swimmingBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Swimming swimming = new Swimming();
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container,swimming).commit();
            }
        });

        divingBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Diving diving = new Diving();
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container,diving).commit();
            }
        });

        weightliftingBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WeightLifting weightLifting = new WeightLifting();
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container,weightLifting).commit();
            }
        });



        return view;
    }

}


