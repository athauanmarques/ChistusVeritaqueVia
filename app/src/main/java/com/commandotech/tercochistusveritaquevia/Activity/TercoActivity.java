package com.commandotech.tercochistusveritaquevia.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.commandotech.tercochistusveritaquevia.R;
import com.commandotech.tercochistusveritaquevia.controle.AtribuirTexto;

import static com.commandotech.tercochistusveritaquevia.R.*;

public class TercoActivity extends AppCompatActivity {

    AtribuirTexto atribuir = new AtribuirTexto();

    private ImageView imgIdioma, imgPosicao, imgVoltar;
    private ImageButton imgTerco;
    private TextView txtTitulo, txtOracao, txtSub, txtVoltar, txtPosicao, txtIdioma;

    @SuppressLint("WrongConstant")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_terco);

       // atribuir.setTipoIdioma(false); //inicializar como idioma Português

        imgTerco = findViewById(id.imgTerco);
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
        barraStatusTranparente();

    }

    @SuppressLint("WrongConstant")
    @Override
    protected void onRestart() {
        super.onRestart();
        setContentView(layout.activity_terco);
      //  atribuir.setTipoIdioma(false); //inicializar como idioma Português

        imgTerco = findViewById(R.id.imgTerco);
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
        barraStatusTranparente();

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
                    mudarIdioma(atribuir.isTipoIdioma());
                    txtIdioma.setText(string.lblIdiomaLatim);
                    imgIdioma.setImageResource(drawable.ic_latim);
                } else {
                    atribuir.setTipoIdioma(false);
                    mudarIdioma(atribuir.isTipoIdioma());
                    txtIdioma.setText(R.string.lblIdiomaPortugues);
                    imgIdioma.setImageResource(drawable.ic_portugues);
                }
            }

        });

        txtIdioma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtIdioma.getText().equals("Português")) {
                    atribuir.setTipoIdioma(true);
                    mudarIdioma(atribuir.isTipoIdioma());
                    txtIdioma.setText(string.lblIdiomaLatim);
                    imgIdioma.setImageResource(drawable.ic_latim);
                } else {
                    atribuir.setTipoIdioma(false);
                    mudarIdioma(atribuir.isTipoIdioma());
                    txtIdioma.setText(R.string.lblIdiomaPortugues);
                    imgIdioma.setImageResource(drawable.ic_portugues);

                }
            }
        });
    }


    public void mudarIdioma(boolean tipoIdioma) {
        final String idiomaAtual = (String) txtTitulo.getText();
        // Mudar para o Português
        if (idiomaAtual.equals("Credo")) {
            txtOracao.setTextSize(10);
            atribuir.idiomaSelecionado(0, tipoIdioma);
            txtTitulo.setText(atribuir.getTitulo());
            txtOracao.setText(atribuir.getOracao());
        } else if (idiomaAtual.equals("Pater Noster")) {
            atribuir.idiomaSelecionado(1, tipoIdioma);
            txtTitulo.setText(atribuir.getTitulo());
            txtOracao.setText(atribuir.getOracao());
        } else if (idiomaAtual.equals("Gloria")) {
            atribuir.idiomaSelecionado(3, tipoIdioma);
            txtTitulo.setText(atribuir.getTitulo());
            txtOracao.setText(atribuir.getOracao());
        } else if (idiomaAtual.equals("Oratio Fatimae")) {
            atribuir.idiomaSelecionado(4, tipoIdioma);
            txtTitulo.setText(atribuir.getTitulo());
            txtOracao.setText(atribuir.getOracao());
        }//Mudar para o Latim
        else if (idiomaAtual.equals("Creio")) {
            atribuir.idiomaSelecionado(0, tipoIdioma);
            txtTitulo.setText(atribuir.getTitulo());
            txtOracao.setText(atribuir.getOracao());
        } else if (idiomaAtual.equals("Pai Nosso")) {
            atribuir.idiomaSelecionado(1, tipoIdioma);
            txtTitulo.setText(atribuir.getTitulo());
            txtOracao.setText(atribuir.getOracao());
        } else if (idiomaAtual.equals("Glória")) {
            atribuir.idiomaSelecionado(3, tipoIdioma);
            txtTitulo.setText(atribuir.getTitulo());
            txtOracao.setText(atribuir.getOracao());
        } else if (idiomaAtual.equals("Jaculatória")) {
            atribuir.idiomaSelecionado(4, tipoIdioma);
            txtTitulo.setText(atribuir.getTitulo());
            txtOracao.setText(atribuir.getOracao());
        } else if (atribuir.isTipoIdioma() && idiomaAtual.equals("Ave Maria")) {
            atribuir.idiomaSelecionado(2, tipoIdioma);
            txtTitulo.setText(atribuir.getTitulo());
            txtOracao.setText(atribuir.getOracao());
        } else if (!atribuir.isTipoIdioma() && idiomaAtual.equals("Ave Maria")) {
            atribuir.idiomaSelecionado(2, tipoIdioma);
            txtTitulo.setText(atribuir.getTitulo());
            txtOracao.setText(atribuir.getOracao());
        }
    }

                     @SuppressLint("WrongConstant")
    public void atualizarTexto() {
            txtOracao.setTextSize(12);
            atribuir.executarTerco();
            txtTitulo.setText(atribuir.getTitulo());
            txtSub.setText(atribuir.getSubTitulo());
            imgTerco.setImageResource(atribuir.getImg());
            txtOracao.setText(atribuir.getOracao());

           //Exbir e  esconder Botão agradecimento
                if (atribuir.getExibirComponente() == 2) {
                    if (atribuir.getExibirBotao() == 2) {
                        Intent intent = new Intent(TercoActivity.this, AgradecimentoActivity.class);
                        startActivity(intent);
                    }
                } else {
                    txtSub.setVisibility(View.VISIBLE);
                }



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





