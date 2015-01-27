package com.example.jonathan.fragmento2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

/**
 * Created by jonathan on 24/01/15.
 */
public class MainActivity extends FragmentActivity implements FragmentListado.CorreosListener {

    @Override
    public void onCreate(Bundle saveInstanceState){
       super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_main);

        FragmentListado frgListado = (FragmentListado)getSupportFragmentManager().findFragmentById(R.id.FrgListado);
        frgListado.setCorreosListener(this);

    }

    @Override
    public void onCorreoSeleccionado(Correo c){
        boolean hayDetalle = (getSupportFragmentManager().findFragmentById(R.id.FrgDetalle) != null);

        if(hayDetalle)
            ((FragmentDetalle)getSupportFragmentManager().findFragmentById(R.id.FrgDetalle)).mostrarDetalle(c.getTexto());
        else{
            Intent i = new Intent(this, FragmentDetalle.class);
            i.putExtra(DetalleActivity.EXTRA_TEXTO,c.getTexto());
            startActivity(i);
        }
    }
}
