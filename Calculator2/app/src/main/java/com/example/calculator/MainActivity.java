package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    EditText textresult;
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,ba,bs,bm,bd,beq,bc,bdot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b0 = (Button) findViewById(R.id.btnzero);
        b0.setOnClickListener(this);
        b1 = (Button) findViewById(R.id.btn1);
        b1.setOnClickListener(this);
        b2 = (Button) findViewById(R.id.btn2);
        b2.setOnClickListener(this);
        b3 = (Button) findViewById(R.id.btn3);
        b3.setOnClickListener(this);
        b4 = (Button) findViewById(R.id.btn4);
        b4.setOnClickListener(this);
        b5 = (Button) findViewById(R.id.btn5);
        b5.setOnClickListener(this);
        b6 = (Button) findViewById(R.id.btn6);
        b6.setOnClickListener(this);
        b7 = (Button) findViewById(R.id.btn7);
        b7.setOnClickListener(this);
        b8 = (Button) findViewById(R.id.btn8);
        b8.setOnClickListener(this);
        b9 = (Button) findViewById(R.id.btn9);
        b9.setOnClickListener(this);
        ba = (Button) findViewById(R.id.btnplus);
        ba.setOnClickListener(this);
        bs = (Button) findViewById(R.id.btnsub);
        bs.setOnClickListener(this);
        bm = (Button) findViewById(R.id.btnmul);
        bm.setOnClickListener(this);
        bd = (Button) findViewById(R.id.btndiv);
        bd.setOnClickListener(this);
        beq = (Button) findViewById(R.id.btneql);
        beq.setOnClickListener(this);
        bc = (Button) findViewById(R.id.btnclear);
        bc.setOnClickListener(this);
        bdot = (Button) findViewById(R.id.btndot);
        bdot.setOnClickListener(this);
        textresult =(EditText) findViewById(R.id.txtres);
        textresult.setText("");
    }

    @Override
    public void onClick(View v) {
       if(v.equals(b0))
       {
           textresult.append("0");
       }
        if(v.equals(b1))
        {
            textresult.append("1");
        }
        if(v.equals(b2))
        {
            textresult.append("2");
        }
        if(v.equals(b3))
        {
            textresult.append("3");
        }
        if(v.equals(b4))
        {
            textresult.append("4");
        }
        if(v.equals(b5))
        {
            textresult.append("5");
        }
        if(v.equals(b6))
        {
            textresult.append("6");
        }
        if(v.equals(b7))
        {
            textresult.append("7");
        }
        if(v.equals(b8))
        {
            textresult.append("8");
        }
        if(v.equals(b9))
        {
            textresult.append("9");
        }
        if(v.equals(bc))
        {
            textresult.setText("");
        }
        if(v.equals(ba))
        {
            textresult.append("+");
        }
        if(v.equals(bs))
        {
            textresult.append("-");
        }
        if(v.equals(bd))
        {
            textresult.append("/");
        }
        if(v.equals(bm))
        {
            textresult.append("*");
        }
        if(v.equals(bdot))
        {
            textresult.append(".");
        }
        if(v.equals(beq))
        {
            try {
                String data = textresult.getText().toString();
                if (data.contains("/"))
                {
                    String[] operands = data.split("/");
                    if (operands.length == 2)
                    {
                        double operand1 = Double.parseDouble(operands[0]);
                        double operand2 = Double.parseDouble(operands[1]);
                        double result = operand1 / operand2;
                        textresult.setText(String.valueOf(result));

                    }
                    else {
                        Toast.makeText(getBaseContext(), "Invalid Input", Toast.LENGTH_LONG).show();
                    }
                }




        else if (data.contains("*")) {
                String[] operands = data.split(Pattern.quote("*"));
                if (operands.length == 2) {
                    double operand1 = Double.parseDouble(operands[0]);
                    double operand2 = Double.parseDouble(operands[1]);
                    double result = operand1 * operand2;
                    textresult.setText(String.valueOf(result));
                } else {
                    Toast.makeText(getBaseContext(), "Invalid Input", Toast.LENGTH_LONG).show();
                }
            } else if (data.contains("+")) {
                String[] operands = data.split(Pattern.quote("+"));
                if (operands.length == 2) {
                    double operand1 = Double.parseDouble(operands[0]);
                    double operand2 = Double.parseDouble(operands[1]);
                    double result = operand1 + operand2;
                    textresult.setText(String.valueOf(result));
                } else {
                    Toast.makeText(getBaseContext(), "Invalid Input", Toast.LENGTH_LONG).show();
                }
            } else if (data.contains("-")) {
                String[] operands = data.split("-");
                if (operands.length == 2) {
                    double operand1 = Double.parseDouble(operands[0]);
                    double operand2 = Double.parseDouble(operands[1]);
                    double result = operand1 - operand2;
                    textresult.setText(String.valueOf(result));
                } else {
                    Toast.makeText(getBaseContext(), "Invalid Input", Toast.LENGTH_LONG).show();
                }
            }
        }
        catch(NumberFormatException e)
        {
           Toast.makeText(getBaseContext(),"Invalid Input",Toast.LENGTH_LONG).show();
        }
    }
}
}