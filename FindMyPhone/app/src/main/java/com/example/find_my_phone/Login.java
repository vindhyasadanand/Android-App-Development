package com.example.find_my_phone;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {
    EditText EDTNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        EDTNumber=(EditText)findViewById(R.id.EDTNumber);
    }

    public void BuNext(View view) {

        GlobalInfo.PhoneNumber=GlobalInfo.FormatPhoneNumber(EDTNumber.getText().toString());
        GlobalInfo.UpdatesInfo(GlobalInfo.PhoneNumber);
        finish();
        Intent intent=new Intent(this, MyTrackers.class);
        startActivity(intent);
    }
}