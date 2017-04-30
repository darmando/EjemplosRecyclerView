package com.desarrollohicrocalido.recyclerviewdesarrollohidrocalido.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import com.desarrollohicrocalido.recyclerviewdesarrollohidrocalido.ClasesRecyclerView.Ejemplo1;
import com.desarrollohicrocalido.recyclerviewdesarrollohidrocalido.ClasesRecyclerView.Ejemplo2;
import com.desarrollohicrocalido.recyclerviewdesarrollohidrocalido.R;

import java.util.List;

/**
 * Created by diego.lira on 27/04/2017.
 */


public class AdapterEjemplo2 extends RecyclerView.Adapter<AdapterEjemplo2.ViewHolder>{

    private List<Ejemplo2> items;

    public AdapterEjemplo2(List<Ejemplo2> items) {
        this.items = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_lista_ejemplo2, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        if (items.get(position).isHabilitado()) {
            holder.txtTitulo.setText(items.get(position).getTitulo());
            holder.txtDetalle.setText(items.get(position).getDetalle());
            holder.imgIconoSiguiente.setImageResource(R.drawable.ic_keyboard_arrow_right);

        }
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    //
    static class ViewHolder extends RecyclerView.ViewHolder{
        TextView txtTitulo,txtDetalle;
        ImageButton imgIconoSiguiente;

        public ViewHolder(View itemView){
            super(itemView);
            txtTitulo = (TextView)itemView.findViewById(R.id.txtTitulo);
            txtDetalle = (TextView)itemView.findViewById(R.id.txtDetalle);
            imgIconoSiguiente = (ImageButton)itemView.findViewById(R.id.imgIconoSiguiente);

        }
    } // Fin clase ViewHolder
    //
}
