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
    AtribuirTexto dia = new AtribuirTexto();

    private Switch swVirtualTerco;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selecao);

        swVirtualTerco = findViewById(R.id.swVirtual);

        Toast toast = Toast.makeText(this,  dia.misterioSemanaExibir(), Toast.LENGTH_LONG);
        toast.show();

        swVirtualTerco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ProgressoTerco.setTercoVirtual(swVirtualTerco.isChecked());
            }
        });


    }
    public void abrirTercoPortugues(View view){
        Intent tercoOferencimento = new Intent(this, OferecimentoActivity.class);
        Intent semAcompanhamentoTerco = new Intent(this, TercoVirtualActivity.class);
        reiniciarTerco.zerarTerco();
        AtribuirTexto.setTipoIdioma(false);
        if(ProgressoTerco.isTercoVirtual()){
            startActivity(tercoOferencimento);
        } else {
            startActivity(semAcompanhamentoTerco);
        }

    }
    public void abrirTercoLatim(View view){
        Intent tercoOferencimento = new Intent(this, OferecimentoActivity.class);
        Intent semAcompanhamentoTerco = new Intent(this, TercoVirtualActivity.class);
        reiniciarTerco.zerarTerco();
        AtribuirTexto.setTipoIdioma(true);
        if(ProgressoTerco.isTercoVirtual()){
            startActivity(tercoOferencimento);
        } else {
            startActivity(semAcompanhamentoTerco);
        }
    }

}