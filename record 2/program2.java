package com.example.program2;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.button);
        EditText n = findViewById(R.id.editTextText);
        EditText p = findViewById(R.id.editTextTextPassword);
        EditText a = findViewById(R.id.editTextText2);
        EditText b = findViewById(R.id.editTextText3);
        EditText c = findViewById(R.id.editTextNumber);
        TextView tx = findViewById(R.id.textView);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v1) {
                String name = n.getText().toString();
                String password = p.getText().toString();
                String address = a.getText().toString();
                String gender = b.getText().toString();
                String age = c.getText().toString();

                String message = "Name: " + name +
                        "\nPassword: " + password +
                        "\nAge: " + age +
                        "\nAddress: " + address +
                        "\nGender: " + gender;

                tx.setText(message);

            }
        });
    }
}
