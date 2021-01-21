package com.prueba.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.prueba.entity.Persona;
import com.prueba.service.JRService;
/** 
 * se agregan las anotaciones @RestController para indicarle a Spring boot que esta sera la clase controladora
 * y la anotacion @RequestMapping por medio de la cual establecemos la url principal  del servicio
 */
@RestController
@CrossOrigin(origins = "*" , methods = {RequestMethod.POST , RequestMethod.GET,RequestMethod.PUT,RequestMethod.DELETE})
@RequestMapping(path = "/prueba")
public class JRController {
	
	/**
	 *  creamos una variable de la clese JRService la cual contiene la logica de negocio y agregamos
	 *  la anotacion @Autowired la cual nos permite inyectar  la dependencia del objeto implícitamente.
	 */
	@Autowired
	JRService serviceJR;
	
	
	
	/**
	 * acontinuacion creamos lo metodos que expondran la informacion, para hacer el llamado a cada uno de estos utilizamos las 
	 * anotaciones  @GetMapping ,@PostMapping ,@PutMapping ,@DeleteMapping  en la cual difinimos el complemento de nuestra url final y se hace referencia al metodo 
	 * que utilizaremos. 
	 * 
	 * en cada metodo se agrega la anotacion @ResponseBody la cual  le dice a el controlador que el objeto devuelto se serializa automáticamente en JSON y se devuelve al objeto HttpResponse .
	 * y la anotacion @RequestBody la cual  asigna el cuerpo de HttpRequest a un objeto de transferencia o dominio, lo que permite la deserialización automática del cuerpo de HttpRequest entrante en un objeto Java.
	 
	 */
	
	@PostMapping("/crearPersona")
	public @ResponseBody Persona CrearPersona(  @RequestBody Persona entity) {
		return serviceJR.insert(entity);
	}
	
	@DeleteMapping("/borrar/{id}")
	public @ResponseBody boolean borrar(@PathVariable String id) {
		
		return serviceJR.borrar(id);
	}
	
	@PutMapping("/actualizar/{id}")
	public @ResponseBody Persona actualizarInformacion(@PathVariable String id , @RequestBody Persona entity) {
		return serviceJR.actualizar(entity);
	}
	
	@GetMapping("/consultarPorId/{id}" )
			
	public @ResponseBody Persona consultarPorId(@PathVariable String id) {
		return serviceJR.consultarPorId(id);
	}
	@GetMapping("/consultarTodo")
	public @ResponseBody List<Persona> consultarTodo(){
		
		return serviceJR.consultaTodos();
		
	}

}
