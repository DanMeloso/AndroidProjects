package com.danielmeloso.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void enviar(View view){
        //Toast.makeText(getApplicationContext(), "Botao pressionado", Toast.LENGTH_SHORT).show();
        ImageView imagem = new ImageView(getApplicationContext());
        imagem.setImageResource(android.R.drawable.star_big_off);

        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView( imagem );
        toast.show();
    }
}
