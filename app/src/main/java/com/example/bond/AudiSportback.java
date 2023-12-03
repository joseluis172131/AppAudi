package com.example.bond;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class AudiSportback extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audi_sportback);

        Button bAudiTron = findViewById(R.id.auditron);
        Button bAudiA5 = findViewById(R.id.audia5);
        Button bAudiA7 = findViewById(R.id.audia7);

        bAudiTron.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AudiSportback.this, AudiTron.class);
                startActivity(intent);
            }
        });
        bAudiA5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AudiSportback.this, AudiA5.class);
                startActivity(intent);
            }
        });
        bAudiA7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AudiSportback.this, AudiA7.class);
                startActivity(intent);
            }
        });


    }
}