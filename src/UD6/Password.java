package UD6;

import java.util.Random;

public class Password {
	private int longitud;
	private String contraseña;
	
	public Password() {
		this.longitud=8;
		this.contraseña=" ";
	}
	public Password(int longitud) {
		this.longitud=longitud;
		contraseña=generarContraseña();
	}
	public int getLongitud() {
		return longitud;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setLongitud(int longi) {
		if(longi>0) {
			longitud=longi;
		}
	}
	//metodos
	public boolean esFuerte() {
		int contMayus;
		int contMinus;
		int contNums;
		if(contraseña.length()<8) {
			return false;
		}
		
		return true;
	}
	public String generarContraseña() {
		Random random=new Random();
		String contrGenerada=" ";
		for(int i=0;i<longitud;i++) {
			contrGenerada=contrGenerada + i;
		}
		return contrGenerada;
	}
}
