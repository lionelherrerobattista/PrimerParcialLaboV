package com.example.primerparciallabov;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.SearchView;

public class EditarProductoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editar_producto);

        //Recuperar actionBar y mostrar el botón de back
        ActionBar actionBar = super.getSupportActionBar();
        actionBar.setTitle("Editar Producto");
        actionBar.setDisplayHomeAsUpEnabled(true);

        //Recuperar elementos
        EditText edNombre = findViewById(R.id.edNombre);
        EditText edCantidad = findViewById(R.id.edCantidadProd);
        EditText edPrecio = findViewById(R.id.edPrecioProd);

        //Cargar datos
        Bundle bundle = super.getIntent().getExtras();
        edNombre.setText(bundle.getString("nombre"));
        edCantidad.setText(String.valueOf(bundle.getInt("cantidad")));
        edPrecio.setText(String.valueOf(bundle.getDouble("precio")));
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()==android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}