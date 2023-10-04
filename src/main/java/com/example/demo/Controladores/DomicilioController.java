package com.example.demo.Controladores;

import com.example.demo.Entidades.Domicilio;
import com.example.demo.Servicios.DomiclioServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/basedatos/domicilios")
public class DomicilioController extends  BaseControllerImpl<Domicilio, DomiclioServiceImpl>{
}
