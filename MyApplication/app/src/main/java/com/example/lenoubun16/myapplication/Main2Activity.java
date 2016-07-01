package com.example.lenoubun16.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView textView02, textView03;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView02 = (TextView) findViewById(R.id.textView2);
        textView03 = (TextView) findViewById(R.id.textView3);

        Intent intent = getIntent();
        String received = intent.getStringExtra("123");
        //textView02.setText(received+"---received");
        String received01 = intent.getStringExtra("124");


        textView03.setText(received01+received+"////////");


    }
}
