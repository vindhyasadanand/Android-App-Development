package com.example.find_my_phone;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class RunithOS  extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {



            if (intent.getAction().equalsIgnoreCase("android.intent.action.BOOT_COMPLETED")){


                /// only when system start
                Intent intentService=new Intent(context,MyServie.class);
                context. startService(intentService);
            }
        }
}
