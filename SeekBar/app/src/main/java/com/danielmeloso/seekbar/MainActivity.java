package com.danielmeloso.seekbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private SeekBar seekBar;
    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar = findViewById(R.id.seekBar);
        tvResultado = findViewById(R.id.tvResultado);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                tvResultado.setText("Progresso: " + seekBar.getProgress() + " / " + seekBar.getMax());
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                //quando fazemos o primeiro movimento
                Toast.makeText(MainActivity.this, "Seekbar Alterado", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                //quando soltamos o seekbar
                Toast.makeText(MainActivity.this, "Botao seekbar nao esta mais pressionado", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
