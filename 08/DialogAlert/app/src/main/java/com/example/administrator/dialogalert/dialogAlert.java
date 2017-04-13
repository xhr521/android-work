package com.example.administrator.dialogalert;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.TextView;

public class dialogAlert extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog_alert);
        Builder dialog=new AlertDialog.Builder(dialogAlert.this);
        dialog.setIcon(android.R.drawable.ic_dialog_info);
        dialog.setTitle("majic！");
        dialog.setMessage("欢迎光临！想不想学？");
        dialog.setPositiveButton("想！", new OnClickListener() {
            @Override
            public void onClick(DialogInterface a, int b) {

            }
        });
        dialog.setNegativeButton("不想~", new OnClickListener() {
            @Override
            public void onClick(DialogInterface a, int b) {
                TextView text=(TextView) findViewById(R.id.gaoshi);
                text.setText("不想也得想！");
            }
        });
        dialog.create();
        dialog.show();
    }
}
