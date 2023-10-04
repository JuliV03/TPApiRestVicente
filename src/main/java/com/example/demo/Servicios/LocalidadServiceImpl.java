package com.example.demo.Servicios;

import com.example.demo.Entidades.Localidad;
import com.example.demo.Repositorios.BaseRepository;
import com.example.demo.Repositorios.LocalidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LocalidadServiceImpl  extends  BaseServiceImpl<Localidad, Long> implements LocalidadService {
    @Autowired
    private LocalidadRepository localidadRepositoryRepository;
    public  LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository, LocalidadRepository localidadRepository ) {
        super((baseRepository));
        this.localidadRepositoryRepository= localidadRepository;
    }

}
