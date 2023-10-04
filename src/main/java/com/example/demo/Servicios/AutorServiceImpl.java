package com.example.demo.Servicios;

import com.example.demo.Entidades.Autor;

import com.example.demo.Repositorios.AutorRepository;
import com.example.demo.Repositorios.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor, Long> implements AutorService {

        @Autowired
        private AutorRepository autorRepositoryRepository;
        public  AutorServiceImpl(BaseRepository<Autor, Long> baseRepository, AutorRepository autorRepository ) {
            super((baseRepository));
            this.autorRepositoryRepository = autorRepository;
        }
}
