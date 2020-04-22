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
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class HomeFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home,container,false);

        String [] eventMenu = {"Swimming 1","Swimming 2","Swimming 3"};

        ListView listView = view.findViewById(R.id.eventListView);
        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>( getActivity() ,
                android.R.layout.simple_list_item_1 , eventMenu);
        listView.setAdapter(listViewAdapter);

/*        listView.setOnClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                }
            }
        });*/

        return view;
    }
}
