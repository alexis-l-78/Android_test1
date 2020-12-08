package com.example.myapplication;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;
import android.content.Intent;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_2);

        Log.e("DEVE0304", "Activity2:onCreate()");

        TextView text = (TextView) findViewById(R.id.text_view_id);

        Intent myIntent = getIntent(); // gets the previously created intent
        String NameA = myIntent.getStringExtra("pseudo");
        text.setText(NameA);
    }
}