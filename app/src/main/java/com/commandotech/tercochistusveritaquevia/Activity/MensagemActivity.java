package com.commandotech.tercochistusveritaquevia.Activity;

import static com.commandotech.tercochistusveritaquevia.R.layout.activity_mensagem;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

public class MensagemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_mensagem);
        barraStatusTranparente();
    }

    public void goSantaRita(View view){
        Intent intent = new Intent(MensagemActivity.this, SantaActivity.class);
        startActivity(intent);

    }

    public void goSantoTerco(View view){
        Intent intent = new Intent(MensagemActivity.this, OferecimentoActivity.class);
        startActivity(intent);
    }


    public void barraStatusTranparente(){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Window w = getWindow();
            w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }

        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        );
    }

}