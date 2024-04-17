package com.example.viewsandwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // creating a TextView variable
        TextView myTitle;
        myTitle = findViewById(R.id.title);

        myTitle.setText("Hello From Java");

    }
}