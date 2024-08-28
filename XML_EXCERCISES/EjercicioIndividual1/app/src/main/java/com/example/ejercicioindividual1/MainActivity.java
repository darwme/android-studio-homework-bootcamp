package com.example.ejercicioindividual1;

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

    private EditText etName;
    private TextView tvSaludo;
    private Button btnSaludar;

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

        etName = (EditText) findViewById(R.id.etName);
        tvSaludo = (TextView) findViewById(R.id.tvSaludo);
        btnSaludar = (Button) findViewById(R.id.btnSaludo);

        btnSaludar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                tvSaludo.setText("hola " + etName.getText().toString());

            }
        });
    }
}