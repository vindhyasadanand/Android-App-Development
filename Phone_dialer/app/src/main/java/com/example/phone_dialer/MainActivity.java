package com.example.phone_dialer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,bhash,bstar,btnsave,btncall,btndel;
    EditText textphonenum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b0 = (Button) findViewById(R.id.btn0);
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
        bhash = (Button) findViewById(R.id.btnhash);
        bhash.setOnClickListener(this);
        bstar = (Button) findViewById(R.id.btnstar);
        bstar.setOnClickListener(this);
        btnsave = (Button) findViewById(R.id.btnsave);
        btnsave.setOnClickListener(this);
        btncall = (Button) findViewById(R.id.btncall);
        btncall.setOnClickListener(this);
        textphonenum = (EditText) findViewById(R.id.edttxt);
        textphonenum.setText("");
        btndel = (Button)findViewById(R.id.btndel);
        btndel.setOnClickListener(this);

    }

    @Override
    public void onClick(View v)
    {
        if(v.equals(b0))
        {
            textphonenum.append("0");
        }
        else if(v.equals(b1))
        {
            textphonenum.append("1");
        }
        else if(v.equals(b2))
        {
            textphonenum.append("2");
        }
        else if(v.equals(b3))
        {
            textphonenum.append("3");
        }
        else if(v.equals(b4))
        {
            textphonenum.append("4");
        }
        else if(v.equals(b5))
        {
            textphonenum.append("5");
        }
        else if(v.equals(b6))
        {
            textphonenum.append("6");
        }
        else if(v.equals(b7))
        {
            textphonenum.append("7");
        }
        else if(v.equals(b8))
        {
            textphonenum.append("8");
        }
        else if(v.equals(b9))
        {
            textphonenum.append("9");
        }
        else if(v.equals(bhash))
        {
            textphonenum.append("#");
        }
        else if(v.equals(bstar))
        {
            textphonenum.append("*");
        }
        else if(v.equals(btnsave))
        {
            Intent contactIntent =
                    new Intent(ContactsContract.Intents.Insert.ACTION);
            contactIntent.setType(ContactsContract.RawContacts.CONTENT_TYPE);
            contactIntent.putExtra(ContactsContract.Intents.Insert.NAME,"Unknown");
            contactIntent.putExtra(ContactsContract.Intents.Insert.PHONE,textphonenum.getText().toString());
            startActivity(contactIntent);
        }
        else if(v.equals(btndel))
        {
            String data = textphonenum.getText().toString();
            if(data.length()>0)
            {
                textphonenum.setText(data.substring(0,data.length()-1));
            }
            else
            {
                textphonenum.setText("");
            }
        }
    btncall.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String data = textphonenum.getText().toString();
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:"+data));
            startActivity(intent);
        }
    });
    }
}