package com.example.tercochistusveritaquevia.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

import com.example.tercochistusveritaquevia.R;
import com.example.tercochistusveritaquevia.controle.AtribuirTexto;

import static com.example.tercochistusveritaquevia.R.*;

public class TercoActivity extends AppCompatActivity {

    AtribuirTexto atribuir = new AtribuirTexto();

    private ImageView imgTerco, imgIdioma, imgPosicao, imgVoltar;
    private Button bntTercoMT;
    private TextView txtTitulo, txtOracao, txtSub, txtVoltar, txtPosicao, txtIdioma;
    private Toolbar barraToolbar;

    @SuppressLint("WrongConstant")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_terco);



        imgTerco = findViewById(R.id.imgTerco);
        bntTercoMT = findViewById(R.id.bntMisterio);
        txtTitulo = findViewById(id.txtTituloOracao);
        txtOracao = findViewById(id.txtOracao);
        txtSub = findViewById(R.id.txtSub);

        txtVoltar = findViewById(id.txtVoltar);
        txtPosicao = findViewById(id.txtPosicao);
        txtIdioma = findViewById(id.txtIdioma);

        imgIdioma = findViewById(id.imgIcoIdioma);
        imgPosicao = findViewById(id.imgIcoPosicao);
        imgVoltar = findViewById(id.imgIcoVoltar);

      //  barraToolbar = findViewById(id.tercoToolbar);


            controleExibicao();

    }

    @SuppressLint("WrongConstant")
    @Override
    protected void onRestart() {
        super.onRestart();
        setContentView(layout.activity_terco);

        imgTerco = findViewById(R.id.imgTerco);
        bntTercoMT = findViewById(id.bntMisterio);
        txtTitulo = findViewById(id.txtTituloOracao);
        txtOracao = findViewById(id.txtOracao);

        controleExibicao();

    }

    public void controleExibicao() {
        imgTerco.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("WrongConstant")
            @Override
            public void onClick(View v) {
                    atualizarTexto();
            }
        });

        imgPosicao.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("WrongConstant")
            @Override
            public void onClick(View v) {
                atualizarTexto();
            }
        });

        txtPosicao.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("WrongConstant")
            @Override
            public void onClick(View v) {
                atualizarTexto();
            }
        });

        bntTercoMT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TercoActivity.this, AgradecimentoActivity.class);
                startActivity(intent);
            }
        });

        imgVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent voltar = new Intent( TercoActivity.this,   OferecimentoActivity.class);
                startActivity(voltar);
            }
        });

        txtVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent voltar = new Intent( TercoActivity.this,   OferecimentoActivity.class);
                startActivity(voltar);
            }
        });

        imgIdioma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mudarIdioma();
            }
        });

        txtIdioma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mudarIdioma();
            }
        });

    }

    public void mudarIdioma(){
         final String idiomaAtual = (String) txtTitulo.getText(),
                      oracaoAtual = (String) txtOracao.getText(),
                      compararAverMariaPT = Integer.toString(string.lblAveMaria),
                      compararAverMariaLT = Integer.toString(string.lblAveMariaLT);
        String idiomaExibicaoTexto = (String) txtIdioma.getText();



                 // Mudar para o Português
                 if(idiomaAtual.equals("Credo")){
                     txtTitulo.setText(string.lblCreioTitulo);
                     txtOracao.setText(string.lblCreio);
                     txtIdioma.setText(string.lblIdiomaLatim);
                     imgIdioma.setImageResource(drawable.ic_latim);
                 }else if(idiomaAtual.equals("Pater Noster")){
                     txtTitulo.setText(string.lblPaiNossoTitulo);
                     txtOracao.setText(string.lblPaiNosso);
                     txtIdioma.setText(string.lblIdiomaLatim);
                     imgIdioma.setImageResource(drawable.ic_latim);;
                 }else if(oracaoAtual.equals(compararAverMariaLT)){
                     txtTitulo.setText(string.lblPaiNossoTitulo);
                     txtOracao.setText(string.lblPaiNosso);
                     txtIdioma.setText(string.lblIdiomaLatim);
                     imgIdioma.setImageResource(drawable.ic_latim);
                 }else if(idiomaAtual.equals("Gloria")){
                     txtTitulo.setText(string.lblGloriaTitulo);
                     txtOracao.setText(string.lblGloria);
                     txtIdioma.setText(string.lblIdiomaLatim);
                     imgIdioma.setImageResource(drawable.ic_latim);
                 }else if(idiomaAtual.equals("Oratio Fatimae")){
                     txtTitulo.setText(string.lblJaculatoriaTitulo);
                     txtOracao.setText(string.lblJaculatoria);
                     txtIdioma.setText(string.lblIdiomaLatim);
                     imgIdioma.setImageResource(drawable.ic_latim);
                 }//Mudar para o Latim
                 else if(idiomaAtual.equals("Creio")){
                    txtTitulo.setText(string.lblCreioTituloLT);
                    txtOracao.setText(string.lblCreioLT);
                     txtIdioma.setText(R.string.lblIdiomaPortugues);
                     imgIdioma.setImageResource(drawable.ic_portugues);
                }else if(idiomaAtual.equals("Pai Nosso")){
                    txtTitulo.setText(string.lblPaiNossoTituloLT);
                    txtOracao.setText(string.lblPaiNossoLT);
                     txtIdioma.setText(R.string.lblIdiomaPortugues);
                     imgIdioma.setImageResource(drawable.ic_portugues);
                }else if(oracaoAtual.equals(compararAverMariaPT)){
                    txtTitulo.setText(string.lblPaiNossoTituloLT);
                    txtOracao.setText(string.lblPaiNossoLT);
                     txtIdioma.setText(R.string.lblIdiomaPortugues);
                     imgIdioma.setImageResource(drawable.ic_portugues);
                }else if(idiomaAtual.equals("Glória")){
                    txtTitulo.setText(string.lblGloriaTituloLT);
                    txtOracao.setText(string.lblGloriaLT);
                     txtIdioma.setText(R.string.lblIdiomaPortugues);
                     imgIdioma.setImageResource(drawable.ic_portugues);
                }else if(idiomaAtual.equals("Jaculatória")){
                    txtTitulo.setText(string.lblJaculatoriaTituloLT);
                    txtOracao.setText(string.lblJaculatoriaLT);
                     txtIdioma.setText(R.string.lblIdiomaPortugues);
                     imgIdioma.setImageResource(drawable.ic_portugues);
                }
        }








    @SuppressLint("WrongConstant")
    public void atualizarTexto() {
            atribuir.executarTerco();
            txtTitulo.setText(atribuir.getTitulo());
            txtSub.setText(atribuir.getSubTitulo());
            imgTerco.setImageResource(atribuir.getImg());
            txtOracao.setText(atribuir.getOracao());
           //Exbir e  esconder Botão agradecimento
                if (atribuir.getExibirComponente() == 2) {
                    if (atribuir.getExibirBotao() == 2) {
                        bntTercoMT.setVisibility(View.VISIBLE);
                        txtSub.setVisibility(View.GONE);

                        txtVoltar.setVisibility(View.GONE);
                        txtPosicao.setVisibility(View.GONE);
                        txtIdioma.setVisibility(View.GONE);
                        imgIdioma.setVisibility(View.GONE);
                        imgPosicao.setVisibility(View.GONE);
                        imgVoltar.setVisibility(View.GONE);
                        //    tercoToolbar.setVisibility(View.GONE);
                    }
                } else {
                    txtSub.setVisibility(View.VISIBLE);
                }



            }





}





