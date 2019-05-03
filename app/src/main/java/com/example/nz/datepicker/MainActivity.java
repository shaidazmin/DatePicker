package com.example.nz.datepicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    DatePicker datePicker;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        datePicker = (DatePicker) findViewById(R.id.datePicker);
        button = (Button) findViewById(R.id.button);

        Toast.makeText(MainActivity.this,"Current Date is : \n  "+datePicker.getDayOfMonth()+"/"+(datePicker.getMonth()+1)+"/"+datePicker.getYear(),Toast.LENGTH_SHORT).show();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Changed Date is : \n  "+string(),Toast.LENGTH_SHORT ).show();
            }
        });


    }

    String string(){

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(datePicker.getDayOfMonth()+"/");
        stringBuilder.append(datePicker.getMonth()+1+"/");
        stringBuilder.append( datePicker.getYear());
        return stringBuilder.toString();
    }


}
