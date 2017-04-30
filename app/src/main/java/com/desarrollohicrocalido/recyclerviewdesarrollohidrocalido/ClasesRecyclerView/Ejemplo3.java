package com.desarrollohicrocalido.recyclerviewdesarrollohidrocalido.ClasesRecyclerView;

/**
 * Created by diego.lira on 28/04/2017.
 */

public class Ejemplo3 {
    String textoEjemplo3;
    boolean habilitado;

    public Ejemplo3(String textoEjemplo3, boolean habilitado) {
        this.textoEjemplo3 = textoEjemplo3;
        this.habilitado = habilitado;
    }

    public String getTextoEjemplo3() {
        return textoEjemplo3;
    }

    public boolean isHabilitado() {
        return habilitado;
    }
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}

