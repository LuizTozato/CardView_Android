package com.ugps.cardview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.ugps.cardview.R;
import com.ugps.cardview.adapter.PostagemAdapter;
import com.ugps.cardview.model.Postagem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerPostagem;
    private List<Postagem> postagens = new ArrayList<>(); //recebe o array para não nascer com Null

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.recyclerPostagem);

        //Define o layout
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerPostagem.setLayoutManager(layoutManager);

        //Define o adapter
        this.prepararPostagens();
        PostagemAdapter adapter = new PostagemAdapter(postagens);
        recyclerPostagem.setAdapter(adapter);
    }

    //Methods ==================================================
    public void prepararPostagens(){

        Postagem p = new Postagem(
                "Prefeitura de Jundiaí",
                "Essa é a prefeitura",
                R.drawable.prefeitura
        );
        this.postagens.add(p);
        //================
        p = new Postagem(
                "We can do it! (1)",
                "Yes we can",
                R.drawable.we_can_do_it_1
        );
        this.postagens.add(p);
        //================
        p = new Postagem(
                "We can do it! (2)",
                "Yes we can",
                R.drawable.we_can_do_it_2
        );
        this.postagens.add(p);
        //================
        p = new Postagem(
                "We can do it! (3)",
                "Yes we can",
                R.drawable.we_can_do_it_3
        );
        this.postagens.add(p);
        //================


    }
}
