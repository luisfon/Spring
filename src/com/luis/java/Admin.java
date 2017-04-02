package com.luis.java;

import org.springframework.beans.factory.annotation.Autowired;

public class Admin {

private int id;

private String nombre;


private Direccion dire;

	
public Direccion getDire() {
	return dire;
}


public void setDire(Direccion dire) {
	this.dire = dire;
}


public Admin() {
	
}


public Admin(int id, String nombre) {
	
	this.id = id;
	this.nombre = nombre;
}


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getNombre() {
	return nombre;
}


public void setNombre(String nombre) {
	this.nombre = nombre;
}


public void saludo()
{
	System.out.println("hola mundo");	
}


@Override
public String toString() {
	return "Admin [id=" + id + ", nombre=" + nombre + ", dire=" + dire + "]";
}





}
