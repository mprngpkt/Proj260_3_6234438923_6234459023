package com.example.olymbus;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class SeatingPlan extends Fragment {
    Button btnBack;
    Button btnBook;
    TableLayout timeTable;
    //seat
    ImageButton btnseat1A;
    /*
    Button btnseat1B;
    Button btnseat2A;
    Button btnseat2B;
    Button btnseat3A;
    Button btnseat3B;
    Button btnseat4A;
    Button btnseat4B;
    Button btnseat5A;
    Button btnseat5B;
*/



    //เชื่อมกับ .xml เมื่อใช้ extends fragment
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.layout_seatingplan, container, false);

        TextView textView1=(TextView)v.findViewById(R.id.textTitle);
        textView1.setText("Bus 1");
        TextView textdetail = (TextView)v.findViewById(R.id.text_detail);
        textdetail.setText("Destination : Olympic Stadium \n Depart : 16:30");

        //TimeTable
        timeTable = v.findViewById(R.id.seatcolumn);

        //1A
       btnseat1A = v.findViewById (R.id.seat1A);
        btnseat1A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnseat1A.setSelected(true);
                Toast.makeText(getContext(),"Selected",Toast.LENGTH_SHORT).show();
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
                TimeTableForCeremony timeTableForCeremony = new TimeTableForCeremony();
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container, timeTableForCeremony).commit();

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

