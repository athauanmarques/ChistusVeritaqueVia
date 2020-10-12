package com.example.tercochistusveritaquevia.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tercochistusveritaquevia.R;
import com.example.tercochistusveritaquevia.controle.AtribuirTexto;

public class CreioActivity extends AppCompatActivity {

    AtribuirTexto atribuirLT = new AtribuirTexto();
    private ImageView imgTerco2;
    private Button bntTercoMT2;
    private TextView txtTitulo2, txtOracao2, txtSub2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creio);

        imgTerco2 = findViewById(R.id.imgTerco2);
        bntTercoMT2 = findViewById(R.id.bntMisterio2);
        txtTitulo2 = findViewById(R.id.txtTituloOracao2);
        txtOracao2 = findViewById(R.id.txtOracao2);
        txtSub2 = findViewById(R.id.txtSub2);
        controleExibicaoLT();
    }

    protected void onRestart(){
        super.onRestart();

        imgTerco2 = findViewById(R.id.imgTerco2);
        bntTercoMT2 = findViewById(R.id.bntMisterio2);
        txtTitulo2 = findViewById(R.id.txtTituloOracao2);
        txtOracao2 = findViewById(R.id.txtOracao2);
        txtSub2 = findViewById(R.id.txtSub2);
        controleExibicaoLT();

    }

    public void controleExibicaoLT() {
        imgTerco2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                atualizarTextoLT();
            }
        });

        bntTercoMT2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CreioActivity.this, AgradecimentoActivity.class);
                startActivity(intent);
            }
        });
    }

    public void atualizarTextoLT() {
        atribuirLT.executarTerco();
        //mudar tamnho de letras
        txtTitulo2.setTextSize(34);
        txtSub2.setTextSize(14);
        txtOracao2.setTextSize(14);
        //atribuir Orações
        txtTitulo2.setText(atribuirLT.getTitulo());
        txtSub2.setText(atribuirLT.getSubTitulo());
        imgTerco2.setImageResource(atribuirLT.getImg());
        txtOracao2.setText(atribuirLT.getOracao());
        //Exbir e  esconder subTexto
        if (atribuirLT.getExibirComponente() == 2) {
            txtSub2.setVisibility(View.GONE);
            if (atribuirLT.getExibirBotao() == 2){
                bntTercoMT2.setVisibility(View.VISIBLE);
            }
        } else {
            txtSub2.setVisibility(View.VISIBLE);
        }
    }









}