package com.example.tercochistusveritaquevia.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tercochistusveritaquevia.R;

public class CarpeDiemActivity extends AppCompatActivity {

    private ImageButton imgSair, imgSobre;
    private TextView txtSair, txtSobre;
    private Button bntVoltarInicio;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carpe_diem);
        barraStatusTranparente();

        imgSair = findViewById(R.id.imgSair);
        imgSobre = findViewById(R.id.imgSobre);
        txtSair = findViewById(R.id.txtSair);
        txtSobre = findViewById(R.id.txtSobre);
        bntVoltarInicio = findViewById(R.id.bntVoltarInicio);

        imgSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opcoesSelecionado(0);
            }
        });

        txtSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opcoesSelecionado(0);
            }
        });

        imgSobre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opcoesSelecionado(1);
            }
        });

        txtSobre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opcoesSelecionado(1);
            }
        });

        bntVoltarInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opcoesSelecionado(2);
            }
        });

    }

    public  void opcoesSelecionado(int op){
       if(op == 0){
           this.finishAffinity();
       }
        else if(op == 1){
            Intent goSobre = new Intent(CarpeDiemActivity.this, SobreActivity.class);
            startActivity(goSobre);
        } else if(op == 2){
           Intent goVoltar = new Intent(CarpeDiemActivity.this, MensagemActivity.class);
           startActivity(goVoltar);
        }

    }


    public void barraStatusTranparente() {
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