package com.example.tercochistusveritaquevia.Activity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tercochistusveritaquevia.R;
import com.example.tercochistusveritaquevia.controle.AtribuirTexto;
import com.heinrichreimersoftware.materialintro.app.IntroActivity;
import com.heinrichreimersoftware.materialintro.slide.FragmentSlide;
import com.heinrichreimersoftware.materialintro.slide.SimpleSlide;

import static androidx.appcompat.app.AlertDialog.*;

public class TercoVirtualActivity extends IntroActivity {

    AtribuirTexto atribuir = new AtribuirTexto();
    private ImageView imgMt1;
    private TextView Mt1SubTituloTV, Mt1DescricaoTV ;
    Fragment frMt1 = new Fragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Mt1DescricaoTV = findViewById(R.id.txtMt1SubTitulo);
        Mt1DescricaoTV = findViewById(R.id.txtMt1DescricaoTV);
        imgMt1 = findViewById(R.id.imgMt1TV);

        //Ocultar botões padrões do slide
        setButtonBackVisible(false);
        setButtonNextVisible(false);

        addSlide(new FragmentSlide.Builder()
                .background(R.color.fundo)
                .fragment(R.layout.activity_terco_virtual)
                .build()
        );

        addSlide(new FragmentSlide.Builder()
                .background(R.color.fundo)
                .fragment(R.layout.oremos)
                .build()
        );

        addSlide(new FragmentSlide.Builder()
                .background(R.color.fundo)
                .fragment(R.layout.misterio1)
                .build()
        );
        addSlide(new FragmentSlide.Builder()
                .background(R.color.fundo)
                .fragment(R.layout.misterio2)
                .build()
        );
        addSlide(new FragmentSlide.Builder()
                .background(R.color.fundo)
                .fragment(R.layout.misterio3)
                .build()
        );
        addSlide(new FragmentSlide.Builder()
                .background(R.color.fundo)
                .fragment(R.layout.misterio4)
                .build()
        );
        addSlide(new FragmentSlide.Builder()
                .background(R.color.fundo)
                .fragment(R.layout.misterio5)
                .canGoForward(false)
                .build()
        );



    }
    public void onClick_goSalveRainha(View v) {
        Intent intent = new Intent(TercoVirtualActivity.this, AgradecimentoActivity.class);
        startActivity(intent);
    }

    //TODO Atribuir os textos subTitulo,imagem e descrição
    public void misterioFixar(int ordemMisterio){
        atribuir.atribuirMisterios(ordemMisterio);
        imgMt1.setImageResource(atribuir.getImg());
        Mt1SubTituloTV.setText(atribuir.getSubTitulo());
        Mt1DescricaoTV.setText(atribuir.getOracao());
    }

    public void aplicarTexto(){
        AlertDialog.Builder exbirOracao = new AlertDialog.Builder(this);
        exbirOracao.setTitle(atribuir.getTitulo());
        exbirOracao.setMessage(atribuir.getOracao());
        exbirOracao.show();
    }

    public void onClick_exibirCreio(View view){
        atribuir.idiomaSelecionado(0);
        aplicarTexto();
    }

    public void onClick_exibirPaiNosso(View view){
        atribuir.idiomaSelecionado(1);
        aplicarTexto();
    }
    public void onClick_exibirAveMaria(View view){
        atribuir.idiomaSelecionado(2);
        aplicarTexto();
    }
    public void onClick_exibirGloria(View view){
        atribuir.idiomaSelecionado(3);
        aplicarTexto();
    }
    public void onClick_exibirJaculatória(View view){
        atribuir.idiomaSelecionado(4);
        aplicarTexto();
    }


}