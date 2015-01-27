package com.example.jonathan.fragmento2;

/**
 * Created by jonathan on 24/01/15.
 */
public class Correo {
    private String de;
    private String asunto;
    private String texto;

    public Correo(String de,String asunto,String texto){
        this.de = de;
        this.asunto = asunto;
        this.texto = texto;
    }

    public String getDe(){
        return de;
    }

    public String getAsunto(){
        return asunto;
    }

    public String getTexto() {return texto;}
}
