package com.example.olymbus;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Swimming extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_swimming, container, false);

        /*Button bookSwimBut = view.findViewById(R.id.bookBus3Button);

        bookSwimBut.setOnClickListener(new View.OnClickListener() {
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
