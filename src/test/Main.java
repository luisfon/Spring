package test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.CannotGetJdbcConnectionException;

import com.luis.Dao.ClienteDao;
import com.luis.java.Admin;
import com.luis.pojos.Clientes;

public class Main {

	public static void main(String[] args) {
		
	
	ApplicationContext context = new  ClassPathXmlApplicationContext("springConfig.xml");
	
	ClienteDao clienteDao = (ClienteDao) context.getBean("x");
	
	Clientes c=new Clientes();
	c.setNombre("juan");
	c.setApp("peres");
	
	
	try {
		
		clienteDao.save(c);
		
//		List<Clientes>client=clienteDao.clientesAll();
//		
//		for(Clientes client2:client)
//		{
//			System.out.println(client2);
//		}
//		
		System.out.println(clienteDao.buscaId(3));
		
	} catch (CannotGetJdbcConnectionException e) {
		
		e.printStackTrace();
		
	}//Excepcion de acceso a datos
	
	catch (DataAccessException e) {
		
		e.printStackTrace();
	}
	
    //System.out.println(context.getBean("admin"));
	
	
	}

}
