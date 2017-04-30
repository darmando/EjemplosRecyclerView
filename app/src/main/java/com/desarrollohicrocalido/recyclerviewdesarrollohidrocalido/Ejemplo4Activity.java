package com.desarrollohicrocalido.recyclerviewdesarrollohidrocalido;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.desarrollohicrocalido.recyclerviewdesarrollohidrocalido.Adapters.AdapterEjemplo2;
import com.desarrollohicrocalido.recyclerviewdesarrollohidrocalido.Adapters.AdapterEjemplo4;
import com.desarrollohicrocalido.recyclerviewdesarrollohidrocalido.ClasesRecyclerView.Ejemplo2;
import com.desarrollohicrocalido.recyclerviewdesarrollohidrocalido.ClasesRecyclerView.Ejemplo4;

import java.util.ArrayList;
import java.util.List;

public class Ejemplo4Activity extends AppCompatActivity {
    private RecyclerView recyclerViewEjemplo4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejemplo4);
        llenarListaEjemplo4();
    }

    public void llenarListaEjemplo4() {
        recyclerViewEjemplo4 = (RecyclerView) findViewById(R.id.recyclerViewEjemplo4);
        List<Ejemplo4> oEjemplo4 = new ArrayList<>();
        String titulo,detalle;
        for (int i=0;i<15;i++){
            titulo = "Texto Ejemplo "+i;
            oEjemplo4.add(new Ejemplo4(titulo,true));
        }
        recyclerViewEjemplo4.setHasFixedSize(true);
        RecyclerView.LayoutManager  recylerViewLayoutManager = new LinearLayoutManager(this);
        recyclerViewEjemplo4.setLayoutManager(recylerViewLayoutManager);
        recyclerViewEjemplo4.setAdapter(new AdapterEjemplo4(oEjemplo4));
    }
}
