package com.astro.astrologylivetal;

//import android.app.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView text, title;
    String activity = "";

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        text = findViewById(R.id.textView2);
        title = findViewById(R.id.textView3);
        activity = getIntent().getStringExtra("activity");

        if(activity != null && activity.equals("fee")){
            title.setText("What is the Fee Structure ?");
            text.setText(R.string.fee_text);
        }
        else if(activity != null && activity.equals("work")){
            title.setText("How does it work ?");
            text.setText(R.string.work_text);
        }

    }
}