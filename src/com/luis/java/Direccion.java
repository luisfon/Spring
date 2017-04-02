package com.luis.java;

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

	public void setPostal(int postal) {
		this.postal = postal;
	}

	public String getDir() {
		return dir;
	}

	public void setDir(String dir) {
		this.dir = dir;
	}

	@Override
	public String toString() {
		return "Direccion [postal=" + postal + ", dir=" + dir + "]";
	}
	
	
}
