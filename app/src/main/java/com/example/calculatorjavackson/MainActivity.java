package com.example.calculatorjavackson;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    EditText valor1, valor2;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        valor1 = findViewById(R.id.valor1);
        valor2 = findViewById(R.id.valor2);
        resultado = findViewById(R.id.resultadoconta);
    }

    public void soma(View view) {
        int valori = Integer.parseInt(valor1.getText().toString());
        int valorii = Integer.parseInt(valor2.getText().toString());
        int resultadoc = valori + valorii;
        resultado.setText(resultadoc + "");
    }

    public void subtracao(View view) {
        int valori = Integer.parseInt(valor1.getText().toString());
        int valorii = Integer.parseInt(valor2.getText().toString());
        int resultadoc = valori + valorii;
        resultado.setText(resultadoc + "");
    }

    public void divisao(View view) {
        int valori = Integer.parseInt(valor1.getText().toString());
        int valorii = Integer.parseInt(valor2.getText().toString());
        float resultadoc = valori / valorii;
        resultado.setText(resultadoc + "");
    }

    public void multiplicacao(View view) {
        int valori = Integer.parseInt(valor1.getText().toString());
        int valorii = Integer.parseInt(valor2.getText().toString());
        int resultadoc = valori * valorii;
        resultado.setText(resultadoc + "");
    }

}


