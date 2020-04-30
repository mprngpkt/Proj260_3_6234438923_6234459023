package com.example.olymbus;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class HomeFragment extends Fragment {

    private Button startButton;
    private TextView textView;

    @Nullable
    @Override
    public View onCreateView(@NonNull final LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);

        startButton = (Button) view.findViewById(R.id.homeButton);

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), EventListActivity.class);
                startActivity(in);
            }

        /*String[] eventItems = {"Ceremony Opening Ceremony", "Athletics Marathon Final",
                "Swimming Preliminary", "Swimming Freestyle/Medley", "Diving Springboard Semifinal",
                "Diving Synchronized 3m Springboard Final", "Diving 10m Platform Semifinal",
                "Weightlifting 40 kg Group B", "Weightlifting 76 kg Group B", "Weightlifting 109 kg Group B",
                "Weightlifting 109 kg Group A & Victory Ceremony"};*/
        //final ListView listView = view.findViewById(R.id.eventListView);

        });

/*        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1,eventItems);
        listView.setAdapter(listViewAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                    case 1: textView.setText("Click 2");
                    case 3: textView.setText("Click 3");

                }

            }
        });*/
        return view;
    };

}


