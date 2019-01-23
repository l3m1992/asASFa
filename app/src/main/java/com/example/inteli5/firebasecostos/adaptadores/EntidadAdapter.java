package com.example.inteli5.firebasecostos.adaptadores;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.inteli5.firebasecostos.R;
import com.example.inteli5.firebasecostos.entidades.Cliente;
import com.firebase.ui.firestore.FirestoreRecyclerAdapter;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;
import com.google.firebase.firestore.FirebaseFirestore;

public class EntidadAdapter extends FirestoreRecyclerAdapter<Cliente, EntidadAdapter.EntidadHolder> {


    /**
     * Create a new RecyclerView adapter that listens to a Firestore Query.  See {@link
     * FirestoreRecyclerOptions} for configuration options.
     *
     * @param options
     */
    public EntidadAdapter(@NonNull FirestoreRecyclerOptions<Cliente> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull EntidadHolder holder, int position, @NonNull Cliente model) {

        holder.nombre.setText(model.getNom_local());
//        holder.direccion.setText(model.getDir_local());
        holder.telefono.setText(model.getTel_local());
        holder.descripcion.setText(model.getDes_local());
        holder.actualizado.setText(String.valueOf(model.isActualizado_local()));
        holder.calidad.setText(String.valueOf(model.getCalidad()));
        holder.atencion.setText(String.valueOf(model.getAtencion()));
        holder.precio.setText(String.valueOf(model.getPrecios()));

    }

    @NonNull
    @Override
    public EntidadHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.items_recycler_main,viewGroup,false);
        return new EntidadHolder(v);
    }

    class EntidadHolder extends RecyclerView.ViewHolder{

        TextView nombre,direccion,telefono,descripcion,calidad,atencion,precio,actualizado;

        public EntidadHolder(@NonNull View itemView) {
            super(itemView);

            nombre = itemView.findViewById(R.id.nom_local);
            direccion = itemView.findViewById(R.id.direct);
            telefono = itemView.findViewById(R.id.tel_local);
            descripcion = itemView.findViewById(R.id.des_local);
            calidad = itemView.findViewById(R.id.num_calidad);
            atencion = itemView.findViewById(R.id.num_atencion);
            precio = itemView.findViewById(R.id.num_precio);
            actualizado = itemView.findViewById(R.id.txt_actualizado);





        }
    }
}
