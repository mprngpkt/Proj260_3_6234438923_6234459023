package com.example.olymbus;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class DetailFragment extends Fragment {

    int p;
    String[] article;
    String[] title;
    int[] image;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        title = new String[] {"Swimming Final", "Swimming Prelim"};
        image = new int[] {R.drawable.swim_final, R.drawable.swim_prelim};
        showDetail(p);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.detail_view,container,false);
        return view;
    }

    public void showDetail(int position) {
        TextView tvtitle = (TextView) getView().findViewById(R.id.Sub_title);
        tvtitle.setText(title[position]);
        ImageView imgflag = (ImageView) getView().findViewById(R.id.event_icon);
        imgflag.setImageResource(image[position]);
    }

}
