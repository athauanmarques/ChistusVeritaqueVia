package com.example.tercochistusveritaquevia.Activity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.tercochistusveritaquevia.R;
import com.heinrichreimersoftware.materialintro.app.IntroActivity;
import com.heinrichreimersoftware.materialintro.slide.FragmentSlide;
import com.heinrichreimersoftware.materialintro.slide.SimpleSlide;

public class TercoVirtualActivity extends IntroActivity {

    private Button bntSalveMaria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

       // bntSalveMaria = findViewById(R.id.bntSalveMariaTV);

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

    public void onClick_exibirCreio(View view){
        AlertDialog.Builder exbirOracao = new AlertDialog.Builder(this);
        exbirOracao.setTitle("Teste Titulo");
        exbirOracao.setMessage("Teste Descrição");
        exbirOracao.show();
    }
    public void onClick_exibirPaiNosso(){

    }
    public void onClick_exibirAveMaria(){

    }
    public void onClick_exibirGloria(){

    }
    public void onClick_exibirJaculatória(){

    }


}