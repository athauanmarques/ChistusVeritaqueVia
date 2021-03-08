package com.example.tercochistusveritaquevia.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.tercochistusveritaquevia.R;

public class MensagemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mensagem);
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