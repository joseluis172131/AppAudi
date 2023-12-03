package com.example.bond;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AudiCoupe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audi_coupe);

        Button bAudiA5Coupe = findViewById(R.id.audia5coupe);
        Button bAudiS5Coupe = findViewById(R.id.audis5coupe);
        Button bAudiRs5Coupe = findViewById(R.id.audirs5coupe);


        bAudiA5Coupe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AudiCoupe.this, AudiA5Coupe.class);
                startActivity(intent);
            }
        });

        bAudiS5Coupe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AudiCoupe.this, AudiS5Coupe.class);
                startActivity(intent);
            }
        });

        bAudiRs5Coupe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AudiCoupe.this, AudiRs5Coupe.class);
                startActivity(intent);
            }
        });
    }
}