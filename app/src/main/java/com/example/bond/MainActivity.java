package com.example.bond;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;

public class MainActivity extends AppCompatActivity {

    private Button b1;
    private FirebaseAuth mAuth;
    private FirebaseFirestore firebaseFirestore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mAuth = FirebaseAuth.getInstance();
        firebaseFirestore = FirebaseFirestore.getInstance();

        b1 = findViewById(R.id.cerrarsesion);
        Button bSportback = findViewById(R.id.sportback);
        Button bSedan = findViewById(R.id.sedan);
        Button bSport = findViewById(R.id.sport);
        Button bSuv = findViewById(R.id.suv);
       //

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Tu lógica para cerrar sesión
            }
        });

        bSportback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AudiSportback.class);
                startActivity(intent);
            }
        });

        bSedan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AudiSedan.class);
                startActivity(intent);
            }
        });
        Button bCoupe = findViewById(R.id.Coupe);
        bCoupe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AudiCoupe.class);
                startActivity(intent);
            }
        });

        Button bsport = findViewById(R.id.sport);
        bSport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AudiSport.class);
                startActivity(intent);
            }
        });

        Button bsuv = findViewById(R.id.Coupe);
        bSuv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AudiSuv.class);
                startActivity(intent);
            }
        });

        Button bCerrarSesion = findViewById(R.id.cerrarsesion);
        bCerrarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseAuth.getInstance().signOut();
                Intent intent = new Intent(MainActivity.this, sesion.class);
                startActivity(intent);
                finish();
            }
        });

    }
}


