
package com.example.olymbus;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class TimeTableFragment extends Fragment {


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.layout_bustimetable,container,false);

        String[] timetable = {"time 1","time 2"};

        ListView listView = (ListView) view.findViewById(R.id.bustimetable);


        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(
                getActivity(),android.R.layout.simple_list_item_1,timetable);
        //(current Activity , layout going to use to create the views that gonna show , Array of String )

        listView.setAdapter(listViewAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                   // Toast.makeText(getActivity(),"time 1",Toast.LENGTH_SHORT).show(); //(current Activity,"message that you want to show",time that toast will show
                }
                else if (position == 1){
                   // Toast.makeText(getActivity(),"time 2",Toast.LENGTH_SHORT).show();

                }

            }
        });

        return   view;

    }
}
