package com.example.demo.Entidades;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.mapping.Set;

import java.util.HashSet;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "autor")
public class Autor extends Base {
    private String nombre;
    private String apellido;
    private String biografia;

}
