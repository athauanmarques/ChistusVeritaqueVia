package com.example.tercochistusveritaquevia.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tercochistusveritaquevia.R;
import com.example.tercochistusveritaquevia.controle.AtribuirTexto;
import com.example.tercochistusveritaquevia.controle.ProgressoTerco;

import static com.example.tercochistusveritaquevia.R.*;

public class TercoActivity extends AppCompatActivity {

    AtribuirTexto atribuir = new AtribuirTexto();

    private ImageView imgTerco;
    private Button bntTercoMT;
    private TextView txtTitulo, txtOracao, txtSub;

    @SuppressLint("WrongConstant")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_terco);



        imgTerco = findViewById(R.id.imgTerco);
        bntTercoMT = findViewById(R.id.bntMisterio);
        txtTitulo = findViewById(id.txtTituloOracao);
        txtOracao = findViewById(id.txtOracao);
        txtSub = findViewById(R.id.txtSub);

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

    public void controleExibicao() {
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
                Intent intent = new Intent(TercoActivity.this, AgradecimentoActivity.class);
                startActivity(intent);
            }
        });
    }


    @SuppressLint("WrongConstant")
    public void atualizarTexto() {
            atribuir.executarTerco();
            txtTitulo.setText(atribuir.getTitulo());
            txtSub.setText(atribuir.getSubTitulo());
            imgTerco.setImageResource(atribuir.getImg());
            txtOracao.setText(atribuir.getOracao());
           //Exbir e  esconder subTexto
                if (atribuir.getExibirComponente() == 2) {
                    txtSub.setVisibility(View.GONE);
                    if (atribuir.getExibirBotao() == 2) {
                        bntTercoMT.setVisibility(View.VISIBLE);
                    }
                } else {
                    txtSub.setVisibility(View.VISIBLE);
                }
            }







}





