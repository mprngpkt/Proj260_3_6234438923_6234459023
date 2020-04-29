package com.example.olymbus;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class SeatingPlan extends Fragment {
    Button btnBack;
    Button btnseat1A;


    //เชื่อมกับ .xml เมื่อใช้ extends fragment
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.layout_seatingplan, container, false);

        //1A


        //back
        btnBack = (Button) v.findViewById(R.id.btnBack);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), BusTimeTable.class);
                startActivity(intent);
            }
        });

        return v;
    }

/*
    public  void  backToPrevious(){
        Intent intent = new Intent(this,com.example.olymbus.BusTimeTable);
        startActivity(intent);
    }

    public void  backToBusTimeable(View v){
        Intent intent = new Intent(this,BusTimeTable.class);
        startActivity(intent);
    }
*/

}

