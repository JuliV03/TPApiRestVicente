package com.example.demo.Servicios;

import com.example.demo.Entidades.Persona;
import com.example.demo.Repositorios.BaseRepository;
import com.example.demo.Repositorios.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class PersonaServiceImpl extends  BaseServiceImpl <Persona, Long> implements  PersonaService{
    @Autowired
    private PersonaRepository personaRepositoryRepository;
    public  PersonaServiceImpl(BaseRepository<Persona, Long> baseRepository, PersonaRepository personaRepository ) {
    super((baseRepository));
    this.personaRepositoryRepository = personaRepository;
    }
}
