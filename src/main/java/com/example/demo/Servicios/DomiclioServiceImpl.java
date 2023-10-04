package com.example.demo.Servicios;


import com.example.demo.Entidades.Domicilio;
import com.example.demo.Repositorios.BaseRepository;
import com.example.demo.Repositorios.DomicilioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DomiclioServiceImpl extends BaseServiceImpl<Domicilio, Long> implements DomiclioService {
    @Autowired
    private DomicilioRepository domicilioRepositoryRepository;
    public  DomiclioServiceImpl(BaseRepository<Domicilio, Long> baseRepository, DomicilioRepository domicilioRepository ) {
        super((baseRepository));;
        this.domicilioRepositoryRepository = domicilioRepository;
    }

}
