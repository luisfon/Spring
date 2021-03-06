package com.luis.DaoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import com.luis.Dao.ClienteDao;
import com.luis.pojos.ClienteRowMap;
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
		//PRIMER MANERA DE SETEAR 
//		MapSqlParameterSource map=new MapSqlParameterSource();
//		map.addValue("nombre",cliente.getNombre());
//		map.addValue("app",cliente.getApp());
		
		//SEGUNDA MANERA
		BeanPropertySqlParameterSource map = new BeanPropertySqlParameterSource(cliente);
		
		return template.update("insert into clientes(nombre,app) values(:nombre,:app)",map)==1;
	}

	@Override
	public List<Clientes> clientesAll() {
	
		return template.query("select * from Clientes",new RowMapper<Clientes>() {

			@Override
			public Clientes mapRow(ResultSet rs, int arg1) throws SQLException {
				
				Clientes cliente=new Clientes();
				
				cliente.setIdCliente(rs.getInt("idCliente"));
				
				cliente.setNombre(rs.getString("nombre"));
				
				cliente.setApp(rs.getString("app"));
				
				return cliente;
			}
			
		} );
	}

	@Override
	public Clientes buscaId(int id) {
		
//		return  (Clientes) template.query("select * from Clientes where idCliente=:idCliente",
//				
//				new MapSqlParameterSource("idCliente",id),new ClienteRowMap());
		
	//segunda Forma
		
		return template.queryForObject("select * from Clientes where idCliente=:idCliente",
				new MapSqlParameterSource("idCliente",id),new ClienteRowMap());
		
	}

}
