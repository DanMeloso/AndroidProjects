package com.danielmeloso.componentesdeinterface2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private ToggleButton toggleEstado;
    private Switch switchEstado;
    private CheckBox checkBoxEstado;
    private TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toggleEstado = findViewById(R.id.toggleEstado);
        switchEstado = findViewById(R.id.switchEstado);
        checkBoxEstado = findViewById(R.id.checkEstado);
        textResultado = findViewById(R.id.textResultado);

    }

    public void enviar(View view){

        /*if ( toggleEstado.isChecked() ){
            textResultado.setText("Toogle ligado");
        } else {
            textResultado.setText("Toogle desligado");
        }*/

        /*if ( switchEstado.isChecked() ){
            textResultado.setText("Switch ligado");
        } else {
            textResultado.setText("Switch desligado");
        }*/

        if ( checkBoxEstado.isChecked() ){
            textResultado.setText("CheckBox ligado");
        } else {
            textResultado.setText("CheckBox desligado");
        }

    }
}
