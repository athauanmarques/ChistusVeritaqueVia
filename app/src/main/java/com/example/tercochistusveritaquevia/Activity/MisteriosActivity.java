package com.example.tercochistusveritaquevia.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tercochistusveritaquevia.R;
import com.example.tercochistusveritaquevia.controle.MisteriosSemanal;
import com.example.tercochistusveritaquevia.controle.ProgressoTerco;

public class MisteriosActivity extends AppCompatActivity {

    private TextView txtTitulo, txtSubTitulo, txtDescricao;
    private Button bntIrTerco;
    private ImageView imgCenario;


    MisteriosSemanal atribuir = new MisteriosSemanal();
    ProgressoTerco vlPosicaoTerco = new ProgressoTerco();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_misterios);

        txtTitulo = findViewById(R.id.txtTituloMT);
        txtDescricao = findViewById(R.id.txtDescricaoMT);
        txtSubTitulo = findViewById(R.id.txtSubTituloMT);
        bntIrTerco = findViewById(R.id.bntVoltarTerco);
        imgCenario = findViewById(R.id.imgMisterio);


        atribuir.atribuirTextos();
        txtSubTitulo.setText(atribuir.getSubTituloMt());
        imgCenario.setImageResource(atribuir.getImagemMt());
        txtTitulo.setText(atribuir.getTituloMt());
        txtDescricao.setText(atribuir.getDescricaoMt());

        bntIrTerco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MisteriosActivity.this, TercoActivity.class);
                startActivity(intent);
            }
        });

    }


}