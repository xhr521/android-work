package com.example.administrator.logacitivity;

/**
 * Created by Administrator on 2017/3/30.
 */
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class LogActivity2 extends Activity{
    private static final String LIFT_TAG="LogActivity";
    protected void onCreate(Bundle savedInstanceState){
        Log.v(LogActivity.LIFT_TAG, "SecondAcvity --->onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
    }
    protected void onDestroy() {
        Log.v(LogActivity.LIFT_TAG, "SecondAcvity --->onDestory");
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        Log.v(LogActivity.LIFT_TAG, "SecondAcvity --->onPause");
        super.onPause();
    }

    @Override
    protected void onRestart() {
        Log.v(LogActivity.LIFT_TAG, "SecondAcvity --->onRestart");
        super.onRestart();
    }

    @Override
    protected void onResume() {
        Log.v(LogActivity.LIFT_TAG, "SecondAcvity --->onResume");
        super.onResume();
    }

    @Override
    protected void onStart() {
        Log.v(LogActivity.LIFT_TAG, "SecondAcvity --->onstart");
        super.onStart();
    }

    @Override
    protected void onStop() {
        Log.v(LogActivity.LIFT_TAG, "SecondAcvity --->onStop");
        super.onStop();
    }
}

