package com.moto.service.moto_service.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Moto {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id @Setter @Getter
    private int id;

    @Setter @Getter
    private String marca;

    @Setter @Getter
    private String modelo;

    @Setter @Getter
    private int usuarioId;

    public Moto() {
        super();
    }
}
