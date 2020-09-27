package com.example.tercochistusveritaquevia.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.tercochistusveritaquevia.R;
import com.example.tercochistusveritaquevia.controle.MisteriosSemanal;

import java.text.DateFormatSymbols;
import java.util.Calendar;

import static java.util.Calendar.DAY_OF_WEEK;

public class SelecaoActivity extends AppCompatActivity {
    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selecao);
        MisteriosSemanal dia = new MisteriosSemanal();

            Toast toast = Toast.makeText(this,  dia.misterioSemanaExibir(), Toast.LENGTH_LONG);
            toast.show();


    }
    public void abrirTercoPortugues(View view){
        Intent tercoOferencimento = new Intent(this, OfercimentoActivity.class);
        startActivity(tercoOferencimento);
    }

}