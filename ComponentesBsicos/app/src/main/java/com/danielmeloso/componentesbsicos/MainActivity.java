package com.danielmeloso.componentesbsicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText campoProduto;
    private TextView resultado;
    private CheckBox cbBranco, cbVerde, cbPreto;
    List<String> check = new ArrayList<String>();
    private RadioGroup rgEstoque;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoProduto = findViewById(R.id.etNomeProduto);
        resultado = findViewById(R.id.tvResultado);
        cbBranco = findViewById(R.id.cbBranco);
        cbVerde = findViewById(R.id.cbVerde);
        cbPreto = findViewById(R.id.cbPreto);
        rgEstoque = findViewById(R.id.rgEstoque);

        verificaRadioButton();
    }

    public void EnviarFormulario(View view){
        String nomeProduto = campoProduto.getText().toString();
        resultado.setText(nomeProduto);

    }

    public void verificaCheck(View view){

        check.clear();

        if ( cbBranco.isChecked() ){
            check.add( cbBranco.getText().toString());
        }
        if ( cbVerde.isChecked() ){
            check.add( cbVerde.getText().toString());
        }
        if ( cbPreto.isChecked()){
            check.add( cbPreto.getText().toString());
        }

        resultado.setText( check.toString() );
    }

    public void verificaRadioButton(){
        rgEstoque.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if ( checkedId == R.id.rbSim){
                    resultado.setText("DISPONIVEL em estoque");
                } else {
                    resultado.setText("INDISPONIVEL em estoque");
                }
            }
        });
    }
}
