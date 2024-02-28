package me.azim.morniing;

import java.util.Calendar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);

        Calendar cal = Calendar.getInstance();
        int hour = cal.get(Calendar.HOUR_OF_DAY);

        if ((hour >= 0) && (hour < 12)) {
            Toast.makeText(this, "Good Moring!", Toast.LENGTH_SHORT).show();
            textView.setText("Good Moring!");
        } else if ((hour >= 12) && (hour < 18)) {
            Toast.makeText(this, "Good Afternoon!", Toast.LENGTH_SHORT).show();
            textView.setText("Good Afternoon!");
        } else {
            Toast.makeText(this, "Good Night!", Toast.LENGTH_SHORT).show();
            textView.setText("Good Night!");
        }
    }
}