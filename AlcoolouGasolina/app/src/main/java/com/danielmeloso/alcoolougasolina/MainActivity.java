package com.danielmeloso.alcoolougasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etPrecoAlcool, etPrecoGasolina;
    private Button btCalcular;
    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etPrecoAlcool = findViewById(R.id.etPrecoAlcool);
        etPrecoGasolina = findViewById(R.id.etPrecoGasolina);
        btCalcular = findViewById(R.id.btCalcular);
        tvResultado = findViewById(R.id.tvResultado);

    }
    public void calcularPreco(View view){
        String precoAlcool = etPrecoAlcool.getText().toString();
        String precoGasolina = etPrecoGasolina.getText().toString();
        Boolean camposValidados = this.validarCampos(precoAlcool, precoGasolina);
        if ( camposValidados ){
            calcularMelhorPreco(precoAlcool, precoGasolina);
        } else {
            tvResultado.setText("Preencha os campos primeiro!");
        }
    }

    public boolean validarCampos(String pAlcool, String pGasolina){
        Boolean camposValidados = true;

        if ( pAlcool == null || pAlcool.equals("")){
            camposValidados = false;
        } else if ( pGasolina == null || pGasolina.equals("") ){
            camposValidados = false;
        }
        return(camposValidados);
    }

    public void calcularMelhorPreco(String pAlcool, String pGasolina){
        //converter calores string para numeros
        Double precoAlcool = Double.parseDouble(pAlcool);
        Double precoGasolina = Double.parseDouble(pGasolina);

        /*Faz calculo ( precoAlcool / precoGasolina)
            Se resultado >= 0.7 --> melhor utilizar gasolina
            Senao, melhor utilizar Alcool
         */
        Double resultado = precoAlcool / precoGasolina;
        if ( resultado >= 0.7 ){
            tvResultado.setText("Melhor utilizar GASOLINA");
        } else {
            tvResultado.setText("Melhor utilizar ALCOOL");
        }
    }
}
