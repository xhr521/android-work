package com.example.administrator.handlerthread;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Main extends Activity {
    private Button startButton=null;
    private Button endButton=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startButton=(Button)findViewById(R.id.start);
        startButton.setOnClickListener(new StartListener());
        endButton=(Button)findViewById(R.id.end);
        endButton.setOnClickListener(new EndListener());
    }
    Handler handler=new Handler();
    class StartListener implements OnClickListener{
        public void onClick(View v){
            handler.post(updateThread);
        }
    }
    class EndListener implements OnClickListener {
        public void onClick(View v) {
            handler.removeCallbacks(updateThread);
        }
    }
        Runnable updateThread=new Runnable() {
            @Override
            public void run() {
                System.out.println("updatethread");
                Log.v("tag","updatethread");
                handler.postDelayed(updateThread,1000);
            }
        };
    }


