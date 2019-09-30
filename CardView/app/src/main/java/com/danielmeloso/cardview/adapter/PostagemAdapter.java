package com.danielmeloso.cardview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.danielmeloso.cardview.R;
import com.danielmeloso.cardview.model.Postagem;

import java.util.List;

public class PostagemAdapter extends RecyclerView.Adapter<PostagemAdapter.MyViewHolder> {

    private List<Postagem> postagens;

    public PostagemAdapter(List<Postagem> listaPostagens ) {
        this.postagens = listaPostagens;
    }

    @NonNull
    @Override

    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from( parent.getContext())
                .inflate(R.layout.postagem_detalhe, parent, false);

        return new MyViewHolder( itemLista );
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Postagem postagem = postagens.get( position );
        holder.textUsuario.setText( postagem.getNome() );
        holder.textPostagem.setText( postagem.getPostagem() );
        holder.imagePostagem.setImageResource( postagem.getImagem() );
    }

    @Override
    public int getItemCount() {
        return postagens.size();
    }

    public class MyViewHolder extends  RecyclerView.ViewHolder{
        private TextView textUsuario;
        private TextView textPostagem;
        private ImageView imagePostagem;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            textUsuario = itemView.findViewById(R.id.textUsuario);
            textPostagem = itemView.findViewById(R.id.textDescricaoPostagem);
            imagePostagem = itemView.findViewById(R.id.imagePostagem);
        }
    }
}
