package com.example.validation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText fname,usname,mail,pswrd,cpswrd;
    RadioGroup radioGroup;
    RadioButton m,f;
    CheckBox agree;
    Switch member;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ui();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validation();



            }
        });

    }
    public void ui()
    {
        fname=findViewById(R.id.fullname);
        mail=findViewById(R.id.email);
        usname=findViewById(R.id.uname);
        pswrd=findViewById(R.id.password);
        cpswrd=findViewById(R.id.confirmpass);
        radioGroup=findViewById(R.id.radioGroup);
        member=findViewById(R.id.switch1);
        agree=findViewById(R.id.checkBox);
        button=findViewById(R.id.register);


    }
    private void validation()
    {
        boolean isValid=false;
        String name=fname.getText().toString();
        String email=mail.getText().toString();
        String user=usname.getText().toString();
        String pass=pswrd.getText().toString();
        String cpass=cpswrd.getText().toString();
        if(name.equals(""))
        {
            Toast.makeText(this, "Please enter Your name", Toast.LENGTH_SHORT).show();
        }
        else if(email.equals(""))
        {
            Toast.makeText(this, "Please enter Your Email", Toast.LENGTH_SHORT).show();
        }
        else if(user.equals(""))
        {
            Toast.makeText(this, "Please enter Your User name", Toast.LENGTH_SHORT).show();
        }
        else if(pass.length()<5)
        {
            Toast.makeText(this, "Please enter Your Password or Password should have at least 5 ", Toast.LENGTH_SHORT).show();
        }
        else if( !cpass.equals(pass))
        {
            Toast.makeText(this, "Please Check your confirm password", Toast.LENGTH_SHORT).show();
        }
        else if(!member.isChecked())
        {
            Toast.makeText(this, "New member?", Toast.LENGTH_SHORT).show();
        }
        else if(!agree.isChecked())
        {
            Toast.makeText(this, "Please tick agree", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this, "Registration success", Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(getApplicationContext(),MainActivity2.class);
            startActivity(intent);
        }

    }
}