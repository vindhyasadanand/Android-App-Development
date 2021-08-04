package com.example.signupactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{

    EditText txtLoginUsername;
    EditText txtLoginPassword;
    Button btnlogin;
    String user,pass;
    int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        txtLoginUsername = (EditText) findViewById(R.id.txtloginuser);
        txtLoginPassword = (EditText) findViewById(R.id.txtloginpass);
        btnlogin = (Button) findViewById(R.id.buttonlogin);
        btnlogin.setOnClickListener(this);

        Bundle bundle = getIntent().getBundleExtra("data");
        user = bundle.getString("user");
        pass = bundle.getString("#vandhana12");
    }


    @Override
    public void onClick(View v) {
        String user1=txtLoginUsername.getText().toString();
        String pass1=txtLoginPassword.getText().toString();
        if(user.equals(user1)&& pass.equals(pass1)) {
            Toast.makeText(this, "Login Successful"
                    , Toast.LENGTH_LONG).show();
        }
        else
        {
            count++;
            if(count==3)
            {
                btnlogin.setEnabled(false);
                Toast.makeText(this,"Failed Login Attempts"
                        ,Toast.LENGTH_LONG).show();
            }
            else
            {
                Toast.makeText(this,"Login Failed"+count
                        ,Toast.LENGTH_LONG).show();

            }




        }
    }
}