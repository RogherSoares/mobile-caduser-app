package com.roghersoares.cadastrodeusuario;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

//Classe Adapter: Gererncia a criação e o preenchimento dos itens na RecycleView
public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {
    //Atributo privado que armazena a referencia dos dados que serao exibidos
    private List<String> listaUsuarios;
    //Construtor que permite que a MAinActivity "entregue" a lista de dados para este adapter
    public UserAdapter(List<String> lista) {
        this.listaUsuarios = lista;
    }

    //Método 1: Cria "do zero" o visual de uma linha da lista (+ViewHolder)
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //LayoutInFlater transforma o arquivo XML em um objeto View Java
        //Aqui usamos o Layout padrão do Android (simple_list_item_1) para facilitar
        View view = LayoutInflater.from(parent.getContext()).inflate(android.R.layout.simple_list_item_1, parent, false);
    }

}
