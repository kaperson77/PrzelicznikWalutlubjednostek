package com.example.przelicznikwalutlubjednostek;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {
    private Button Powrot;
    private TextView euro;
    private TextView metry;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button p = findViewById(R.id.button2);
        TextView Euro = findViewById(R.id.textView3);
        TextView Metry = findViewById(R.id.textView4);

        Euro.setText("Euro: " + MainActivity.euro);
        Metry.setText("Metry: " + MainActivity.metry);
        p.setOnClickListener(v -> {
            finish();
        });

    }
}