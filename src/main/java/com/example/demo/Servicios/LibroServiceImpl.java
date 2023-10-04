package com.example.demo.Servicios;

import com.example.demo.Entidades.Libro;
import com.example.demo.Repositorios.BaseRepository;
import com.example.demo.Repositorios.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LibroServiceImpl extends BaseServiceImpl<Libro, Long> implements LibroService {
    @Autowired
    private LibroRepository libroRepositoryRepository;
    public  LibroServiceImpl(BaseRepository<Libro, Long> baseRepository, LibroRepository libroRepository ) {
        super((baseRepository));;
        this.libroRepositoryRepository = libroRepository;
    }

}
