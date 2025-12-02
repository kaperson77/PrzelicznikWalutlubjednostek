package com.example.przelicznikwalutlubjednostek;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.content.Intent;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static double euro;
    public static double metry;
    private Button button;
    private EditText zlEdit;
    private EditText cmEdit;
    private Button send;

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
        Button b = findViewById(R.id.button);
        EditText zlEdit = findViewById(R.id.zlEdit);
        EditText cmEdit = findViewById(R.id.cmEdit);

        b.setOnClickListener(v -> {
            String zlText = zlEdit.getText().toString();
            String cmText = cmEdit.getText().toString();

            double zl = Double.parseDouble(zlText);
            double cm = Double.parseDouble(cmText);

            double euro = zl * 4.24;
            double m = cm / 100.0;

            startActivity(new Intent(MainActivity.this, SecondActivity.class));
        });
    }
    }