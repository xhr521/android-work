package com.example.administrator.newdialer;

import android.app.Activity;
import android.os.Bundle;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.telephony.PhoneNumberUtils;
import android.content.Intent;

public class NewDialer_1 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_dialer_1);
        final EditText phoneNum=(EditText)findViewById(R.id.phoneNum);
        final Button btn=(Button)findViewById(R.id.btn1);
        btn.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                String call=phoneNum.getText().toString();
                if (PhoneNumberUtils.isGlobalPhoneNumber(call)) {
                Intent I=new Intent(Intent.ACTION_DIAL,Uri.parse("tel://"+call));
                    startActivity(I);
                }else{
                Toast.makeText(NewDialer_1.this,"您输入的号码不正确，请重新输入",Toast.LENGTH_LONG).show();;
                 }
             }
        });
    }
}
