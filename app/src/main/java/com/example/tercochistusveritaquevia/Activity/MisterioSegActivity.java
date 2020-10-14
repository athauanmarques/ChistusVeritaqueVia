package com.example.tercochistusveritaquevia.Activity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.tercochistusveritaquevia.R;
import com.example.tercochistusveritaquevia.controle.AtribuirTexto;
import com.heinrichreimersoftware.materialintro.app.IntroActivity;
import com.heinrichreimersoftware.materialintro.slide.FragmentSlide;

public class MisterioSegActivity extends IntroActivity {
    AtribuirTexto atribuir = new AtribuirTexto();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Ocultar botões padrões do slide
        setButtonBackVisible(false);
        setButtonNextVisible(false);

        addSlide(new FragmentSlide.Builder()
                .background(R.color.fundo)
                .fragment(R.layout.activity_misterio_seg)
                .build()
        );

        addSlide(new FragmentSlide.Builder()
                .background(R.color.fundo)
                .fragment(R.layout.misterio_seg_oremos)
                .build()
        );

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

    public void onClick_goAgradecimento(View view) {
        Intent intent = new Intent(MisterioSegActivity.this, AgradecimentoActivity.class);
        startActivity(intent);
    }

    public void aplicarTextoDialog(){
        AlertDialog.Builder exbirOracao = new AlertDialog.Builder(this);
        exbirOracao.setTitle(atribuir.getTitulo());
        exbirOracao.setMessage(atribuir.getOracao());
        exbirOracao.show();
    }
//TODO Arrumar exibição do dialog
    public void onClick_CreioExibir(View view){
        atribuir.idiomaSelecionado(0);
        aplicarTextoDialog();
    }

    public void onClick_PaiNossoExibir(View view){
        atribuir.idiomaSelecionado(1);
        aplicarTextoDialog();
    }
    public void onClick_AveMariaExibir(View view){
        atribuir.idiomaSelecionado(2);
        aplicarTextoDialog();
    }
    public void onClick_GloriaExibir(View view){
        atribuir.idiomaSelecionado(3);
        aplicarTextoDialog();
    }
    public void onClick_JaculatoriaExibir(View view){
        atribuir.idiomaSelecionado(4);
        aplicarTextoDialog();
    }


}