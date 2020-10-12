package com.example.tercochistusveritaquevia.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.tercochistusveritaquevia.R;

public class SalveRainhaActivity extends AppCompatActivity {

    private Button bntCarpeDiem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salve_rainha);
        bntCarpeDiem = findViewById(R.id.bntCarpeDiem);
        final Intent intent = new Intent(this, SelecaoActivity.class);

        bntCarpeDiem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });

    }




}