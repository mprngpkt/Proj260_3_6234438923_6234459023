package com.example.olymbus;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ListFragment extends Fragment {

    public interface onMobileSelectedListener {
        public void onMobileSelected(String Model, int position);
    }

    onMobileSelectedListener mListener;
    String[] header;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        header = new String[] {"Swimming Final", "Swimming Prelim"};
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(getActivity(),
                R.layout.event_list, header);
        ListView listView = (ListView) getView().findViewById(R.id.listEvent);
        listView.setAdapter(dataAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                mListener.onMobileSelected(header[position], position);
            }
        });
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if(container == null){
            return null;
        }
        View view = inflater.inflate(R.layout.list_view, container, false);
        return view;
    }

    @Override
    public void onAttach(@NonNull Activity activity) {
        super.onAttach(activity);
        try{
            mListener = (onMobileSelectedListener) activity;
        } catch (ClassCastException e){
            throw new ClassCastException(activity.toString()+" must implement OnMobileListener");
        }
    }
}
