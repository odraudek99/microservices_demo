package com.example.demo.model;

public class Cliente {

	private Integer id;
	private String apellidos;
	private String nombre;
	private int edad;
	private Genero genero;
	
	public Cliente() {}

	public Cliente(Integer id, String apellidos, String nombre, int edad, Genero genero) {
		super();
		this.id = id;
		this.apellidos = apellidos;
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	
	
}
