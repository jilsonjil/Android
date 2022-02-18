package com.example.sharedpre;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView fname,lname,gender;
    Button btnFetch;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initUI();

        btnFetch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fetchData();
            }
        });

    }
    private void initUI()
    {
        fname=findViewById(R.id.viewfname);
        lname=findViewById(R.id.viewlname);
        gender=findViewById(R.id.viewgender);
        btnFetch=findViewById(R.id.button);
    }

    private void fetchData()
    {
        SharedPreferences sharedPref = getSharedPreferences("MY_PREF", Context.MODE_PRIVATE);

        fname.setText(sharedPref.getString("FNAME",""));
        lname.setText(sharedPref.getString("LNAME",""));
        gender.setText(sharedPref.getString("GENDER",""));

    }


}