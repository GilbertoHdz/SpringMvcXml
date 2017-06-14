package com.manitos.xml.model;

public class Todo {

	private Integer id;
	private String nombre;
	private Boolean hecho;

	public Todo(Integer id, String nombre, Boolean hecho) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.hecho = hecho;
	}

	public Todo() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Boolean getHecho() {
		return hecho;
	}

	public void setHecho(Boolean hecho) {
		this.hecho = hecho;
	}

}
