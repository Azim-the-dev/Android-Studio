package me.azim.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
//    private Button button;
    private TextView textview;
    private EditText edittext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        button = findViewById(R.id.button);
        textview = findViewById(R.id.textView2);
        edittext = findViewById(R.id.editTextText);

//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "Hello User", Toast.LENGTH_SHORT).show();
//                // Toast for Mini message
//
//                String str = edittext.getText().toString();
//                textview.setText("Hello, " + str + "!");
//            }
//        });
    }

    public void message(View view){
        Toast.makeText(MainActivity.this, "Hello User", Toast.LENGTH_SHORT).show();

        String str = edittext.getText().toString();
        textview.setText("Hello, " + str + "!");
    }
}