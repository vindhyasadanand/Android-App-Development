package com.example.loginactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    EditText textusername, textpassword;
    Button signUpBtn;

    String regularExpr = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!])[A-Za-z\\d@$!]{8,}$";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textusername = findViewById(R.id.username);

        textpassword= findViewById(R.id.password);
        signUpBtn = findViewById(R.id.signup);

        signUpBtn.setOnClickListener( this);
    }

    @Override
    public void onClick(View view) {

        String username = textusername.getText().toString();
        String password = textpassword.getText().toString();
        if(validpassword(password))
        {
            Bundle bundle = new Bundle();
            bundle.putString("user",username);
            bundle.putString("Cse@*123#",password);
            Intent it = new Intent(this,Login.class);
            it.putExtra("data",bundle);
        }
        else
        {
            Toast.makeText(getBaseContext(),"Invalid Password",Toast.LENGTH_LONG).show();
        }


    }

    public boolean validpassword(String password)
    {
       Pattern pattern = Pattern.compile(regularExpr);
       Matcher matcher = pattern.matcher(password);
       return matcher.matches();
    }
}