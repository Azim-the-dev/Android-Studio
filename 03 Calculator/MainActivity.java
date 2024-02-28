package me.azim.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    private Button button;
    private TextView textView;
    private char operator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editTextText2);
        button = findViewById(R.id.button2);
        textView = findViewById(R.id.textView5);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = editText.getText().toString();
                String words[] = str.split("\\s+");

                int num1 = Integer.parseInt(words[0]);
                operator = words[1].charAt(0);
                int num2 = Integer.parseInt(words[2]);

                double add = (num1 + num2);
                double sub = (num1 - num2);
                double div = (num1 / num2);
                double mul = (num1 * num2);
                double mod = (num1 % num2);

                switch (operator) {
                    case '+':
                        textView.setText("Ans: " + add);
                        break;

                    case '-':
                        textView.setText("Ans: " + sub);
                        break;

                    case '/':
                        textView.setText("Ans: " + div);
                        break;

                    case '*':
                        textView.setText("Ans: " + mul);
                        break;

                    case '%':
                        textView.setText("Ans: " + mod);
                        break;

                    default:
                        textView.setText("Error!");
                        break;
                }
            }
        });
    }
}