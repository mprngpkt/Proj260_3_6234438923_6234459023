package com.example.olymbus;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class BusTimeTable extends AppCompatActivity {
    ListView lsv;
    String content;
    String[] lstitle;
    ArrayAdapter<String> adapter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.fragment_bustimetable);

        lsv = (ListView)findViewById(R.id.listview_bustimetable); //ติดกับลิสวิวบนหน้าจอ

        //เก็บข้อความ
        lstitle = new String[]
                {"A","B"};

        //ใช้ArrayAdapter แปลข้อมูลในตัวแปรสตริงอาร์เรย์
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_2,
                android.R.id.text1,lstitle);
        lsv.setAdapter(adapter);

        lsv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                content = (String) parent.getItemAtPosition(position);

                Toast.makeText(getApplicationContext(),"Item value is : "+content,Toast.LENGTH_LONG).show();
            }
        });
    }
}
