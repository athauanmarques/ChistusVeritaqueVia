package com.example.tercochistusveritaquevia.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.example.tercochistusveritaquevia.R;
import com.heinrichreimersoftware.materialintro.app.IntroActivity;
import com.heinrichreimersoftware.materialintro.slide.FragmentSlide;
import com.heinrichreimersoftware.materialintro.slide.SimpleSlide;

public class TercoVirtualActivity extends IntroActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

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
                .build()
        );
        addSlide(new FragmentSlide.Builder()
                .background(R.color.fundo)
                .fragment(R.layout.activity_agradecimento)
                .canGoForward(false)
                .build()
        );



    }
}