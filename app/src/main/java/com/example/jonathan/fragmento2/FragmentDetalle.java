package com.example.jonathan.fragmento2;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by jonathan on 24/01/15.
 */
public class FragmentDetalle extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle saveInstanceState){
        return inflater.inflate(R.layout.fragment_detalle,container,false);
    }

    public void mostrarDetalle(String texto){
        TextView txtDetalle = (TextView)getView().findViewById(R.id.TxtDetalle);
        txtDetalle.setText(texto);
    }

}
