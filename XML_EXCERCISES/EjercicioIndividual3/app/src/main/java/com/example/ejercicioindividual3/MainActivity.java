package com.example.ejercicioindividual3;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText etFirstNumber;
    private EditText etSecondNumber;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        etFirstNumber = findViewById(R.id.etFirstNumber);
        etSecondNumber = findViewById(R.id.etSecondNumber);
        result = findViewById(R.id.result);
    }

    //add
    public void add(View view) {

        int num1 = Integer.parseInt(etFirstNumber.getText().toString());
        int num2 = Integer.parseInt(etSecondNumber.getText().toString());
        double rst = num1 + num2;
        result.setText(String.valueOf(rst));

    }

    //subtract
    public void subtract(View view) {

        int num1 = Integer.parseInt(etFirstNumber.getText().toString());
        int num2 = Integer.parseInt(etSecondNumber.getText().toString());
        double rst = num1 - num2;
        result.setText(String.valueOf(rst));

    }

    //multiply
    public void multi(View view) {

        int num1 = Integer.parseInt(etFirstNumber.getText().toString());
        int num2 = Integer.parseInt(etSecondNumber.getText().toString());
        double rst = num1 * num2;
        result.setText(String.valueOf(rst));

    }

    //divide
    public void divide(View view) {
        int num1 = Integer.parseInt(etFirstNumber.getText().toString());
        int num2 = Integer.parseInt(etSecondNumber.getText().toString());


        if(num2 == 0 || num1 == 0){
            result.setText(R.string.divide_by_zero);
            return;
        }

        double rst = (double) num1 / num2;

        result.setText(String.valueOf(rst));



    }



}