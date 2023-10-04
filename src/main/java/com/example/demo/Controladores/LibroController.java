package com.example.demo.Controladores;

import com.example.demo.Entidades.Libro;
import com.example.demo.Servicios.LibroServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/basedatos/libros")
public class LibroController extends  BaseControllerImpl<Libro, LibroServiceImpl>{
}
