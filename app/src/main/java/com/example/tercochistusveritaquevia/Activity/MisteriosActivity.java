package com.example.tercochistusveritaquevia.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tercochistusveritaquevia.R;
import com.example.tercochistusveritaquevia.controle.MisteriosSemanal;

public class MisteriosActivity extends AppCompatActivity {

    private TextView txtTitulo, txtSubTitulo, txtDescricao;
    private Button bntIrTerco;
    private ImageView imgCenario;


    MisteriosSemanal atribuir = new MisteriosSemanal();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_misterios);

        txtTitulo = findViewById(R.id.txtTituloOracao);
        txtSubTitulo = findViewById(R.id.txtSubTituloMT);
        txtDescricao = findViewById(R.id.txtDescricaoMT);
        bntIrTerco = findViewById(R.id.bntVoltarTerco);
        imgCenario = findViewById(R.id.imgMisterio);

/*TODO Arrumar atribuição - (talvez dever criar como padrão em loren Ipson os textos, antes de atribuir)
        atribuir.atribuirTextos();
        txtTitulo.setText(atribuir.getTituloMt());
        txtSubTitulo.setText(atribuir.getSubTituloMt());
        imgCenario.setImageResource(atribuir.getImagemMt());
        txtDescricao.setText(atribuir.getDescricaoMt());

*/

    }
}