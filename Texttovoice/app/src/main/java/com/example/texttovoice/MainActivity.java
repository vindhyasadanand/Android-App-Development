package com.example.texttovoice;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    EditText input;
    Button btnspeak;
        TextToSpeech textToSpeech;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input = (EditText) findViewById(R.id.edittxt);
          btnspeak = (Button) findViewById(R.id.button);
          btnspeak.setOnClickListener(this);
          textToSpeech = new TextToSpeech(getBaseContext(), new TextToSpeech.OnInitListener() {
              @Override
              public void onInit(int status) {
                  if(status!=TextToSpeech.ERROR)
                  {
                      Toast.makeText(getBaseContext(),"Sucess",Toast.LENGTH_LONG).show();
                  }
              }
          });
    }

    @Override
    public void onClick(View v)
    {
        String text = input.getText().toString();
        textToSpeech.speak(text,TextToSpeech.QUEUE_FLUSH,null);
    }
}