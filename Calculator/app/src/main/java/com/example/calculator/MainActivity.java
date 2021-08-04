package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnadd;
    EditText editt1,editt2;
    TextView txtres;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnadd = (Button)findViewById(R.id.button1);
        btnadd.setOnClickListener(this);
        editt1 = (EditText)findViewById(R.id.edittxt1);
        editt1.setOnClickListener(this);
        editt2 = (EditText) findViewById(R.id.edittxt2);
        editt2.setOnClickListener(this);
        txtres = (TextView)findViewById(R.id.textView);
        txtres.setOnClickListener(this);


    }

    @Override
    public void onClick(View v)
    {
       int num1,num2,sum;
       num1 = Integer.parseInt(editt1.getText().toString());
       num2 = Integer.parseInt(editt2.getText().toString());
       sum = num1+num2;
       txtres.setText("Result is: "+Integer.toString(sum));
    }
}