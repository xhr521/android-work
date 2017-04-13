package com.example.administrator.dialogprogress;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class DialogProgress extends Activity{

    private ProgressBar onebar=null;
    private ProgressBar twobar=null;
    private Button mybtn=null;
    private int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        onebar=(ProgressBar)findViewById(R.id.onebar);
        twobar=(ProgressBar)findViewById(R.id.twobar);
        mybtn=(Button)findViewById(R.id.mybtn);
        mybtn.setOnClickListener(new ButtonListener());
    }

    class ButtonListener implements OnClickListener{
        public void onClick(View v){
            if (i==0){
                onebar.setVisibility(View.VISIBLE);
                twobar.setVisibility(View.VISIBLE);
                onebar.setMax(100);
            }else if(i<onebar.getMax()){
                TextView textView=(TextView)findViewById(R.id.text);
                textView.setText("不要急，多续一秒~");
                onebar.setProgress(i);
                onebar.setSecondaryProgress(i+10);
            }else {
                TextView textView=(TextView)findViewById(R.id.text);
                textView.setText("续完了");
                Button btn=(Button)findViewById(R.id.mybtn);
                btn.setText("再见~");
                onebar.setVisibility(View.GONE);
                twobar.setVisibility(View.GONE);
            }   i=i+10;
        }
    }
}
