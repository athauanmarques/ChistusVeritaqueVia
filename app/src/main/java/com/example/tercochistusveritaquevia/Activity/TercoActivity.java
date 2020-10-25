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
import com.example.tercochistusveritaquevia.controle.ProgressoTerco;

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

        atribuir.setTipoIdioma(false); //inicializar como idioma Português

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


            controleExibicao();

    }

    @SuppressLint("WrongConstant")
    @Override
    protected void onRestart() {
        super.onRestart();
        setContentView(layout.activity_terco);
        atribuir.setTipoIdioma(false); //inicializar como idioma Português

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
                Intent voltar = new Intent(TercoActivity.this, OferecimentoActivity.class);
                startActivity(voltar);
            }
        });

        txtVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent voltar = new Intent(TercoActivity.this, OferecimentoActivity.class);
                startActivity(voltar);
            }
        });

        imgIdioma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtIdioma.getText().equals("Português")) {
                    atribuir.setTipoIdioma(true);
                    txtIdioma.setText(string.lblIdiomaLatim);
                    imgIdioma.setImageResource(drawable.ic_latim);
                    mudarIdioma();
                } else {
                    atribuir.setTipoIdioma(false);
                    txtIdioma.setText(R.string.lblIdiomaPortugues);
                    imgIdioma.setImageResource(drawable.ic_portugues);
                    mudarIdioma();
                }
            }

        });

        txtIdioma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (txtIdioma.getText().equals("Português")) {
                    atribuir.setTipoIdioma(true);
                    txtIdioma.setText(string.lblIdiomaLatim);
                    imgIdioma.setImageResource(drawable.ic_latim);
                    mudarIdioma();
                } else {
                    atribuir.setTipoIdioma(true);
                    txtIdioma.setText(R.string.lblIdiomaPortugues);
                    imgIdioma.setImageResource(drawable.ic_portugues);
                    mudarIdioma();
                }
            }
        });
    }


    public void mudarIdioma() {
        final String idiomaAtual = (String) txtTitulo.getText(),
                oracaoAtual = (String) txtOracao.getText();

        // Mudar para o Português
        if (idiomaAtual.equals("Credo")) {
            txtOracao.setTextSize(10);
            atribuir.idiomaSelecionado(0, atribuir.isTipoIdioma());
            txtTitulo.setText(atribuir.getTitulo());
            txtOracao.setText(atribuir.getOracao());
        } else if (idiomaAtual.equals("Pater Noster")) {
            atribuir.idiomaSelecionado(1, atribuir.isTipoIdioma());
            txtTitulo.setText(atribuir.getTitulo());
            txtOracao.setText(atribuir.getOracao());
        } else if (idiomaAtual.equals("Gloria")) {
            atribuir.idiomaSelecionado(3, atribuir.isTipoIdioma());
            txtTitulo.setText(atribuir.getTitulo());
            txtOracao.setText(atribuir.getOracao());
        } else if (idiomaAtual.equals("Oratio Fatimae")) {
            atribuir.idiomaSelecionado(4, atribuir.isTipoIdioma());
            txtTitulo.setText(atribuir.getTitulo());
            txtOracao.setText(atribuir.getOracao());
        }//Mudar para o Latim
        else if (idiomaAtual.equals("Creio")) {
            atribuir.idiomaSelecionado(0, atribuir.isTipoIdioma());
            txtTitulo.setText(atribuir.getTitulo());
            txtOracao.setText(atribuir.getOracao());
        } else if (idiomaAtual.equals("Pai Nosso")) {
            atribuir.idiomaSelecionado(1, atribuir.isTipoIdioma());
            txtTitulo.setText(atribuir.getTitulo());
            txtOracao.setText(atribuir.getOracao());
        } else if (idiomaAtual.equals("Glória")) {
            atribuir.idiomaSelecionado(3, atribuir.isTipoIdioma());
            txtTitulo.setText(atribuir.getTitulo());
            txtOracao.setText(atribuir.getOracao());
        } else if (idiomaAtual.equals("Jaculatória")) {
            atribuir.idiomaSelecionado(4, atribuir.isTipoIdioma());
            txtTitulo.setText(atribuir.getTitulo());
            txtOracao.setText(atribuir.getOracao());
        } else if (atribuir.isTipoIdioma() && idiomaAtual.equals("Ave Maria")) {
            atribuir.idiomaSelecionado(2, atribuir.isTipoIdioma());
            txtTitulo.setText(atribuir.getTitulo());
            txtOracao.setText(atribuir.getOracao());
        } else if (!atribuir.isTipoIdioma() && idiomaAtual.equals("Ave Maria")) {
            atribuir.idiomaSelecionado(2, atribuir.isTipoIdioma());
            txtTitulo.setText(atribuir.getTitulo());
            txtOracao.setText(atribuir.getOracao());
        }
    }

                     @SuppressLint("WrongConstant")
    public void atualizarTexto() {
            txtOracao.setTextSize(16);
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
                    }
                } else {
                    txtSub.setVisibility(View.VISIBLE);
                }



            }





}





