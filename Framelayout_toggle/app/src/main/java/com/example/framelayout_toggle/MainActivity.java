package com.example.framelayout_toggle;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imgView;
    Button btn;

    int[] images = { R.drawable.burj2,R.drawable.burj3};
    int currentIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();

        imgView.setImageResource(images[0]);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggle();
            }
        });

    }

    private void initUI() {
        imgView = findViewById(R.id.imgview);
        btn = findViewById(R.id.btn);
    }

    private void toggle() {
        switch (currentIndex) {


            case 0:
                imgView.setImageResource(images[1]);
                currentIndex = 1;
                break;
            case 1:
                imgView.setImageResource(images[0]);
                currentIndex = 0;
                break;
        }
    }
}