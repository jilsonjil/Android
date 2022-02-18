package com.example.exception;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday","Friday","Saturday"};
    Button but;
    int size=-1;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        but = findViewById(R.id.button);

        tv = findViewById(R.id.textView3);

        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                size++;
                try {

                    Toast.makeText(getApplicationContext(), week[size], Toast.LENGTH_SHORT).show();
                    tv.setText(tv.getText().toString()+"\n"+week[size]);

                } catch (ArrayIndexOutOfBoundsException e) {

                    e.printStackTrace();
                    Toast.makeText(getApplicationContext(), "Caught Exception: Only  7 Days allowed", Toast.LENGTH_LONG).show();

                }
            }
        });

    }
}