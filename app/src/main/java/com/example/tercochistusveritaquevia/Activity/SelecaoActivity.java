package com.example.tercochistusveritaquevia.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.tercochistusveritaquevia.R;
import com.example.tercochistusveritaquevia.controle.ProgressoTerco;

public class SelecaoActivity extends AppCompatActivity {
    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selecao);
        ProgressoTerco dia = new ProgressoTerco();

            Toast toast = Toast.makeText(this,  dia.misterioSemanaExibir(), Toast.LENGTH_LONG);
            toast.show();


    }
    public void abrirTercoPortugues(View view){
        Intent tercoOferencimento = new Intent(this, OferecimentoActivity.class);
        startActivity(tercoOferencimento);
    }

}