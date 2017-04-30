package com.desarrollohicrocalido.recyclerviewdesarrollohidrocalido.ClasesRecyclerView;

/**
 * Created by diego.lira on 27/04/2017.
 */

public class Ejemplo2 {
    String titulo;
    String detalle;
    boolean habilitado;

    public Ejemplo2(String titulo, String detalle, boolean habilitado) {
        this.titulo = titulo;
        this.detalle = detalle;
        this.habilitado = habilitado;
    }
    public String getTitulo() {
        return titulo;
    }

    public String getDetalle() {
        return detalle;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
