package me.azim.urlapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Button click
    public void openActivity(View v) {
        Log.d( "MainActivity", "Button is working.");
        Toast.makeText(this, "Opening...", Toast.LENGTH_SHORT).show();

        String url = "https://chat.openai.com/";
        openWebPage(url);
    }

    // Creating a Method to Open Web Pages
    @SuppressLint("QueryPermissionsNeeded")
    public void openWebPage(String url) {
        Log.d( "MainActivity", "Inside openWebPage method.");
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);

        startActivity(intent);

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
            Log.d( "MainActivity", "Inside If block.");
        }
    }
}