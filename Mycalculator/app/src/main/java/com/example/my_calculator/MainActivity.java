package com.example.my_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //Button btnadd,btnsub,btnmul,btndiv;
    EditText edtxt1,edtxt2,edtxt3;
    TextView txtres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtxt1 = (EditText)findViewById(R.id.ptxt1);
        edtxt1.setOnClickListener(this);
        edtxt2 =(EditText) findViewById(R.id.head);
        edtxt2.setOnClickListener(this);
        txtres = (TextView)findViewById(R.id.txtview);
        txtres.setOnClickListener(this);
       edtxt3 = (EditText)findViewById(R.id.ptxt3);
       edtxt3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        int num1,num2,res;
        num1 = Integer.parseInt(edtxt1.getText().toString());
        num2 = Integer.parseInt(edtxt2.getText().toString());
        String op = edtxt3.getText().toString();

        switch (op)
        {
            case "+": res = num1+num2;
                      txtres.setText(Integer.toString(res));
                      break;
            case "-": res = num1-num2;
                     txtres.setText(Integer.toString(res));
                      break;
            case "*": res = num1*num2;
                     txtres.setText(Integer.toString(res));
                     break;
            case "/": res = num1/num2;
                      txtres.setText(Integer.toString(res));
                        break;


        }
    }
}