package com.danielmeloso.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarFrase(View view){
        String[] frases = {
                "Somos o que pensamos. Tudo o que somos surge com nossos pensamentos. Com nossos pensamentos, fazemos o nosso mundo.",
                "Sua tarefa é descobrir o seu trabalho e, então, com todo o coração, dedicar-se a ele.",
                "É capaz quem pensa que é capaz.",
                "Guardar raiva é como segurar um carvão em brasa com a intenção de atirá-lo em alguém; é você que se queima.",
                "É a própria mente de um homem, e não seu inimigo ou adversário, que o seduz para caminhos maléficos.",
                "Você, o seu ser, tanto quanto qualquer pessoa em todo o universo, merece o seu amor e sua afeição.",
                "Em nossas vidas, a mudança é inevitável. A perda é inevitável. A felicidade reside na nossa adaptabilidade em sobreviver a tudo de ruim.",
                "Pratiquem a bondade, não criem sofrimento, dirijam a própria mente. Esta é a essência do Budismo."};

        int numero = new Random().nextInt(frases.length);
        TextView textResultado = findViewById(R.id.textResultado);
        textResultado.setText(frases[numero]);

    }
}
