package com.prueba.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import org.springframework.stereotype.Repository;

import com.prueba.entity.Persona;

@Repository
public interface JRRepository extends MongoRepository<Persona, String> {
	
}
