package com.example.tercochistusveritaquevia.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

import com.example.tercochistusveritaquevia.R;
import com.example.tercochistusveritaquevia.controle.AtribuirTexto;

public class SplashScreenActivity extends AppCompatActivity {

    //Tempo de para mudar de Activity
    private static int SPLASH_CONTADOR = 4200;

    AtribuirTexto dia = new AtribuirTexto();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Toast toast = Toast.makeText(this,  dia.misterioSemanaExibir(), Toast.LENGTH_LONG);
        toast.show();

        //Handler controla a função do tempo e estância IdiomaActivity
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent  intent = new Intent(SplashScreenActivity.this, OferecimentoActivity.class);
                startActivity(intent);
                finish();

                /* Será implementado para próxima versão
                    Intent  intent = new Intent(SplashScreenActivity.this, SelecaoActivity.class);
                    startActivity(intent);
                    finish();
                */
            }
        },SPLASH_CONTADOR);




    }
}