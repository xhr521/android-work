package com.example.administrator.handlermessageprogess;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ProgressBar;

public class handlerMessageprogess extends Activity {
    ProgressBar bar=null;
    Button startbtn=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handler_messageprogess);
        bar=(ProgressBar)findViewById(R.id.bar);
        startbtn=(Button)findViewById(R.id.start);
        startbtn.setOnClickListener(new ButtonListener());
    }
    class ButtonListener implements OnClickListener{
        public void onClick(View v){
            bar.setVisibility(View.VISIBLE);
            updataBarHandler.post(updataThread);
        }
    }
    Handler updataBarHandler=new Handler(){
        public void handleMessage(Message msg){
            bar.setProgress(msg.arg1);
            updataBarHandler.post(updataThread);
        }
    };
    Runnable updataThread=new Runnable() {
        int i=0;
        @Override
        public void run() {
           System.out.println("start thread");
            i=i+10;
            Message msg=updataBarHandler.obtainMessage();
            msg.arg1=i;
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            updataBarHandler.sendMessage(msg);
            if(i==100){
                updataBarHandler.removeCallbacks(updataThread);
            }

        }
    };
}
