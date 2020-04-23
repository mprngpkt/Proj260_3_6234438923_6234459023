package com.example.olymbus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.Display;
import android.widget.ImageView;

public class EventDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_detail_acitivity);

        Intent in = getIntent();
        int index = in.getIntExtra("com.example.ITEM_INDEX" , -1);

        if (index > -1) {
            int pic = getImg(index);
            ImageView img = (ImageView) findViewById(R.id.detailImageView);
            scaleImg(img, pic);
        }
    }

    private int getImg(int index){
        switch(index){
            case 0: return R.drawable.swim_prelim;
            case 1: return R.drawable.swim_final;
            default: return -1;
        }
    }
    private void scaleImg(ImageView img, int pic){
        Display screen = getWindowManager( ).getDefaultDisplay() ;
        BitmapFactory.Options options = new BitmapFactory.Options();

        options. inJustDecodeBounds = true;
        BitmapFactory.decodeResource(getResources(), pic, options);
        int imgWidth = options.outWidth;
        int screenWidth = screen.getWidth() ;
        if (imgWidth > screenWidth) {
            int ratio = Math.round((float) imgWidth / (float) screenWidth);
            options.inSampleSize = ratio;
        }

        options.inJustDecodeBounds = false;
        Bitmap scaledImg = BitmapFactory.decodeResource(getResources(), pic, options);
        img.setImageBitmap(scaledImg);

        }


}
