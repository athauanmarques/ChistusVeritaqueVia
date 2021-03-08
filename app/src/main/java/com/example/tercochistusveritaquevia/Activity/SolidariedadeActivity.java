package com.example.tercochistusveritaquevia.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.tercochistusveritaquevia.R;

public class SolidariedadeActivity extends AppCompatActivity {

    private static int SPLASH_CONTADOR = 7200;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solidariedade);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //Intent  intent = new Intent(SplashScreenActivity.this, OferecimentoActivity.class);
                Intent intent = new Intent(SolidariedadeActivity.this, MensagemActivity.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_CONTADOR);

    }
}