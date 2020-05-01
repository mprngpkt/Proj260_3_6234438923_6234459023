package com.example.olymbus;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Ceremony extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_ceremony, container, false);

        Button bookCeremonyBut = view.findViewById(R.id.bookBus1Button);

        bookCeremonyBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimeTableForCeremony timeTableForCeremony = new TimeTableForCeremony();
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container, timeTableForCeremony).commit();
            }
        });

        return view;
    }



}
