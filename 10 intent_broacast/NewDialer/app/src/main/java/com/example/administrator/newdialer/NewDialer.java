package com.example.administrator.newdialer;

import android.app.Activity;
import android.os.Bundle;
import android.net.Uri;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class NewDialer extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_dialer);

        final Button btn=(Button)findViewById(R.id.btn1);
        btn.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                Intent I=new Intent(Intent.ACTION_DIAL,Uri.parse("tel://114"));
                startActivity(I);
            }
        });
    }
}
