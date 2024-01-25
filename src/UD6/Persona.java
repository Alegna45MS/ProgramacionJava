package UD6;

import java.util.Random;

public class Persona {
	private String nombre,DNI;
	private int edad;
	private double peso,altura;
	private char sexo;
	
	public Persona(String DNI) {
		nombre="";
		this.DNI=DNI;
		edad=0;
		peso=0;
		altura=0;
		sexo='H';
	}
	public Persona(String dni ,String nom,int ed,char sex) {
		nombre=nom;
		edad=ed;
		if(sex=='M') {
			sexo=sex;
		}
		DNI=dni;
		altura=0;
		peso=0;
	}
	public Persona(String dni,String nom,int ed,char sex,int alt,int pes) {
		nombre=nom;
		edad=ed;
		if(sex=='M') {
			sexo=sex;
		}
		DNI=dni;
		altura=alt;
		peso=pes;
	}
	public String damePersona() {
		return nombre+","+DNI+","+edad+","+","+sexo+","+peso+","+altura;
	}
	
	//metodos
	public int calcularIMC() {
		double imc=peso/(altura*altura);
		if(imc<20) {
			return -1;
		}else if(imc>=20 && imc<=25) {
			return 0;
		}else {
			return 1;
		}
		
	}
	public boolean esMayorDeEdad() {
		if(edad>=18) {
			return true;
		}else {
			return false;
		}
	}
	public boolean comprobarSexo(char sexo) {
		if(sexo=='H' || sexo=='M') {
			return true;
		}else {
			return false;
		}
	}
	public void generaDNI() {
		String[]letras= {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		Random random=new Random();
		for (int i=0;i<8;i++) {
			DNI=DNI+random.nextInt(10);
		}
		//DNI=DNI+letras.charAt(letras.length);
	}
	
	
	
}