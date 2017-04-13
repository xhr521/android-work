package com.example.administrator.datepickerdialogexample;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import android.widget.DatePicker;
import android.view.View.OnClickListener;
import android.app.DatePickerDialog;

public class datepickerDialog extends Activity {
    private TextView showtime;
    private Button setdate;
    private int year;
    private int month;
    private int day;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        showtime=(TextView)this.findViewById(R.id.showtime);
        setdate=(Button)this.findViewById(R.id.date);
        Calendar c=Calendar.getInstance(Locale.CHINA);
        final Date mydate=new Date();
        c.setTime(mydate);
        year=c.get(Calendar.YEAR);
        month=c.get(Calendar.MONTH);
        day=c.get(Calendar.DAY_OF_MONTH);
        showtime.setText("当前日期："+year+"-"+(month+1)+"-"+day);

        setdate.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePickerDialog my_datePickerDialog=new DatePickerDialog(datepickerDialog.this,Datelistener,year,month,day);
                my_datePickerDialog.setTitle("日期");
                long time= mydate.getTime();
                my_datePickerDialog.getDatePicker().setMaxDate(time);
                my_datePickerDialog.show();
            }
        });
    }

    private DatePickerDialog.OnDateSetListener Datelistener=new DatePickerDialog.OnDateSetListener(){
        public void onDateSet(DatePicker v,int y,int m,int d){
            year=y;
            month=m;
            day=d;
            updateate();
        }
        private void updateate(){
            setdate.setText("当前日期“"+year+"-"+(month+1)+"-"+day);
        }
    };
}
