package com.danielmeloso.recycleview.activity.activity.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.danielmeloso.recycleview.R;
import com.danielmeloso.recycleview.activity.activity.RecyclerItemClickListener;
import com.danielmeloso.recycleview.activity.activity.adapter.Adapter;
import com.danielmeloso.recycleview.activity.activity.model.Filme;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Filme> listaFilmes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        //Listagem de filmes
        this.criarFilmes();

        //Configurar adapter
        Adapter adapter = new Adapter( listaFilmes );

        //Configurar RecyclerView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager( getApplicationContext() );
        recyclerView.setLayoutManager( layoutManager );
        recyclerView.setHasFixedSize( true );
        recyclerView.addItemDecoration( new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerView.setAdapter( adapter );

        //evento de Click
        recyclerView.addOnItemTouchListener(
            new RecyclerItemClickListener(
                    getApplicationContext(),
                    recyclerView,
                    new RecyclerItemClickListener.OnItemClickListener() {
                        @Override
                        public void onItemClick(View view, int position) {
                            Filme filme = listaFilmes.get( position );
                            Toast.makeText(getApplicationContext(), "Item pressionado " + filme.getTituloFilme(), Toast.LENGTH_SHORT).show();
                        }

                        @Override
                        public void onLongItemClick(View view, int position) {
                            Filme filme = listaFilmes.get( position );
                            Toast.makeText(MainActivity.this, "Clique longo " + filme.getTituloFilme(), Toast.LENGTH_SHORT).show();
                        }

                        @Override
                        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                        }
                    }
            )
        );
    }

    public void criarFilmes(){

        Filme filme = new Filme("Homem Aranha","Aventura","2019");
        this.listaFilmes.add( filme );

        filme = new Filme("Mulher Maravilha", "Fantasia", "2019");
        this.listaFilmes.add( filme );

        filme = new Filme("Liga da Justiça", "Ficção", "2018");
        this.listaFilmes.add( filme );

        filme = new Filme("Capitão América", "Aventura", "2019");
        this.listaFilmes.add( filme );

        filme = new Filme("It: A coisa", "Drama/Terror", "2017");
        this.listaFilmes.add( filme );

        filme = new Filme("Pica-Pau: O Filme", "Comédia/Animação", "2019");
        this.listaFilmes.add( filme );

        filme = new Filme("A Múmia", "Terror", "2018");
        this.listaFilmes.add( filme );

        filme = new Filme("A Bela e a Fera", "Romance", "2017");
        this.listaFilmes.add( filme );

        filme = new Filme("Meu malvado favorito 3", "Comédia", "2017");
        this.listaFilmes.add( filme );

        filme = new Filme("Carros 3", "Comédia", "2017");
        this.listaFilmes.add( filme );
    }
}
