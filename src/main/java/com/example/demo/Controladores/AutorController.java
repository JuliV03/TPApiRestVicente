package com.example.demo.Controladores;

import com.example.demo.Entidades.Autor;
import com.example.demo.Servicios.AutorServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/basedatos/autores")
public class AutorController extends BaseControllerImpl<Autor, AutorServiceImpl> {
}
