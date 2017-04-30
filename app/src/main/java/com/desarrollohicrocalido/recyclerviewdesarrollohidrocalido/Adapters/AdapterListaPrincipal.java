package com.desarrollohicrocalido.recyclerviewdesarrollohidrocalido.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import com.desarrollohicrocalido.recyclerviewdesarrollohidrocalido.ClasesRecyclerView.Principal;
import com.desarrollohicrocalido.recyclerviewdesarrollohidrocalido.R;

import java.util.List;

/**
 * Created by diego.lira on 25/04/2017.
 */

public class AdapterListaPrincipal extends RecyclerView.Adapter<AdapterListaPrincipal.ViewHolder>{
    public interface OnItemClickListener {
        void onItemClick(Principal item);
    }
    private List<Principal> items;
    private OnItemClickListener listener;

    public AdapterListaPrincipal(List<Principal> items, OnItemClickListener listener) {
        this.items = items;
        this.listener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycleview_lista_principal, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.txtTiposRecyclerView.setText(items.get(position).getNombreTipoRecyclerView());
        holder.imgRowRight.setImageResource(R.drawable.ic_keyboard_arrow_right);
        holder.bind(items.get(position), listener);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    //
    static class ViewHolder extends RecyclerView.ViewHolder{
        TextView txtTiposRecyclerView;
        ImageButton imgRowRight;

        public ViewHolder(View itemView){
            super(itemView);
            txtTiposRecyclerView = (TextView)itemView.findViewById(R.id.txtTiposRecyclerView);
            imgRowRight = (ImageButton)itemView.findViewById(R.id.imgRowRight);
        }
        public void bind(final Principal item, final OnItemClickListener listener) {
            txtTiposRecyclerView.setOnClickListener(new View.OnClickListener() {
                @Override public void onClick(View v) {
                    listener.onItemClick(item);
                }
            });

        }

    } // Fin clase ViewHolder
    //
}
