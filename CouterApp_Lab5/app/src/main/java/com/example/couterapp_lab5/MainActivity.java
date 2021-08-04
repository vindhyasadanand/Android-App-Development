package com.example.couterapp_lab5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    TextView lblcnt;
    Button btnstart,btnstop;
    int counter=0;
    boolean running = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lblcnt = (TextView)findViewById(R.id.label);
        btnstart = (Button)findViewById(R.id.btnstop);
        btnstop = (Button) findViewById(R.id.btnstart);
        btnstart.setOnClickListener(this);
        btnstop.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.equals(btnstart))
        {
            counter=0;
            running = true;
            new MyCounter().start();
        }
        else
        {
            running = false;
        }
    }
    Handler handler = new Handler()
    {
        public void handleMessage(Message m)
        {
            lblcnt.setText(String.valueOf(m.what));
        }

    };
    class MyCounter extends Thread
    {
        public void run()
        {
            while(running)
            {
                counter++;
                handler.sendEmptyMessage(counter);
                try{
                    Thread.sleep(1000);
                }
                catch (Exception e)
                {

                }
            }
        }
    }
}