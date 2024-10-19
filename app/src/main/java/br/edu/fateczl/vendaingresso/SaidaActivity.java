/**
 *@author:<ANA PAULA DE OLIVEIRA SILVA>
 *RA1110482123028
 *ANA PAULA DE OLIVEIRA SILVA
 */



package br.edu.fateczl.vendaingresso;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SaidaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saida);

        TextView tvSaida = findViewById(R.id.tvSaida);
        Button btnVoltar = findViewById(R.id.btnVoltar);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        String tipo = bundle.getString("tipo");
        float valorFinal = bundle.getFloat("valorFinal");
        String funcao = bundle.getString("funcao");

        tvSaida.setText(String.format("%s\nValor Final: R$ %.2f\nFunção: %s", tipo, valorFinal, funcao));

        btnVoltar.setOnClickListener(v -> finish());
    }
}