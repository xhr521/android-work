package com.example.administrator.intenreceiver;

/**
 * Created by Administrator on 2017/4/27.
 */
import android.content.Intent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.util.Log;

public class OtherActivity extends BroadcastReceiver {
    public void onReceive(Context context,Intent intent){
        String value=intent.getStringExtra("testIntent");
        Log.e("IntentReceiver-->Test",value);
    }
}
