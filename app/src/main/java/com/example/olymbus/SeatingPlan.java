package com.example.olymbus;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;

public class SeatingPlan extends Fragment {
    Button btnBack;
    Button btnBook;
    TableLayout timeTable;
    //seat
    Button btnseat1A;
    Button btnseat1B;
    Button btnseat2A;
    Button btnseat2B;
    Button btnseat3A;
    Button btnseat3B;
    Button btnseat4A;
    Button btnseat4B;
    Button btnseat5A;
    Button btnseat5B;




    //เชื่อมกับ .xml เมื่อใช้ extends fragment
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.layout_seatingplan, container, false);

        //TimeTable
        timeTable = (TableLayout) v.findViewById(R.id.seatcolumn);

        TableRow tableRow = new TableRow(getActivity());
        tableRow.setLayoutParams(new TableLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.MATCH_PARENT));
        tableRow.addView(btnseat1A);
        //1A
        btnseat1A = v.findViewById (R.id.seat1A);
        btnseat1A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnseat1A.didTouchFocusSelect();
                //Toast.makeText("Selected",Toast.LENGTH_SHORT).show();
            }
        });
        /*1B
        btnseat1B = v.findViewById(R.id.seat1B);
        btnseat1B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
           */

        //back
        btnBack = (Button) v.findViewById(R.id.btnBack);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), BusTimeTable.class);
                startActivity(intent);
            }
        });

        //book with alert dialog
        btnBook = (Button) v.findViewById(R.id.btnBook);
        btnBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialog =new AlertDialog.Builder(getContext());
                alertDialog.setMessage("Hey");
                alertDialog.setNeutralButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getContext(),"Good",Toast.LENGTH_SHORT).show();
                    }
                });
                alertDialog.show();

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

