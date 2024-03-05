package me.azim.listviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String arr[] = {"Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim", "Azim"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Start
        listView = findViewById(R.id.listview);
        ArrayAdapter adp = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arr);
        listView.setAdapter(adp);
    }
}