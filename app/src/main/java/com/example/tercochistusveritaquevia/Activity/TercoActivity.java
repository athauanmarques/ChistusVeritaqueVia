package com.example.tercochistusveritaquevia.Activity;

import androidx.annotation.DrawableRes;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.tercochistusveritaquevia.R;
import com.example.tercochistusveritaquevia.controle.ProgressoTerco;

import static android.widget.Toast.*;
import static com.example.tercochistusveritaquevia.R.*;
import static com.example.tercochistusveritaquevia.R.drawable.logosplash;

public class TercoActivity extends AppCompatActivity {

    ProgressoTerco terco = new ProgressoTerco();

    private ImageView imgTerco;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_terco);

        imgTerco = findViewById(R.id.imgTerco);
        int qtsOracaoes = terco.getContador();

        imgTerco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                executarTerco(terco.contarTerco());
            }
        });

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        setContentView(layout.activity_terco);

        imgTerco = findViewById(R.id.imgTerco);

        imgTerco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                executarTerco(terco.contarTerco());

            }
        });
    }


    public void executarTerco(int contadorAtual){
                if(contadorAtual == 1 || contadorAtual == 0) {
                    imgTerco.setImageResource(drawable.p2);
                } else if(contadorAtual == 2) {
                    imgTerco.setImageResource(drawable.p3);
                } else if(contadorAtual == 3){
                    imgTerco.setImageResource(R.drawable.p4);
                } else if(contadorAtual == 4){
                    imgTerco.setImageResource(drawable.p5);
                }
    }





}