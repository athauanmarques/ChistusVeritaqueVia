package com.example.tercochistusveritaquevia.Activity;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.tercochistusveritaquevia.R;
import com.example.tercochistusveritaquevia.controle.ProgressoTerco;

public class TercoActivity extends AppCompatActivity {

    ProgressoTerco terco = new ProgressoTerco();

    private ImageView tercoImagem;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terco);

        @SuppressLint("UseCompatLoadingForDrawables") final Drawable img1 = getResources().getDrawable(R.drawable.p1);
        @SuppressLint("UseCompatLoadingForDrawables") final Drawable img2 = getResources().getDrawable(R.drawable.p2);
        @SuppressLint("UseCompatLoadingForDrawables") final Drawable img3 = getResources().getDrawable(R.drawable.p3);
        @SuppressLint("UseCompatLoadingForDrawables") final Drawable img4 = getResources().getDrawable(R.drawable.p4);
        @SuppressLint("UseCompatLoadingForDrawables") final Drawable img5 = getResources().getDrawable(R.drawable.p5);

        tercoImagem = findViewById(R.id.imgProgresso);

        tercoImagem.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int qtsOracaoes = terco.verificarTerco();

                if (qtsOracaoes == 1){
                    tercoImagem.setImageDrawable(img1);
                } else if(qtsOracaoes == 2) {
                    tercoImagem.setImageDrawable(img2);
                } else if(qtsOracaoes == 3) {
                    tercoImagem.setImageDrawable(img3);
                } else if(qtsOracaoes == 4){
                    tercoImagem.setImageDrawable(img4);
                } else if(qtsOracaoes == 5){
                    tercoImagem.setImageDrawable(img5);
                }

                return true;
            }
        });


    }


}