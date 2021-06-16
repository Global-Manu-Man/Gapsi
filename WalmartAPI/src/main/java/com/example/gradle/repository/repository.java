package com.example.gradle.repository;

import com.example.gradle.entitys.store;
import org.springframework.data.repository.CrudRepository;

public interface repository extends CrudRepository<store, Long> {

    store findByName(String name);
}
