package com.example.tercochistusveritaquevia.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.tercochistusveritaquevia.R;
import com.example.tercochistusveritaquevia.controle.AtribuirTexto;
import com.example.tercochistusveritaquevia.controle.ProgressoTerco;

public class SalveRainhaActivity extends AppCompatActivity {

    private Button bntCarpeDiem;
    private TextView txtRainhaTitulo, txtRainhaOracao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salve_rainha);
        bntCarpeDiem = findViewById(R.id.bntCarpeDiem);
        final Intent intent = new Intent(this, TercoActivity.class);
        ProgressoTerco.setTercoVirtual(true);

        txtRainhaOracao = findViewById(R.id.txtOracaoRainha);
        txtRainhaTitulo = findViewById(R.id.txtTituloRainha);

        if(AtribuirTexto.isTercoVirtual()){
            txtRainhaTitulo.setText(R.string.lblSalveRainhaTituloLT);
            txtRainhaOracao.setText(R.string.lblSalveRainhaOracaoLT);
        }

        bntCarpeDiem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });

    }





}