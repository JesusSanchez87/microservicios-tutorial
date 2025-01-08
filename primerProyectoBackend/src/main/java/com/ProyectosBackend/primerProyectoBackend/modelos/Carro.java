package com.ProyectosBackend.primerProyectoBackend.modelos;

import lombok.Getter;
import lombok.Setter;

public class Carro {

    @Setter @Getter
    private String marca;

    @Setter @Getter
    private String modelo;

    @Setter @Getter
    private int usuarioId;

    public Carro(){
        super();
    }
}
