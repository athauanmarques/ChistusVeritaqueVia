package com.example.tercochistusveritaquevia.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.tercochistusveritaquevia.R;

public class SplashScreenActivity extends AppCompatActivity {

    //Tempo de para mudar de Activity
    private static int SPLASH_CONTADOR = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        //Handler controla a função do tempo e estância IdiomaActivity
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent  intent = new Intent(SplashScreenActivity.this, SelecaoActivity.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_CONTADOR);




    }
}