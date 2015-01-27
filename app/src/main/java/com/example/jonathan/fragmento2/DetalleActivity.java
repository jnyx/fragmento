package com.example.jonathan.fragmento2;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

/**
 * Created by jonathan on 25/01/15.
 */
public class DetalleActivity extends FragmentActivity {
    public static final String EXTRA_TEXTO = "com.example.jonathan.fragmento2.EXTRA_TEXTO";

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView (R.layout.activity_detalle);

        FragmentDetalle detalle = (FragmentDetalle)getSupportFragmentManager().findFragmentById(R.id.FrgDetalle);

        detalle.mostrarDetalle(getIntent().getStringExtra(EXTRA_TEXTO));
    }
}
