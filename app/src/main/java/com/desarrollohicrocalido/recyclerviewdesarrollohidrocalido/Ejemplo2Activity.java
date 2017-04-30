package com.desarrollohicrocalido.recyclerviewdesarrollohidrocalido;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.desarrollohicrocalido.recyclerviewdesarrollohidrocalido.Adapters.AdapterEjemplo1;
import com.desarrollohicrocalido.recyclerviewdesarrollohidrocalido.Adapters.AdapterEjemplo2;
import com.desarrollohicrocalido.recyclerviewdesarrollohidrocalido.ClasesRecyclerView.Ejemplo1;
import com.desarrollohicrocalido.recyclerviewdesarrollohidrocalido.ClasesRecyclerView.Ejemplo2;

import java.util.ArrayList;
import java.util.List;

public class Ejemplo2Activity extends AppCompatActivity {
    private RecyclerView recyclerViewEjemplo2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejemplo2);
        llenarListaEjemplo2();
    }

    public void llenarListaEjemplo2(){
        List<Ejemplo2> oEjemplo2 = new ArrayList<>();
        String titulo,detalle;
        for (int i=0;i<15;i++){
            titulo = "Titulo Ejemplo "+i;
            detalle = "Detalle Ejemplo "+i;
            oEjemplo2.add(new Ejemplo2(titulo,detalle,true));
        }
        recyclerViewEjemplo2 = (RecyclerView) findViewById(R.id.recyclerViewEjemplo2);
        recyclerViewEjemplo2.setHasFixedSize(true);
        RecyclerView.LayoutManager  recylerViewLayoutManager = new LinearLayoutManager(this);
        recyclerViewEjemplo2.setLayoutManager(recylerViewLayoutManager);
        recyclerViewEjemplo2.setAdapter(new AdapterEjemplo2(oEjemplo2));
    }
}

