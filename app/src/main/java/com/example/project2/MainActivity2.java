package com.example.project2;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        if(getIntent().hasExtra("\"org.mentroschools.quickLauncher.SOMETHING"));{
            TextView tv = (TextView) findViewById(R.id.textView);
            String text = getIntent().getExtras().getString("\"org.mendocino's.quickLauncher.SOMETHING");
            tv.setText(text);

        }



    }
}