package me.azim.test;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    TextView textView;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Setting text
        // String name = Name_Share.sharedString; // Not working

        Intent intent = getIntent();
        String msg = intent.getStringExtra(MainActivity.EXTRA_NAME);

        textView = findViewById(R.id.textView);

        if (msg.length() == 0) {
            textView.setText("Enter Your name please!");
        } else {
            textView.setText("Hello, " + msg + "!");
        }
    }
}