package com.example.bond;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AudiSedan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audi_sedan);

        Button bAudiA3Sedan = findViewById(R.id.audia3sedan);
        Button bAudiS3 = findViewById(R.id.audis3);
        Button bAudiA8 = findViewById(R.id.audia8);


        bAudiA3Sedan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AudiSedan.this, AudiA3Sedan.class);
                startActivity(intent);
            }
        });

        bAudiS3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AudiSedan.this, AudiS3Sedan.class);
                startActivity(intent);
            }
        });

        bAudiA8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AudiSedan.this, AudiA8Sedan.class);
                startActivity(intent);
            }
        });




    }
}