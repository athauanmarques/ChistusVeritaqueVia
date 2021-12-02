package com.example.tercochistusveritaquevia.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.widget.Toast;

import com.example.tercochistusveritaquevia.R;
import com.example.tercochistusveritaquevia.controle.AtribuirTexto;

@SuppressLint("CustomSplashScreen")
public class SplashScreenActivity extends AppCompatActivity {

    AtribuirTexto dia = new AtribuirTexto();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Toast toast = Toast.makeText(this,  dia.misterioSemanaExibir(), Toast.LENGTH_LONG);
        toast.show();

        //Handler controla a função do tempo e estância IdiomaActivity
        //Tempo de para mudar de Activity
        int SPLASH_CONTADOR = 4200;
        new Handler().postDelayed(() -> {
            //Intent  intent = new Intent(SplashScreenActivity.this, OferecimentoActivity.class);
            Intent  intent = new Intent(SplashScreenActivity.this, MensagemActivity.class);
            startActivity(intent);
            finish();

        }, SPLASH_CONTADOR);




    }
}