package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luis.java.Admin;

public class Main {

	public static void main(String[] args) {
		
	@SuppressWarnings("resource")
	ApplicationContext context = new  ClassPathXmlApplicationContext("springConfig.xml");
	
    System.out.println(context.getBean("admin"));
	
	
	}

}
