package me.azim.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name;
    public static final String EXTRA_NAME = "IDK";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Name_Share shr = new Name_Share(text_name); // Not working
    }

    public void openActivity() {
        openActivity(null);
    }

    public void openActivity(View v) {
        Toast.makeText(this, "Opening 2nd activity", Toast.LENGTH_SHORT).show();

        // Opening  2nd Activity
        Intent intent = new Intent(this, MainActivity2.class);

        // Getting name
        name = findViewById(R.id.editTextText);
        String text_name = name.getText().toString();

        // Sending String
        intent.putExtra(EXTRA_NAME, text_name);

        startActivity(intent);
    }
}