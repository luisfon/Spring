package com.luis.Dao;

import java.util.List;

import com.luis.pojos.Clientes;

public interface ClienteDao {

	public boolean save(Clientes cliente);
	
	//trae todos los clientes
	public List<Clientes>clientesAll();
}
