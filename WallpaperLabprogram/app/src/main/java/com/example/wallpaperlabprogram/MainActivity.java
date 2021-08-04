package com.example.wallpaperlabprogram;

import androidx.appcompat.app.AppCompatActivity;

import android.app.WallpaperManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
   Button chgbtn;
    Boolean running=false;
    int imagesArray[] = new int[]{R.drawable.w1,R.drawable.w2,R.drawable.w3,R.drawable.w4};
    int i=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chgbtn = (Button) findViewById(R.id.btnchg);
        chgbtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(!running)
        {
            new Timer().schedule(new MyTimer(),0,3000);
            running = false;
        }
    }
    class MyTimer extends TimerTask
    {
       public void run()
        {
            try{
                {
                    WallpaperManager wallpaperManager = WallpaperManager.getInstance(getBaseContext());
                    if(i==2)
                    {
                        i=3;
                    }
                    if(i==3)
                    {
                        i=1;
                    }
                    if(i==1)
                    {
                        i=4;
                    }
                    if(i==4)
                    {
                        i=2;
                    }
                    wallpaperManager.setBitmap(BitmapFactory.decodeResource(getResources(),imagesArray[i]));
                }

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}