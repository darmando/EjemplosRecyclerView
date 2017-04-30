package com.desarrollohicrocalido.recyclerviewdesarrollohidrocalido.Adapters;

/**
 * Created by diego.lira on 28/04/2017.
 */

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.desarrollohicrocalido.recyclerviewdesarrollohidrocalido.ClasesRecyclerView.Ejemplo3;
import com.desarrollohicrocalido.recyclerviewdesarrollohidrocalido.R;

import java.util.List;



/**
 * Created by diego.lira on 27/04/2017.
 */


public class AdapterEjemplo3 extends RecyclerView.Adapter<AdapterEjemplo3.ViewHolder>{

    private List<Ejemplo3> items;

    public AdapterEjemplo3(List<Ejemplo3> items) {
        this.items = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_lista_ejemplo3, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        if (items.get(position).isHabilitado()) {
            holder.txtEjemplo3.setText(items.get(position).getTextoEjemplo3());
            holder.txtEjemplo3.setCompoundDrawablesWithIntrinsicBounds(0, R.mipmap.ic_launcher, 0, 0);
        }
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    //
    static class ViewHolder extends RecyclerView.ViewHolder{
        TextView txtEjemplo3;

        public ViewHolder(View itemView){
            super(itemView);
            txtEjemplo3 = (TextView)itemView.findViewById(R.id.txtEjemplo3);
        }
    } // Fin clase ViewHolder
    //
}
