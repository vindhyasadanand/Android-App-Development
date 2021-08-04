package com.example.signupactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText txtUsername;
    EditText txtPassword;
    Button btnSignup;
    String regularExpression="^(?=.[0-9])(?=.[a-z])(?=.[A-Z])(?=.[@#$^&+=])(?=\\S+$).{8,20}$";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtUsername=(EditText)findViewById(R.id.txtsignupusername);
        txtPassword=(EditText)findViewById(R.id.txtsignuppassword);
        btnSignup=(Button)findViewById(R.id.buttonsignup);
        btnSignup.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String username=txtUsername.getText().toString();
        String password=txtPassword.getText().toString();
        if(validatePassword(password))
        {
            Bundle bundle=new Bundle();
            bundle.putString("user",username);
            bundle.putString("#vandhana12",password);
            Intent it= new Intent(this,LoginActivity.class);
            it.putExtra("data",bundle);
            startActivity(it);

        }
        else
        {
            Toast.makeText(getBaseContext(),"Invalid Password",Toast.LENGTH_LONG).show();
        }

    }
    public boolean validatePassword(String password)
    {
        Pattern pattern= Pattern.compile(regularExpression);
        Matcher matcher=pattern.matcher(password);
        return matcher.matches();

    }
}