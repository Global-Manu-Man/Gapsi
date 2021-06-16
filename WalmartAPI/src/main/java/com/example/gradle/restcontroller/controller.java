package com.example.gradle.restcontroller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.gradle.entitys.store;
import com.example.gradle.repository.repository;

@RestController
public class controller {
	@Autowired
	private repository repositorystore;
	
	@RequestMapping(value="/rates", method = RequestMethod.GET)
	public List<store> findAll(@RequestParam(required=false) String name ){
		List<store> entitys = new ArrayList<>();
		
		if (name == null) {
			Iterable<store> results = this.repositorystore.findAll();
			results.forEach(enty ->{
				entitys.add(enty);
			});
			
		}else {
			store enty = this.repositorystore.findByName(name);
			if(enty!= null) {
				entitys.add(enty);
			}
		}
		return entitys;
	}
}
