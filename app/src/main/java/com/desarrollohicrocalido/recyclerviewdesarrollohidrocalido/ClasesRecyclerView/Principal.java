package com.desarrollohicrocalido.recyclerviewdesarrollohidrocalido.ClasesRecyclerView;

/**
 * Created by diego.lira on 25/04/2017.
 */

public class Principal {
    int idTipoRecyclerView;
    String nombreTipoRecyclerView;

    public Principal(int idTipoRecyclerView, String nombreTipoRecyclerView) {
        this.idTipoRecyclerView = idTipoRecyclerView;
        this.nombreTipoRecyclerView = nombreTipoRecyclerView;
    }

    public int getIdTipoRecyclerView() {
        return idTipoRecyclerView;
    }

    public String getNombreTipoRecyclerView() {
        return nombreTipoRecyclerView;
    }
}
