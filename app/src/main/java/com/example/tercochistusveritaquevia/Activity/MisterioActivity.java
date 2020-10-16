package com.example.tercochistusveritaquevia.Activity;

import androidx.appcompat.app.AlertDialog;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.tercochistusveritaquevia.R;
import com.example.tercochistusveritaquevia.controle.AtribuirTexto;
import com.example.tercochistusveritaquevia.controle.ProgressoTerco;
import com.heinrichreimersoftware.materialintro.app.IntroActivity;
import com.heinrichreimersoftware.materialintro.slide.FragmentSlide;

public class MisterioActivity extends IntroActivity {
    AtribuirTexto atribuir = new AtribuirTexto();
    ProgressoTerco ctrlMisterio = new AtribuirTexto();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Ocultar botões padrões do slide
        setButtonBackVisible(false);
        setButtonNextVisible(false);

        addSlide(new FragmentSlide.Builder()
                .background(R.color.fundo)
                .fragment(R.layout.activity_misterio)
                .build()
        );

        addSlide(new FragmentSlide.Builder()
                .background(R.color.fundo)
                .fragment(R.layout.misterio_oremos)
                .build()
        );

        if(ctrlMisterio.diaHoje() == 2 || ctrlMisterio.diaHoje() == 7){

            addSlide(new FragmentSlide.Builder()
                    .background(R.color.fundo)
                    .fragment(R.layout.misterio_seg_primeiro)
                    .build()
            );

            addSlide(new FragmentSlide.Builder()
                    .background(R.color.fundo)
                    .fragment(R.layout.misterio_seg_segundo)
                    .build()
            );

            addSlide(new FragmentSlide.Builder()
                    .background(R.color.fundo)
                    .fragment(R.layout.misterio_seg_terceiro)
                    .build()
            );

            addSlide(new FragmentSlide.Builder()
                    .background(R.color.fundo)
                    .fragment(R.layout.misterio_seg_quarto)
                    .build()
            );

            addSlide(new FragmentSlide.Builder()
                    .background(R.color.fundo)
                    .fragment(R.layout.misterio_seg_quinto)
                    .canGoForward(false)
                    .build()
            );
        }
        else if(ctrlMisterio.diaHoje() == 3 || ctrlMisterio.diaHoje() == 6){
            addSlide(new FragmentSlide.Builder()
                    .background(R.color.fundo)
                    .fragment(R.layout.misterio_ter_primeiro)
                    .build()
            );

            addSlide(new FragmentSlide.Builder()
                    .background(R.color.fundo)
                    .fragment(R.layout.misterio_ter_segundo)
                    .build()
            );

            addSlide(new FragmentSlide.Builder()
                    .background(R.color.fundo)
                    .fragment(R.layout.misterio_ter_terceiro)
                    .build()
            );

            addSlide(new FragmentSlide.Builder()
                    .background(R.color.fundo)
                    .fragment(R.layout.misterio_ter_quarto)
                    .build()
            );

            addSlide(new FragmentSlide.Builder()
                    .background(R.color.fundo)
                    .fragment(R.layout.misterio_ter_quinto)
                    .canGoForward(false)
                    .build()
            );
        }else if(ctrlMisterio.diaHoje() == 4 || ctrlMisterio.diaHoje() == 1){
            addSlide(new FragmentSlide.Builder()
                    .background(R.color.fundo)
                    .fragment(R.layout.misterio_dom_primeiro)
                    .build()
            );

            addSlide(new FragmentSlide.Builder()
                    .background(R.color.fundo)
                    .fragment(R.layout.misterio_dom_segundo)
                    .build()
            );

            addSlide(new FragmentSlide.Builder()
                    .background(R.color.fundo)
                    .fragment(R.layout.misterio_dom_terceiro)
                    .build()
            );

            addSlide(new FragmentSlide.Builder()
                    .background(R.color.fundo)
                    .fragment(R.layout.misterio_dom_quarto)
                    .build()
            );

            addSlide(new FragmentSlide.Builder()
                    .background(R.color.fundo)
                    .fragment(R.layout.misterio_dom_quinto)
                    .canGoForward(false)
                    .build()
            );
        }else if(ctrlMisterio.diaHoje() == 5){
            addSlide(new FragmentSlide.Builder()
                    .background(R.color.fundo)
                    .fragment(R.layout.misterio_qui_primeiro)
                    .build()
            );

            addSlide(new FragmentSlide.Builder()
                    .background(R.color.fundo)
                    .fragment(R.layout.misterio_qui_segundo)
                    .build()
            );

            addSlide(new FragmentSlide.Builder()
                    .background(R.color.fundo)
                    .fragment(R.layout.misterio_qui_terceiro)
                    .build()
            );

            addSlide(new FragmentSlide.Builder()
                    .background(R.color.fundo)
                    .fragment(R.layout.misterio_qui_quarto)
                    .build()
            );

            addSlide(new FragmentSlide.Builder()
                    .background(R.color.fundo)
                    .fragment(R.layout.misterio_qui_quinto)
                    .canGoForward(false)
                    .build()
            );

        }

    }

    public void goAgradecimento(View view) {
        Intent intent = new Intent(MisterioActivity.this, AgradecimentoActivity.class);
        startActivity(intent);
    }

    public void aplicarTextoDialog(){
        AlertDialog.Builder exbirOracao = new AlertDialog.Builder(this, R.style.caixaDialogo);
        exbirOracao.setTitle(atribuir.getTitulo());
        exbirOracao.setMessage(atribuir.getOracao());
        exbirOracao.show();
    }

    public void goCreioExibir(View view){
        atribuir.idiomaSelecionado(0);
        aplicarTextoDialog();
    }

    public void goPaiNossoExibir(View view){
        atribuir.idiomaSelecionado(1);
        aplicarTextoDialog();
    }
    public void goAveMariaExibir(View view){
        atribuir.idiomaSelecionado(2);
        aplicarTextoDialog();
    }
    public void goGloriaExibir(View view){
        atribuir.idiomaSelecionado(3);
        aplicarTextoDialog();
    }
    public void goJaculatoriaExibir(View view){
        atribuir.idiomaSelecionado(4);
        aplicarTextoDialog();
    }


}