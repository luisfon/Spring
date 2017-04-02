package com.luis.DaoImpl;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import com.luis.Dao.ClienteDao;
import com.luis.pojos.Clientes;

@Component("x")
public class ClienteImpl implements ClienteDao{

	private NamedParameterJdbcTemplate template;
	
	@Autowired
	private void setDataSource(DataSource dataSource)
	{
		this.template = new NamedParameterJdbcTemplate(dataSource);
	}
	
	@Override
	public boolean save(Clientes cliente) {
		MapSqlParameterSource map=new MapSqlParameterSource();
		
		map.addValue("nombre",cliente.getNombre());
		map.addValue("app",cliente.getApp());
		
		return template.update("insert into clientes(nombre,app) values(:nombre,:app)",map)==1;
	}

}
