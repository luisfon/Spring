package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luis.Dao.ClienteDao;
import com.luis.java.Admin;
import com.luis.pojos.Clientes;

public class Main {

	public static void main(String[] args) {
		
	
	ApplicationContext context = new  ClassPathXmlApplicationContext("springConfig.xml");
	
	ClienteDao clienteDao = (ClienteDao) context.getBean("x");
	
	Clientes c=new Clientes();
	c.setNombre("juan");
	c.setApp("perez");
	
	if(clienteDao.save(c))
	{
		System.out.println("admin salvado");
	}
	else
	{
		System.out.println("errors");
	}
	
    //System.out.println(context.getBean("admin"));
	
	
	}

}
