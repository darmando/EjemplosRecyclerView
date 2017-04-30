package com.desarrollohicrocalido.recyclerviewdesarrollohidrocalido.ClasesRecyclerView;

/**
 * Created by diego.lira on 26/04/2017.
 */

public class Ejemplo1 {
    boolean habilitado;
    String textoEjemplo1;

    public Ejemplo1(boolean habilitado, String textoEjemplo1) {
        this.habilitado = habilitado;
        this.textoEjemplo1 = textoEjemplo1;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public String getTextoEjemplo1() {
        return textoEjemplo1;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
