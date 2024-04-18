package com.example.viewsandwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // user image
        ImageView img;
        img = findViewById(R.id.userImg);
        img.setImageResource(R.drawable.userImg);

        // title
        TextView userTitle;
        userTitle = findViewById(R.id.userTitle);
        userTitle.setText("Jenny");

        // edit text
        EditText editText;
        editText = findViewById(R.id.textInput);
        editText.setText("Georgia");

        // button
        Button btn;
        btn = findViewById(R.id.myBtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void  onClick(View v) {
                // this code will be executed when the button is clicked

                // create a toast
                Toast.makeText(MainActivity.this, "Account Created Successfully!!", Toast.LENGTH_SHORT).show();
            }
        });

    }
}