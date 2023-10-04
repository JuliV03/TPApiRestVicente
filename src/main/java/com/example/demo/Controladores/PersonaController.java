package com.example.demo.Controladores;

import com.example.demo.Entidades.Persona;
import com.example.demo.Servicios.PersonaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/basedatos/personas")
public class PersonaController extends  BaseControllerImpl<Persona, PersonaServiceImpl>{
}
