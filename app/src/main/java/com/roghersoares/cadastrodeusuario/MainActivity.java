package com.roghersoares.cadastrodeusuario;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    //declaração de componentes visuais e do adaptador da lista
    RecyclerView recyclerView;

    UserAdapter adapter;

    Button btnCadastrar;

    //Ateção: Atributo estático (static) permoite que os dados persistam na memória
    //enquanto o app estiver aberto e sejam acessados diretamente por outras telas (Activity)
    public static List<String> listaNomes = new ArrayList<>();

    //Método de inicialização da Activity (Ponto de entrada da tela)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Vincula o arquivo de layoute XML (activity_main.xml) a essa classe java
        setContentView(R.layout.activity_main);

        //Regra de negócio: insere um texto no topo da lista, caso ela esteja vazia
        if(listaNomes.isEmpty()) {
            listaNomes.add("nomes de Cadastro");
        }

        //Mapeamneto dos componentes do RecycleView do XML para o objeto java
        recyclerView = findViewById(R.id.recycler_view);

        //Define o LayoutManager: organix=za itens da Lista numa coluna vertical simples
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //Instância o adaptador passando a nossa lista de nomes
        adapter = new UserAdapter(listaNomes);

        //Conecta o adaptador ao RecyclerView para os dados sejam desenhados na tela
        recyclerView.setAdapter(adapter);

        //Mapea o botão de cadastro
        btnCadastrar = findViewById(R.id.btnCadastrar);

        //configura o evento de clique usando a expressão lamda (java 8+)
        btnCadastrar.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, CreateUser.class));
        });
    }


}