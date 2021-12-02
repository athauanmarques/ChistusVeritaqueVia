package com.example.tercochistusveritaquevia.Activity;

import static com.example.tercochistusveritaquevia.R.layout.activity_mensagem;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MensagemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_mensagem);
    }

    public void goSantaRita(View view){
        Intent intent = new Intent(MensagemActivity.this, SantaActivity.class);
        startActivity(intent);

    }

    public void goSantoTerco(View view){
        Intent intent = new Intent(MensagemActivity.this, OferecimentoActivity.class);
        startActivity(intent);
    }
}