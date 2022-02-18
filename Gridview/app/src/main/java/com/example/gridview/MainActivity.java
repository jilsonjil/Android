package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
    GridView gv;
    int[] img={R.drawable.img1,R.drawable.img2,R.drawable.img3,R.drawable.img4};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gv=findViewById(R.id.gv);

        GridAd gridAd = new GridAd(this,img);
        gv.setAdapter(gridAd);
    }
}