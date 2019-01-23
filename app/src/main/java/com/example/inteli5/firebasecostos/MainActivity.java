package com.example.inteli5.firebasecostos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.inteli5.firebasecostos.adaptadores.EntidadAdapter;
import com.example.inteli5.firebasecostos.entidades.Cliente;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;

public class MainActivity extends AppCompatActivity {

    private FirebaseFirestore db = FirebaseFirestore.getInstance();
    private CollectionReference reference = db.collection("clientes");

    private EntidadAdapter adapter;
    private RecyclerView rcv;
    private Button btnCrear, btnBuscar;
    private EditText edtBuscar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCrear = findViewById(R.id.btn_crear);
        btnBuscar = findViewById(R.id.btn_buscar);
        edtBuscar = findViewById(R.id.edt_busqueda);

        btnCrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crearlocal();
            }
        });
        btnBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buscarFirebase();
            }
        });

        setupRecycler();
    }

    private void buscarFirebase() {
        if (edtBuscar.getText().toString().isEmpty()){
            Toast.makeText(this, "Barra de Busqueda Basia", Toast.LENGTH_SHORT).show();
            return;
        }

        String palabra = edtBuscar.getText().toString();

      String ola = reference.whereEqualTo("campo_busqueda",palabra).get().toString();
              //  .startAt(palabra)
               // .endAt(palabra+"\uf8ff");



        Log.e("encontro",ola);

    }

    private void crearlocal() {
        String campoBusqueda = "avion astronauta beso bisco";

        reference.add(new Cliente(123,"luis 1","SmartStore","carrera 6 ","venta de celulares","3004627579",
                654.456464,1.4546,
                "ola no se qeu soy","otro String",
                true,true,true,true,true,
                "no se ",campoBusqueda,
                1,2,3));

        Toast.makeText(this, "Cliente Creado", Toast.LENGTH_SHORT).show();
    }

    private void setupRecycler() {
        rcv = findViewById(R.id.rcv_main);

        Query query = reference.orderBy("calidad",Query.Direction.DESCENDING);

        FirestoreRecyclerOptions<Cliente> options = new FirestoreRecyclerOptions.Builder<Cliente>()
                .setQuery(query,Cliente.class)
                .build();

        adapter = new EntidadAdapter(options);
        adapter.startListening();

        rcv.setHasFixedSize(true);
        rcv.setLayoutManager(new LinearLayoutManager(this));
        rcv.setAdapter(adapter);
    }
}
