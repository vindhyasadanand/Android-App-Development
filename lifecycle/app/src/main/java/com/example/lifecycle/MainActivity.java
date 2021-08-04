package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    String disp = "Activity Life cycle";
    Button btn;
    TextView txt1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(disp,"onCreate EXECUTED");
        btn = (Button)findViewById(R.id.button1);
        btn.setOnClickListener(this);
        txt1 = findViewById(R.id.txtview);

    }
    @Override
    protected void onRestart()
    {
        super.onRestart();
        Log.i(disp,"onRestart EXECUTED");
    }
    @Override
    protected void onStart()
    {
        super.onStart();
        Log.i(disp,"onStart EXECUTED");
    }

    @Override
    protected void onStop()
    {
        super.onStop();
        Log.i(disp,"onStop EXECUTED");
    }
    @Override
    protected void onResume()
    {
        super.onResume();
        Log.i(disp,"onResume EXECUTED");
    }
    @Override
    protected void onPause()
    {
        super.onPause();
        Log.i(disp,"onPause EXECUTED");
    }

    @Override
    public void onClick(View v) {
        Date date = new Date();
        txt1.setText("Todays date is: "+date.toString());
        Toast.makeText(getBaseContext(),"You pressed submit button",Toast.LENGTH_LONG).show();
    }
}