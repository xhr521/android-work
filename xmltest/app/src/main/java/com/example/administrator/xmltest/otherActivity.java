package com.example.administrator.xmltest;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class otherActivity extends Activity{
    private Intent intent;
    private Bundle bundle;
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.other);
        Bundle bundle=this.getIntent().getExtras();
        String ans =bundle.getString("ans");
        String rsText="";
        if (ans.equals("立明")){
            rsText="正确";
        }else {
            rsText="错误";
        }
        TextView tv1=(TextView)findViewById(R.id.text);
        tv1.setText("你选择的答案是："+rsText);
        Button btn3 = (Button)findViewById(R.id.re);
        btn3.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                otherActivity.this.setResult(RESULT_OK,intent);
                otherActivity.this.finish();
            }
        });
    }
}
