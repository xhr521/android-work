package com.example.administrator.intenreceiver;

import android.app.Activity;
import android.os.Bundle;
import android.net.Uri;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class IntenReceiver extends Activity {

    private Button btn=null;
    private final String nobody="Who.care.the.name";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inten_receiver);
        btn=(Button)findViewById(R.id.btn);
        btn.setOnClickListener(new btnListener());
    }
    class btnListener implements OnClickListener{
        public void onClick(View v){
            Intent intent=new Intent(nobody);
            intent.putExtra("testIntent","5221");
            sendBroadcast(intent);
        }
    }
}
