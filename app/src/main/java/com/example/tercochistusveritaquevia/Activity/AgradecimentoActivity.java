package com.example.tercochistusveritaquevia.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.tercochistusveritaquevia.R;

public class AgradecimentoActivity extends AppCompatActivity {

    private Button bntSalve;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agradecimento);
        bntSalve = findViewById(R.id.bntSalveMaria);

        bntSalve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AgradecimentoActivity.this, SalveRainhaActivity.class);
                startActivity(intent);
            }
        });
    }
}