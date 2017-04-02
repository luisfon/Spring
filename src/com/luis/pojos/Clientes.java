package com.luis.pojos;

public class Clientes {

private Integer idCliente;

private String nombre;

private String app;



public Clientes() {
	
}

public Clientes(Integer idCliente, String nombre, String app) {
	
	this.idCliente = idCliente;
	this.nombre = nombre;
	this.app = app;
}

public Integer getIdCliente() {
	return idCliente;
}

public void setIdCliente(Integer idCliente) {
	this.idCliente = idCliente;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getApp() {
	return app;
}

public void setApp(String app) {
	this.app = app;
}

@Override
public String toString() {
	return "Clientes [idCliente=" + idCliente + ", nombre=" + nombre + ", app=" + app + "]";
}

	
}
