package com.example.demo.Entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "domicilio")
public class Domicilio extends Base{
    private String calle;
    private int numero;
    @ManyToOne()
    @JoinColumn(name = "localidad-id")
    private Localidad localidad;

}
