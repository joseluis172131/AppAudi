package com.example.bond;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AudiSport extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audi_sport);

        Button bAudiR8 = findViewById(R.id.audir8);
        Button bAudiS8 = findViewById(R.id.audis8);

        bAudiR8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AudiSport.this, AudiR8.class);
                startActivity(intent);
            }
        });

        bAudiS8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AudiSport.this, AudiS8.class);
                startActivity(intent);
            }
        });
    }
}