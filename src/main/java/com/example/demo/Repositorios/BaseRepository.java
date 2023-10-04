package com.example.demo.Repositorios;

import com.example.demo.Entidades.Base;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

// Para que se instancie
@NoRepositoryBean
// public interface BaseRepository <E,ID>{
//public interface BaseRepository <E extends Base,ID extends Serializable>{
public interface BaseRepository <E extends Base,ID extends Serializable> extends JpaRepository <E,ID> {
}
