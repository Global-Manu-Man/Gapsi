package com.example.gradle.restcontroller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.gradle.entitys.store;
import com.example.gradle.repository.repository;
import java.util.UUID;

@RestController
public class controller {
	@Autowired
	private repository repositorystore;


	@PostMapping("/rates")
	public ResponseEntity<store> create(@RequestBody store newEntity) {
		// Generar un UUID para el nuevo producto
		newEntity.setId(UUID.randomUUID().toString());

		// Guardar el nuevo producto en la base de datos
		store savedEntity = this.repositorystore.save(newEntity);

		// Devolver la respuesta con el producto creado y el código de estado 201 (CREATED)
		return new ResponseEntity<>(savedEntity, HttpStatus.CREATED);
	}
	@RequestMapping(value="/rates/{id}", method = RequestMethod.GET)
	public ResponseEntity<store> findById(@PathVariable String id) {
		Optional<store> entity = repositorystore.findById(id);
		return entity.map(store -> ResponseEntity.ok().body(store)).orElseGet(() -> ResponseEntity.notFound().build());
	}

	@GetMapping("/rates/all")
	public ResponseEntity<List<store>> findAllStores() {
		List<store> stores = repositorystore.findAll();
		if (stores.isEmpty()) {
			return ResponseEntity.notFound().build();
		} else {
			return ResponseEntity.ok().body(stores);
		}
	}

	@DeleteMapping("/rates/{id}")
	public ResponseEntity<Void> delete(@PathVariable String id) {
		this.repositorystore.deleteById(id);
		return ResponseEntity.noContent().build();
	}

	@PutMapping("/rates/{id}")
	public ResponseEntity<store> update(@PathVariable String id, @RequestBody store updatedEntity) {
		store existingEntity = this.repositorystore.findById(id).orElse(null);
		if (existingEntity == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		updatedEntity.setId(id);
		store savedEntity = this.repositorystore.save(updatedEntity);
		return new ResponseEntity<>(savedEntity, HttpStatus.OK);
	}

	@PatchMapping("/rates/{id}")
	public ResponseEntity<store> partialUpdate(@PathVariable String id, @RequestBody Map<String, Object> updates) {
		store existingEntity = this.repositorystore.findById(id).orElse(null);
		if (existingEntity == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		if (updates.containsKey("name")) {
			existingEntity.setName((String) updates.get("name"));
		}
		store savedEntity = this.repositorystore.save(existingEntity);
		return new ResponseEntity<>(savedEntity, HttpStatus.OK);
	}



}
