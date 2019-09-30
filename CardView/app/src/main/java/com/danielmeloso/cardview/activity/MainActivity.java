package com.danielmeloso.cardview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.danielmeloso.cardview.R;
import com.danielmeloso.cardview.adapter.PostagemAdapter;
import com.danielmeloso.cardview.model.Postagem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerPostagem;
    private List<Postagem> postagens = new ArrayList<>();

    @SuppressLint("WrongConstant")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.recyclerPostagem);

        //Definir layout
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        //((LinearLayoutManager) layoutManager).setOrientation(LinearLayout.HORIZONTAL); Horizontalmente
        //RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2); 2 cards juntos
        recyclerPostagem.setLayoutManager( layoutManager );

        //definir adapter
        this.prepararPostagens();
        PostagemAdapter adapter = new PostagemAdapter( postagens );
        recyclerPostagem.setAdapter( adapter );
    }

    public void prepararPostagens(){
        Postagem p = new Postagem("Daniel Meloso", "Encontro com a natureza", R.drawable.imagem4);
        this.postagens.add( p );

        p = new Postagem("Monique Miranda", "tbt viagem legal", R.drawable.imagem1);
        this.postagens.add( p );

        p = new Postagem("Rodrigo Meloso", "Sobre as nuvens!", R.drawable.imagem2);
        this.postagens.add( p );

        p = new Postagem("Roberta Rangel", "#Paris", R.drawable.imagem3);
        this.postagens.add( p );
    }
}
