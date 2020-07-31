package com.example.project2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button secondActivityBtn = (Button)findViewById(R.id.secondActivityBtn);
        secondActivityBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), MainActivity2.class);
                startIntent.putExtra("org.mentroschools.quickLauncher.SOMETHING","HELLO WORLD");
                startActivity(startIntent);

            }
        });
        //Attempt to launch an activity outside the app
        Button googleBtn = (Button) findViewById(R.id.Googlebutton);
        googleBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String google = "http://www.google.com";
                Uri webaddress =Uri.parse(google);
                Intent gotoGoogle = new Intent(Intent.ACTION_VIEW, webaddress);
                if (gotoGoogle.resolveActivity(getPackageManager())!=null);
                startActivity(gotoGoogle);
            }
        });
    }
}