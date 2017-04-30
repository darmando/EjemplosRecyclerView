package com.desarrollohicrocalido.recyclerviewdesarrollohidrocalido;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import com.desarrollohicrocalido.recyclerviewdesarrollohidrocalido.Adapters.AdapterEjemplo1;
import com.desarrollohicrocalido.recyclerviewdesarrollohidrocalido.Adapters.AdapterEjemplo3;
import com.desarrollohicrocalido.recyclerviewdesarrollohidrocalido.ClasesRecyclerView.Ejemplo1;
import com.desarrollohicrocalido.recyclerviewdesarrollohidrocalido.ClasesRecyclerView.Ejemplo3;

import java.util.ArrayList;
import java.util.List;

public class Ejemplo3Activity extends AppCompatActivity {
    private RecyclerView recyclerViewEjemplo3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejemplo3);
        llenarListaEjemplo3();
    }
    public void llenarListaEjemplo3(){
        recyclerViewEjemplo3 = (RecyclerView) findViewById(R.id.recyclerViewEjemplo3);
        List<Ejemplo3> oEjemplo3 = new ArrayList<>();
        String textoEjemplo;
        for (int i=0;i<10;i++){
            textoEjemplo = "Texto Ejemplo "+i;
            oEjemplo3.add(new Ejemplo3(textoEjemplo,true));
        }
        recyclerViewEjemplo3.setHasFixedSize(true);
        StaggeredGridLayoutManager horizontalLayoutManagaer =
                new StaggeredGridLayoutManager(
                        3,StaggeredGridLayoutManager.VERTICAL);

        recyclerViewEjemplo3.setLayoutManager(horizontalLayoutManagaer);
        recyclerViewEjemplo3.setAdapter(new AdapterEjemplo3(oEjemplo3));

    }
}
