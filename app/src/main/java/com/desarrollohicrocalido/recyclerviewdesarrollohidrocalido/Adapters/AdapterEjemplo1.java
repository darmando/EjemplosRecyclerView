package com.desarrollohicrocalido.recyclerviewdesarrollohidrocalido.Adapters;

/**
 * Created by diego.lira on 26/04/2017.
 */

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import com.desarrollohicrocalido.recyclerviewdesarrollohidrocalido.ClasesRecyclerView.Ejemplo1;
import com.desarrollohicrocalido.recyclerviewdesarrollohidrocalido.ClasesRecyclerView.Principal;
import com.desarrollohicrocalido.recyclerviewdesarrollohidrocalido.R;

import java.util.List;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import com.desarrollohicrocalido.recyclerviewdesarrollohidrocalido.ClasesRecyclerView.Principal;
import com.desarrollohicrocalido.recyclerviewdesarrollohidrocalido.R;

import java.util.List;

public class AdapterEjemplo1 extends RecyclerView.Adapter<AdapterEjemplo1.ViewHolder>{

    private List<Ejemplo1> items;

    public AdapterEjemplo1(List<Ejemplo1> items) {
        this.items = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_lista_ejemplo1, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        if (items.get(position).isHabilitado()) {
            holder.txtEjemplo1.setText(items.get(position).getTextoEjemplo1());
            holder.iconoSiguiente.setImageResource(R.drawable.ic_keyboard_arrow_right);
            holder.iconoEjemplo1.setImageResource(R.drawable.ic_monito);
        }
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    //
    static class ViewHolder extends RecyclerView.ViewHolder{
        TextView txtEjemplo1;
        ImageButton iconoSiguiente,iconoEjemplo1;

        public ViewHolder(View itemView){
            super(itemView);
            txtEjemplo1 = (TextView)itemView.findViewById(R.id.txtEjemplo1);
            iconoSiguiente = (ImageButton)itemView.findViewById(R.id.iconoSiguiente);
            iconoEjemplo1 = (ImageButton)itemView.findViewById(R.id.iconoEjemplo1);
        }
    } // Fin clase ViewHolder
    //
}
