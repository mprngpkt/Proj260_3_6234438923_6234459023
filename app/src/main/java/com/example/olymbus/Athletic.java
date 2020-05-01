package com.example.olymbus;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Athletic extends Fragment {

    private Button bookAthleticBut;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_ceremony, container, false);

        /*bookAthleticBut = view.findViewById(R.id.bookBus2Button);

        bookAthleticBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimeTableFragment timeTableFragment = new TimeTableFragment();
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container,timeTableFragment).commit();
            }
        });*/

        return view;
    }
}
