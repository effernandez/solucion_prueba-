package com.prueba.entity;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "persona")
public class Persona implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2330289880871451994L;
	@Id
	private String id;
	private String nombre;
	private String apellidos;
	private String telefono;
	private String correo;
	private String nombre_padre;
	private String nombre_madre;
	private String nombre_hermano;
	
	
	public Persona() {
		
	}


	public Persona(String id, String nombre, String apellidos, String telefono, String correo, String nombre_padre,
			String nombre_madre, String nombre_hermano) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.correo = correo;
		this.nombre_padre = nombre_padre;
		this.nombre_madre = nombre_madre;
		this.nombre_hermano = nombre_hermano;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	public String getNombre_padre() {
		return nombre_padre;
	}


	public void setNombre_padre(String nombre_padre) {
		this.nombre_padre = nombre_padre;
	}


	public String getNombre_madre() {
		return nombre_madre;
	}


	public void setNombre_madre(String nombre_madre) {
		this.nombre_madre = nombre_madre;
	}


	public String getNombre_hermano() {
		return nombre_hermano;
	}


	public void setNombre_hermano(String nombre_hermano) {
		this.nombre_hermano = nombre_hermano;
	}
	

}
