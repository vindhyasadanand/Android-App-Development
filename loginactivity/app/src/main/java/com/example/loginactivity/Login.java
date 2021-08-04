package com.example.loginactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity implements View.OnClickListener{



        EditText textloginusername,textloginpassword;
        Button btnlogin;
        String user,pass;

        int count=0;

        @Override
        protected void onCreate(Bundle savedInstanceState)
        {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_login);

            textloginusername = (EditText) findViewById(R.id.username);
            textloginpassword = (EditText) findViewById(R.id.password);
            btnlogin = findViewById(R.id.login);
            btnlogin.setOnClickListener(this);
            Bundle bundle = getIntent().getExtras();
            user = bundle.getString("user");
            pass = bundle.getString("Cse@*123#");



        }

    @Override
    public void onClick(View view)
    {
       String user1 = textloginusername.getText().toString();
       String pass1 = textloginpassword.getText().toString();
       if(user.equals(user1)&& pass.equals(pass1))
       {
           Toast.makeText(this,"Login Successful",Toast.LENGTH_LONG).show();
       }
       else
       {
            count++;
            if(count==3)
            {
                btnlogin.setEnabled(false);
                Toast.makeText(this,"Failed Login Attempts",Toast.LENGTH_LONG).show();
            }
            else
            {
                Toast.makeText(this,"Login Failed" + count,Toast.LENGTH_LONG).show();
            }
       }
    }
}