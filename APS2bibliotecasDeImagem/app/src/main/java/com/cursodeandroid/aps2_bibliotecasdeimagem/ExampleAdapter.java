package com.cursodeandroid.aps2_bibliotecasdeimagem;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class ExampleAdapter extends RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder> {

    private Context contexto;
    private ArrayList<ExampleItem> listaDeExemplo;

    public ExampleAdapter(Context context, ArrayList<ExampleItem> exampleList) {
        contexto = context;
        listaDeExemplo = exampleList;
    }

    @NonNull
    @Override
    public ExampleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(contexto).inflate(R.layout.example_item, parent, false);
        return new ExampleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ExampleViewHolder holder, int posicao) {
        ExampleItem itemAtual = listaDeExemplo.get(posicao);

        String imagemDaUrl = itemAtual.getImagemDaUrl();
        String nomeDoCriador = itemAtual.getCriador();
        int contadorDeCurtidas = itemAtual.getContadorDeCurtidas();

        holder.textViewCriador.setText(nomeDoCriador);
        holder.textViewCurtidas.setText("Curtidas: " + contadorDeCurtidas);
        Picasso.get().load(imagemDaUrl).fit().centerInside().into(holder.imageView);

    }

    @Override
    public int getItemCount() {
        return listaDeExemplo.size();
    }

    public class ExampleViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public TextView  textViewCriador;
        public TextView textViewCurtidas;

        public ExampleViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image_view);
            textViewCriador = itemView.findViewById(R.id.text_view_creator);
            textViewCurtidas = itemView.findViewById(R.id.text_view_likes);
        }
    }
}
