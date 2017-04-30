package com.desarrollohicrocalido.recyclerviewdesarrollohidrocalido;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.desarrollohicrocalido.recyclerviewdesarrollohidrocalido.Adapters.AdapterEjemplo1;
import com.desarrollohicrocalido.recyclerviewdesarrollohidrocalido.Adapters.AdapterListaPrincipal;
import com.desarrollohicrocalido.recyclerviewdesarrollohidrocalido.ClasesRecyclerView.Ejemplo1;
import com.desarrollohicrocalido.recyclerviewdesarrollohidrocalido.ClasesRecyclerView.Principal;

import java.util.ArrayList;
import java.util.List;

public class Ejemplo1Activity extends AppCompatActivity {
    private RecyclerView recyclerViewEjemplo1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejemplo1);
        llenarListaEjemplo1();
    }

    public void llenarListaEjemplo1(){
        List<Ejemplo1> oEjemplo1 = new ArrayList<>();
        String textoEjemplo;
        for (int i=0;i<15;i++){
            textoEjemplo = "Texto Ejemplo "+i;
            oEjemplo1.add(new Ejemplo1(true,textoEjemplo));
        }
        recyclerViewEjemplo1 = (RecyclerView) findViewById(R.id.recyclerViewEjemplo1);
        recyclerViewEjemplo1.setHasFixedSize(true);
        RecyclerView.LayoutManager  recylerViewLayoutManager = new LinearLayoutManager(this);
        recyclerViewEjemplo1.setLayoutManager(recylerViewLayoutManager);
        recyclerViewEjemplo1.setAdapter(new AdapterEjemplo1(oEjemplo1));
    }
}
