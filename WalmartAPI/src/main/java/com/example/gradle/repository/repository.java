package com.example.gradle.repository;

import com.example.gradle.entitys.store;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface repository extends CrudRepository<store, String> {

    store findByName(String id);

    // Método para guardar una nueva entidad
    store save(store entity);

    // Método para eliminar una entidad por su ID
    void deleteById(Long id);

    List<store> findAll();

}
