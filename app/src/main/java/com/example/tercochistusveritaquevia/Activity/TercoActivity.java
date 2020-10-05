package com.example.tercochistusveritaquevia.Activity;

import androidx.annotation.DrawableRes;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.tercochistusveritaquevia.R;
import com.example.tercochistusveritaquevia.controle.MisteriosSemanal;
import com.example.tercochistusveritaquevia.controle.ProgressoTerco;

import static android.widget.Toast.*;
import static com.example.tercochistusveritaquevia.R.*;
import static com.example.tercochistusveritaquevia.R.drawable.logosplash;

public class TercoActivity extends AppCompatActivity {

    ProgressoTerco terco = new ProgressoTerco();

    private ImageView imgTerco;
    private Button bntTercoMT;
    private TextView txtTitulo, txtOracao;

    @SuppressLint("WrongConstant")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_terco);

        imgTerco = findViewById(R.id.imgTerco);
        bntTercoMT = findViewById(R.id.bntMisterio);
        txtTitulo = findViewById(id.txtTituloOracao);
        txtOracao = findViewById(id.txtOracao);

        controleExibicao();
    }

    @SuppressLint("WrongConstant")
    @Override
    protected void onRestart() {
        super.onRestart();
        setContentView(layout.activity_terco);

        imgTerco = findViewById(R.id.imgTerco);
        bntTercoMT = findViewById(id.bntMisterio);
        txtTitulo = findViewById(id.txtTituloOracao);
        txtOracao = findViewById(id.txtOracao);

        controleExibicao();

    }

    public void controleExibicao(){
        imgTerco.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("WrongConstant")
            @Override
            public void onClick(View v) {
                atualizarTexto();
            }
        });

        bntTercoMT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irMisterio = new Intent(TercoActivity.this, MisteriosActivity.class);
                startActivity(irMisterio);
            }
        });
    }


    @SuppressLint("WrongConstant")
    public void atualizarTexto(){
        terco.contarTerco();
        txtTitulo.setText(terco.getTituloTC());
        imgTerco.setImageResource(terco.getImgTC());
        txtOracao.setText(terco.getOracaoTC());
        if(terco.getExibirBotao()!=2){
            bntTercoMT.setVisibility(0);
        }
    }



}