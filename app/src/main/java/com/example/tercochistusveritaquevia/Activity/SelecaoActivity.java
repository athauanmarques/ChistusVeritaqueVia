package com.example.tercochistusveritaquevia.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.Toast;

import com.example.tercochistusveritaquevia.R;
import com.example.tercochistusveritaquevia.controle.AtribuirTexto;
import com.example.tercochistusveritaquevia.controle.ProgressoTerco;

public class SelecaoActivity extends AppCompatActivity {
    ProgressoTerco reiniciarTerco = new ProgressoTerco();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selecao);
       // ProgressoTerco.setTercoVirtual(true);
      //  AtribuirTexto.setTipoIdioma(false); //Português padrão
        reiniciarTerco.zerarTerco();


    }
    public void abrirTercoVirtual(View view){
        Intent tercoOferencimento = new Intent(this, OferecimentoActivity.class);
        startActivity(tercoOferencimento);

    }
    public void abrirSemTercoVirtual(View view){
        Intent semAcompanhamentoTerco = new Intent(this, MisterioActivity.class);
        startActivity(semAcompanhamentoTerco);


    }

}