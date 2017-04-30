package com.desarrollohicrocalido.recyclerviewdesarrollohidrocalido.Adapters;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SwitchCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import com.desarrollohicrocalido.recyclerviewdesarrollohidrocalido.ClasesRecyclerView.Ejemplo4;
import com.desarrollohicrocalido.recyclerviewdesarrollohidrocalido.R;

import java.util.List;

/**
 * Created by diego.lira on 28/04/2017.
 */

public class AdapterEjemplo4 extends RecyclerView.Adapter<AdapterEjemplo4.ViewHolder>{

    private List<Ejemplo4> items;

    public AdapterEjemplo4(List<Ejemplo4> items) {
        this.items = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_lista_ejemplo4, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        if (items.get(position).isHabilitado()) {
            holder.txtEjemplo4.setText(items.get(position).getTextoEjemplo4());
        }
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    //
    static class ViewHolder extends RecyclerView.ViewHolder{
        TextView txtEjemplo4;
        public ViewHolder(View itemView){
            super(itemView);
            txtEjemplo4 = (TextView)itemView.findViewById(R.id.txtEjemplo4);
        }
    } // Fin clase ViewHolder
    //
}
