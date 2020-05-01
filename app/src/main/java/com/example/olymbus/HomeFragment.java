package com.example.olymbus;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import org.w3c.dom.Text;

public class HomeFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull final LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);

        ImageView ceremonyBut = view.findViewById(R.id.ceremonyButton);
        ImageView marathonBut = view.findViewById(R.id.marathonButton);
        ImageView swimmingBut = view.findViewById(R.id.swimmingButton);
        ImageView divingBut = view.findViewById(R.id.divingButton);
        ImageView weightliftingBut = view.findViewById(R.id.weightliftingButton);
        TextView ceremonyText = view.findViewById(R.id.ceremonyTextView);
        TextView marathonText = view.findViewById(R.id.marathonTextView);
        TextView swimmingText = view.findViewById(R.id.swimmingTextView);
        TextView divingText = view.findViewById(R.id.divingTextView);
        TextView weightliftingText = view.findViewById(R.id.weightliftingTextView);

        ceremonyText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ceremony ceremony = new Ceremony();
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container,ceremony).commit();
            }
        });

        ceremonyBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ceremony ceremony = new Ceremony();
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container,ceremony).commit();
            }
        });

        marathonText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Athletic athletic = new Athletic();
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container,athletic).commit();
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

        swimmingText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Swimming swimming = new Swimming();
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container,swimming).commit();
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

        divingText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Diving diving = new Diving();
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container,diving).commit();
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

        weightliftingText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WeightLifting weightLifting = new WeightLifting();
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container,weightLifting).commit();
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


