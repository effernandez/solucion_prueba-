package com.prueba.service;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.prueba.entity.Persona;
import com.prueba.repository.JRRepository;

/**
 * en esta clase definimos toda la logica de negocio , por tal motivo agregamos la anotacion @Service la cual le indica a Spring Boot 
 * que en esta clase esta toda la logica. 
 * 
 *
 */

@Service
public class JRService {
	@Autowired
	JRRepository repository;
	
	/**
	 * se crea el metodo insert el cual envia los  parametros con los cuales se realiza la creacion de de un objeto persona en  BD 
	 * 
	 * @return el objeto persona que fue creado en la BD
	 */
	
	public Persona insert(Persona entity) {
		return repository.insert(entity);
	}
	
	/**
	 * se crea el metodo borrar el cual envia  el  parametro para la eliminacion del item  en  BD 
	 * 
	 * @return tru si se elimino , false sino se elimino el items
	 */
	
	public boolean borrar(String id) {
		try {
			repository.deleteById(id);
			return true;
		} catch(Exception ex) {
			return false;
		}
	}
	/**
	 * se crea el metodo Actualizar el cual envia los parametroa modificar en la BD
	 * @return objeto actualizado en la BD
	 */
	
	public Persona actualizar(Persona entity) {
		return repository.save(entity);
	}
	/**
	 * se crea el metodo consultar el cual envia los parametro con el cual se extrae el item a consultar  en la BD
	 * @return objeto especifico en la BD
	 */
	public Persona consultarPorId(String id) {
		return repository.findById(id).orElse(null);
	}
	
	/**
	 * se crea el metodo  el cual envia el parametro para extraer toda la informacion de la entidad  en la BD
	 * @return todos los obetos almacenado en la entdad de la BD
	 */
	
	public List<Persona> consultaTodos(){
		 
		return   (List<Persona>) repository.findAll();
		
		 
		
	}

}
