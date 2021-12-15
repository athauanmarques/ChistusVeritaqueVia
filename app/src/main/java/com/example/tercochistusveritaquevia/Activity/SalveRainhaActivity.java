package com.example.tercochistusveritaquevia.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.tercochistusveritaquevia.R;
import com.example.tercochistusveritaquevia.controle.AtribuirTexto;
import com.example.tercochistusveritaquevia.controle.ProgressoTerco;

public class SalveRainhaActivity extends AppCompatActivity {


    private TextView txtRainhaTitulo, txtRainhaOracao, txtIdiomaRainha, txtInicio;
    private ImageButton imgIdiomaRainha, imgInicio;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salve_rainha);
        barraStatusTranparente();
        final Intent intent = new Intent(this, CarpeDiemActivity.class);

        txtRainhaOracao = findViewById(R.id.txtOracaoRainha);
        txtRainhaTitulo = findViewById(R.id.txtTituloRainha);
        txtIdiomaRainha = findViewById(R.id.txtIdiomaRainha);
        txtInicio = findViewById(R.id.txtInicio);
        imgIdiomaRainha = findViewById(R.id.imgIdiomaRainha);
        imgInicio = findViewById(R.id.imgIncio);

        imgIdiomaRainha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtIdiomaRainha.getText().equals("Português")) {
                    txtRainhaOracao.setText(R.string.lblSalveRainhaOracaoLT);
                    txtRainhaTitulo.setText(R.string.lblSalveRainhaTituloLT);
                    txtIdiomaRainha.setText(R.string.lblIdiomaLatim);
                    imgIdiomaRainha.setImageResource(R.drawable.ic_latim);
                } else {
                    txtRainhaOracao.setText(R.string.lblSalveRainhaOracao);
                    txtRainhaTitulo.setText(R.string.lblSalveRainhaTitulo);
                    txtIdiomaRainha.setText(R.string.lblIdiomaPortugues);
                    imgIdiomaRainha.setImageResource(R.drawable.ic_portugues);
                }
            }
        });
        txtIdiomaRainha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtIdiomaRainha.getText().equals("Português")) {
                    txtRainhaOracao.setText(R.string.lblSalveRainhaOracaoLT);
                    txtRainhaTitulo.setText(R.string.lblSalveRainhaTituloLT);
                    txtIdiomaRainha.setText(R.string.lblIdiomaLatim);
                    imgIdiomaRainha.setImageResource(R.drawable.ic_latim);
                } else {
                    txtRainhaOracao.setText(R.string.lblSalveRainhaOracao);
                    txtRainhaTitulo.setText(R.string.lblSalveRainhaTitulo);
                    txtIdiomaRainha.setText(R.string.lblIdiomaPortugues);
                    imgIdiomaRainha.setImageResource(R.drawable.ic_portugues);
                }
            }
        });



        txtInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });

        imgInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });

    }

    public void barraStatusTranparente() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Window w = getWindow();
            w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }

        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        );
    }



}