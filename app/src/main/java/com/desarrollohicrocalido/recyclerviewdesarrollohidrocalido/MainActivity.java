package com.desarrollohicrocalido.recyclerviewdesarrollohidrocalido;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.desarrollohicrocalido.recyclerviewdesarrollohidrocalido.Adapters.AdapterListaPrincipal;
import com.desarrollohicrocalido.recyclerviewdesarrollohidrocalido.ClasesRecyclerView.Principal;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerViewPrincipal;
    private Intent oIntent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        llenarListaPrincipal();

    }

    @Override
    protected void onResume() {
        super.onResume();
        llenarListaPrincipal();
    }

    public void llenarListaPrincipal(){
        recyclerViewPrincipal = (RecyclerView) findViewById(R.id.recyclerViewPrincipal); // RecyclerView
        List<Principal> oPrincipal = new ArrayList<>();
        for(int x=1;x<5;x++){
          oPrincipal.add(new Principal(x,"Ejemplo "+x));
        }
        recyclerViewPrincipal.setHasFixedSize(true);
        RecyclerView.LayoutManager  recylerViewLayoutManager = new LinearLayoutManager(this);
        recyclerViewPrincipal.setLayoutManager(recylerViewLayoutManager);
        recyclerViewPrincipal.setAdapter(new AdapterListaPrincipal(oPrincipal, new AdapterListaPrincipal.OnItemClickListener() {
            @Override public void onItemClick(Principal item) {
                System.out.println(item.getNombreTipoRecyclerView());
                switch(item.getIdTipoRecyclerView()){
                    case 1:
                        oIntent = new Intent(MainActivity.this, Ejemplo1Activity.class);
                        startActivity(oIntent);
                        break;
                    case 2:
                        oIntent = new Intent(MainActivity.this, Ejemplo2Activity.class);
                        startActivity(oIntent);
                        break;
                    case 3:
                        oIntent = new Intent(MainActivity.this, Ejemplo3Activity.class);
                        startActivity(oIntent);
                        break;
                    case 4:
                        oIntent = new Intent(MainActivity.this, Ejemplo4Activity.class);
                        startActivity(oIntent);
                        break;

                }
            }
        }));
    }
}
