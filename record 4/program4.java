package com.example.program4;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText number1, number2;
    Button addBtn, subBtn, mulBtn, divBtn;
    TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        number1=findViewById(R.id.editTextText);
        number2=findViewById(R.id.editTextText2);
        addBtn=findViewById(R.id.button4);
        subBtn=findViewById(R.id.button3);
        mulBtn=findViewById(R.id.button2);
        divBtn=findViewById(R.id.button);
        answer=findViewById(R.id.textView2);

        addBtn.setOnClickListener(view -> calculate('+'));
        subBtn.setOnClickListener(View -> calculate('-'));
        mulBtn.setOnClickListener(View -> calculate('*'));
        divBtn.setOnClickListener(view -> calculate('/'));

    }

    private void calculate(char operator) {
        String input1 = number1.getText().toString();
        String input2 = number2.getText().toString();
        if (input1.isEmpty() || input2.isEmpty()) {
            answer.setText("Please enter both numbers.");
            return;
        }

        double num1 = Double.parseDouble(input1);
        double num2 = Double.parseDouble(input2);
        double res = 0;

        switch (operator) {
            case '+':
                res = num1 + num2;
                break;
            case '-':
                res = num1 - num2;
                break;
            case '*':
                res = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    answer.setText("Cannot divide by zero");
                    return;
                }
                res = num1 / num2;
                break;
        }

        answer.setText("Result: " + res);
    }
}


