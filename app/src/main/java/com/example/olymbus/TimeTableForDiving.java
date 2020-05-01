
package com.example.olymbus;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class TimeTableForDiving extends Fragment {

    String[] timetable = {"Bus 1 \n Destination : Tokyo Aquatics Centre \n Depart : 08.00 "};
    //String[] timeTableDescription = {"Destination : Olympic Stadium \n Depart : 16:30 ","Destination : Olympic Stadium \n Depart : 17:00 ","Destination : Olympic Stadium \n Depart : 17:30 "};
//public static int getSize(){return 3;}

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.layout_bustimetable, container, false);

        TextView txt = (TextView)view.findViewById(R.id.txtBusTimeTable);
        txt.setText("Bus to Diving");


        ListView listView = (ListView) view.findViewById(R.id.bustimetable);

        //MyAdapter adapter = new MyAdapter(TimeTableForCeremony.this,timetable, timeTableDescription);

        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(
                getActivity(), android.R.layout.simple_list_item_1, timetable);
       // (current Activity, layout going to use to create the views that gonna show, Array of String )

        listView.setAdapter(listViewAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //if (position == 0) {
                   // Toast.makeText(getActivity(),"Bus 1 Selected",Toast.LENGTH_LONG).show(); //(current Activity,"message that you want to show",time that toast will show
                    SeatingPlan2_1 seatingPlan21 = new SeatingPlan2_1();
                    FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fragment_container, seatingPlan21).commit();
               /* } else if (position == 1) {
                     Toast.makeText(getActivity(),"Bus 2 Selected",Toast.LENGTH_LONG).show();
                    SeatingPlan1_2 seatingPlan12 = new SeatingPlan1_2();
                    FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fragment_container, seatingPlan12).commit();
                } else if (position == 2) {
                    Toast.makeText(getActivity(), "Bus 3 Selected", Toast.LENGTH_LONG).show();
                    SeatingPlan1_3 seatingPlan13 = new SeatingPlan1_3();
                    FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fragment_container, seatingPlan13).commit();
                }*/
            }
        });

        return view;

    }
}
/*
    class MyAdapter extends ArrayAdapter<String>{
        Context context;
        String rTitle[];
        String rDes[];

        MyAdapter(@NonNull Context context, String[] title, String[] description) {
            super(context ,R.layout.row_list,R.id.textTitle,title);
            this.context=context;
            this.rDes=description;
            this.rTitle=title;
        }



        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater) getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE) ;
            View row = layoutInflater.inflate(R.layout.row_list,parent,false);
            TextView mytitle = row.findViewById(R.id.textTitle);
            TextView mydescription = row.findViewById(R.id.descriptionTextView);

            mytitle.setText(rTitle[position]);
            mydescription.setText(rDes[position]);

            return row;
        }
    }
}
*/