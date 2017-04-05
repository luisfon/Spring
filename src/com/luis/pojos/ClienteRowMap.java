package com.luis.pojos;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ClienteRowMap implements RowMapper<Clientes>{

	@Override
	public Clientes mapRow(ResultSet rs, int arg1) throws SQLException {
		Clientes cliente=new Clientes();
		
		cliente.setIdCliente(rs.getInt("idCliente"));
		
		cliente.setNombre(rs.getString("nombre"));
		
		cliente.setApp(rs.getString("app"));
		
		return cliente;
	
	}

}
