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
@Table (name = "persona")
public class Persona extends Base {
private String nombre;
private String apellido;
private  int dni;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "domicilio_id")
    private Domicilio domicilio;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @JoinTable(
            name = "persona_libro",
            joinColumns = @JoinColumn(name = "persona_id"),
            inverseJoinColumns = @JoinColumn(name= "libro_id")
    )
    @Builder.Default
    private List<Libro> libros = new ArrayList<>();
    public void agregarLibros(Libro libro){
        libros.add(libro);
    }
    public void mostrarLibros() {
        System.out.println("Libros de " + nombre +" "+ apellido +  ":");
        for (Libro libro : libros) {
            System.out.println("Título: " + libro.getTitulo());
            System.out.println("Género: " + libro.getGenero());
            System.out.println("Fecha: " + libro.getFecha());
            System.out.println("Páginas: " + libro.getPaginas());
        }

    }

}
