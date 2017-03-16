package com.example.administrator.weight;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.R.string;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;


public class Weight extends AppCompatActivity {
    public static String sex="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight);
        Button b1=(Button)findViewById(R.id.btn_calculate);
        b1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                EditText et = (EditText) findViewById(R.id.et_height);

                double height = Double.parseDouble(et.getText().toString());
                RadioGroup rg = (RadioGroup) findViewById(R.id.rg_sex);
                rg.setOnCheckedChangeListener(new OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup arg0, int checkedId) {
                        // TODO Auto-generated method stub
                        if (checkedId == R.id.btn_boy) {
                            sex = "M";
                        } else {
                            sex = "F";
                        }
                    }
                });
                Intent intent = new Intent();
                intent.setClass(Weight.this, Result.class);
                Bundle bundle = new Bundle();
                bundle.putDouble("height", height);
                bundle.putString("sex", sex);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }

}