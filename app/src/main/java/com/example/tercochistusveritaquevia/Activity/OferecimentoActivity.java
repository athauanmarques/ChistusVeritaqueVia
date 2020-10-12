package com.example.tercochistusveritaquevia.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.tercochistusveritaquevia.R;
import com.example.tercochistusveritaquevia.controle.AtribuirTexto;

public class OferecimentoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oferecimento);
    }

    public void iniciarCreio(View view){
        if(AtribuirTexto.isTipoIdioma()){
            Intent creio = new Intent(this, CreioActivity.class);
            startActivity(creio);
        } else {
            Intent creio = new Intent(this, TercoActivity.class);
            startActivity(creio);
        }

    }
}