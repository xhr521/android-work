package com.example.administrator.logacitivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class LogActivity extends AppCompatActivity {
    private Button mybtn;
    static final String LIFT_TAG = "LogActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Log.v(LogActivity.LIFT_TAG, "FirstActivity ---> onCreate");
        Button mybtn = (Button) findViewById(R.id.mybtn);
        mybtn.setText("Activity");
        mybtn.setOnClickListener(new ButtonOnClickListener());
    }

    class ButtonOnClickListener implements OnClickListener {
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.setClass(LogActivity.this, LogActivity2.class);
            LogActivity.this.startActivity(intent);
        }
    }


    protected void onDestroy() {
        Log.v(LogActivity.LIFT_TAG, "FirstAcvity --->onDestory");
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        Log.v(LogActivity.LIFT_TAG, "FirstAcvity --->onPause");
        super.onPause();
    }

    @Override
    protected void onRestart() {
        Log.v(LogActivity.LIFT_TAG, "FirstAcvity --->onRestart");
        super.onRestart();
    }

    @Override
    protected void onResume() {
        Log.v(LogActivity.LIFT_TAG, "FirstAcvity --->onResume");
        super.onResume();
    }

    @Override
    protected void onStart() {
        Log.v(LogActivity.LIFT_TAG, "FirstAcvity --->onstart");
        super.onStart();
    }

    @Override
    protected void onStop() {
        Log.v(LogActivity.LIFT_TAG, "FirstAcvity --->onStop");
        super.onStop();
    }
}