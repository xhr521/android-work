package com.example.administrator.xmltest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.view.View.OnClickListener;

public class xmltest extends AppCompatActivity {

    RadioButton r1 = null;
    RadioButton r2 = null;
    RadioButton r3 = null;
    RadioButton r4 = null;
    RadioGroup rg = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xmltest);
        rg = (RadioGroup) findViewById(R.id.radioGroup);
        r1 =(RadioButton) findViewById(R.id.a);
        r2 =(RadioButton) findViewById(R.id.b);
        r3 =(RadioButton) findViewById(R.id.c);
        r4 =(RadioButton) findViewById(R.id.d);
        r1.setClickable(true);


        Button btn1 =(Button)findViewById(R.id.sure);
        Button btn2 =(Button)findViewById(R.id.cancel);
        btn1.setOnClickListener(new btn1());
        btn2.setOnClickListener(new btn2());
    }

    class btn1 implements OnClickListener{
        @Override
        public void onClick(View v) {
            String ans="";
            if(r1.isChecked()){
                ans="海晨";
            }else if(r2.isChecked()){
                ans="浩霖";
            }else if(r3.isChecked()){
                ans="立明";
            }else if(r4.isChecked()){
                ans="致远";
            }
            Intent intent =new Intent();
            intent.setClass(xmltest.this, otherActivity.class);
            Bundle bundle=new Bundle();
            bundle.putString("ans",ans);
            intent.putExtras(bundle);
            xmltest.this.startActivity(intent);
        }
    }
    class btn2 implements OnClickListener{
        @Override
        public void onClick(View v) {
        rg.clearCheck();
            setTitle("");
        }
    }

    protected void onActivityResult(int requestCode,int resultCode,Intent data){
        super.onActivityResult(requestCode,resultCode,data);
        switch (resultCode){
            case RESULT_OK:
                Bundle bundle =data.getExtras();
                String ans =bundle.getString("ans");
                break;
            default:
                break;
        }
    }}
