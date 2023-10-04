package com.example.demo.Entidades;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.mapping.Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "libro")
public class Libro extends Base{
    private String titulo;
    private int fecha;
    private String genero;
    private int paginas;

    @ManyToMany(cascade =
            {CascadeType.PERSIST,
                    CascadeType.MERGE})
    private List<Autor> autores = new ArrayList<>();



}
