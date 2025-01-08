package com.ProyectosBackend.primerProyectoBackend.modelos;

import lombok.Getter;
import lombok.Setter;

public class Moto {

    @Setter @Getter
    private String marca;

    @Setter @Getter
    private String modelo;

    @Setter @Getter
    private int usuarioId;

    public Moto(){
        super();
    }
}
