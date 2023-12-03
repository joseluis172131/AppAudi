package com.example.bond;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AudiSuv extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audi_suv);

        Button bAudiQ3 = findViewById(R.id.audiq3);
        Button bAudiQ5 = findViewById(R.id.audiq5);
        Button bAudiQ8 = findViewById(R.id.audiq8);

        bAudiQ3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AudiSuv.this, AudiQ3.class);
                startActivity(intent);
            }
        });

        bAudiQ5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AudiSuv.this, AudiQ5.class);
                startActivity(intent);
            }
        });

        bAudiQ8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AudiSuv.this, AudiQ8.class);
                startActivity(intent);
            }
        });

    }
}