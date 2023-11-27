package com.example.bond;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Thread thread = new Thread() {
            @Override
            public void run(){
                try {
                    SystemClock.sleep(3000);
                    startActivity(new Intent(SplashScreen.this,sesion.class));
                    finish();
                }catch (Exception e){

                }
            }
        }; thread.start();
    }
}