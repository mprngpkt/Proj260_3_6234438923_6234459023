
package com.example.olymbus;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class EventListActivity extends AppCompatActivity {

    ListView listView;
    String mTitle[] = {"Ceremony", "Athletic", "Swimming", "Swimming", "Diving", "Diving",
            "Diving", "Weightlifting", "Weightlifting", "Weightlifting", "Weightlifting"};
    String mDescription[] = {"Opening Ceremony", "Marathon Final", "Preliminary", "Freestyle/Medley Final",
            "Springboard Semifinal", "Synchronized 3m Springboard Final", "10m Platform Semifinal",
            "40 kg Group B", "76 kg Group B", "+109 kg Group B", "+109 kg Group A & Victory Ceremony"};
    int icon[] = {R.drawable.icon, R.drawable.icon, R.drawable.icon, R.drawable.icon, R.drawable.icon, R.drawable.icon,
            R.drawable.icon, R.drawable.icon, R.drawable.icon, R.drawable.icon, R.drawable.icon};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_list);

        listView = findViewById(R.id.eventListView);

        MyAdapter adapter = new MyAdapter( this, mTitle, mDescription, icon);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
                                            @Override
                                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                                Intent in = new Intent(getApplicationContext(), Ceremony.class);
                                                in.putExtra("com.example.ITEM_INDEX", position);
                                                startActivity(in);
                                            }
                                        }
        );
    }

    class MyAdapter extends ArrayAdapter<String>{
        Context context;
        String rTitle[];
        String rDescription[];
        int rImg[];

        MyAdapter(Context c, String title[], String description[], int img[]){
            super(c, R.layout.row_list, R.id.rowTitleTextView, title);
            this.context = c;
            this.rTitle = title;
            this.rDescription = description;
            this.rImg = img;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.row_list, parent, false);
            ImageView images = row.findViewById(R.id.event_icon);
            TextView myTitle = row.findViewById(R.id.rowTitleTextView);
            TextView myDescription = row.findViewById(R.id.rowDescriptionTextView);

            images.setImageResource(icon[position]);
            myTitle.setText(mTitle[position]);
            myDescription.setText(mDescription[position]);

            return super.getView(position, convertView, parent);
        }
    }

}
