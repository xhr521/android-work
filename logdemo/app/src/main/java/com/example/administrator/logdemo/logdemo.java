package com.example.administrator.logdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class logdemo extends AppCompatActivity {
    private static final String ACTIVITY_TAG="logdemo";
    private Button but;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logdemo);

        but =(Button)findViewById(R.id.but);
        but.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                Log.v(logdemo.ACTIVITY_TAG,"This is Verbose.");
                Log.d(logdemo.ACTIVITY_TAG,"This is Debug.");
                Log.i(logdemo.ACTIVITY_TAG,"This is Information.");
                Log.w(logdemo.ACTIVITY_TAG,"This is Warnning.");
                Log.e(logdemo.ACTIVITY_TAG,"This is Error.");
            }
        });
    }
}
