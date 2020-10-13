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
    private ImageView imgMt1, imgMt2, imgMt3, imgMt4, imgMt5;
    private TextView Mt1SubTituloTV, Mt2SubTituloTV, Mt3SubTituloTV, Mt4SubTituloTV, Mt5SubTituloTV,
                     Mt1DescricaoTV, Mt2DescricaoTV, Mt3DescricaoTV, Mt4DescricaoTV, Mt5DescricaoTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        imgMt1 = findViewById(R.id.imgMt1TV);
        imgMt2 = findViewById(R.id.imgMt2TV);
        imgMt3 = findViewById(R.id.imgMt3TV);
        imgMt4 = findViewById(R.id.imgMt4TV);
        imgMt5 = findViewById(R.id.imgMt5TV);
        Mt1SubTituloTV = findViewById(R.id.txtMt1SubTitulo);
        Mt2SubTituloTV = findViewById(R.id.txtMt2SubTitulo);
        Mt3SubTituloTV = findViewById(R.id.txtMt3SubTitulo);
        Mt4SubTituloTV = findViewById(R.id.txtMt4SubTitulo);
        Mt5SubTituloTV = findViewById(R.id.txtMt5SubTitulo);
        Mt1DescricaoTV = findViewById(R.id.txtMt1DescricaoTV);
        Mt2DescricaoTV = findViewById(R.id.txtMt2DescricaoTV);
        Mt3DescricaoTV = findViewById(R.id.txtMt3DescricaoTV);
        Mt4DescricaoTV = findViewById(R.id.txtMt4DescricaoTV);
        Mt5DescricaoTV = findViewById(R.id.txtMt5DescricaoTV);

       // misterioFixar();

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
    public void misterioFixar(){

        atribuir.atribuirMisterios();
        imgMt1.setImageResource(atribuir.getImgMt1Tv());
        imgMt2.setImageResource(atribuir.getImgMt2Tv());
        imgMt3.setImageResource(atribuir.getImgMt3Tv());
        imgMt4.setImageResource(atribuir.getImgMt4Tv());
        imgMt5.setImageResource(atribuir.getImgMt5Tv());

        Mt1SubTituloTV.setText(atribuir.getSubTituloMt1Tv());
        Mt2SubTituloTV.setText(atribuir.getSubTituloMt2Tv());
        Mt3SubTituloTV.setText(atribuir.getSubTituloMt3Tv());
        Mt4SubTituloTV.setText(atribuir.getSubTituloMt4Tv());
        Mt5SubTituloTV.setText(atribuir.getSubTituloMt5Tv());

        Mt1DescricaoTV.setText(atribuir.getDescricaoMt1Tv());
        Mt2DescricaoTV.setText(atribuir.getDescricaoMt2Tv());
        Mt3DescricaoTV.setText(atribuir.getDescricaoMt3Tv());
        Mt4DescricaoTV.setText(atribuir.getDescricaoMt4Tv());
        Mt5DescricaoTV.setText(atribuir.getDescricaoMt5Tv());
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