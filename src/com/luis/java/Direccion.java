package com.luis.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Direccion {

	private int postal;
	private String dir;
	
	
	
	public Direccion() {
		
	}

	public Direccion(int postal, String dir) 
	{
		this.postal = postal;
		this.dir = dir;
	}

	public int getPostal() {
		return postal;
	}

	@Autowired
	public void setPostal(@Value("9437")int postal) {
		this.postal = postal;
	}

	public String getDir() {
		return dir;
	}

	@Autowired
	public void setDir(@Value("reforma")String dir) {
		this.dir = dir;
	}

	@Override
	public String toString() {
		return "Direccion [postal=" + postal + ", dir=" + dir + "]";
	}
	
	
}
