package UD6;

import java.util.Scanner;

public class UsoPersona {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Introduce tu nombre");
		String nombre=in.nextLine();
		System.out.println("Introduce su edad");
		int edad=in.nextInt();
		in.nextLine();
		System.out.println("Introduce su sexo(H o M)");
		char sexo=in.nextLine().charAt(0);
		System.out.println("Introduce su peso y altura");
		double altura=in.nextDouble();
		double peso=in.nextDouble();
		in.nextLine();
		String dni=in.nextLine();
		Persona persona1=new Persona(dni,nombre,edad,sexo,altura,peso);
		Persona persona2=new Persona(dni,nombre,edad,sexo);
		Persona persona3=new Persona(dni,nombre,edad,sexo,altura,peso);
		persona3.cambiarNombre("maria");
		persona3.cambiarEdad(10);
		persona3.cambiarSexo('M');
		persona3.cambiarAltura(60.5);
		persona3.cambiarPeso(50.3);
		if(persona1.esMayorDeEdad()==true) { 
			System.out.println("Es mayor de edad");
		}else {
			System.out.println("No es mayor de edad");
		}
		if(persona2.esMayorDeEdad()==true) {
			System.out.println("Es mayor de edad");
		}else {
			System.out.println("No es mayor de edad");
		}
		if(persona3.esMayorDeEdad()==true) {
			System.out.println("Es mayor de edad");
		}else {
			System.out.println("No es mayor de edad");
		}
		if(persona1.calcularIMC()==-1) {
			System.out.println("Esta por debajo de su peso ideal");
		}else if(persona1.calcularIMC()==1) {
			System.out.println("Tiene sobrepeso");
		}else {
			System.out.println("Esta en su peso ideal");
		}
		if(persona2.calcularIMC()==-1) {
			System.out.println("Esta por debajo de su peso ideal");
		}else if(persona2.calcularIMC()==1) {
			System.out.println("Tiene sobrepeso");
		}else {
			System.out.println("Esta en su peso ideal");
		}
		if(persona3.calcularIMC()==-1) {
			System.out.println("Esta por debajo de su peso ideal");
		}else if(persona1.calcularIMC()==1) {
			System.out.println("Tiene sobrepeso");
		}else {
			System.out.println("Esta en su peso ideal");
		}
		System.out.println(persona1.damePersona());
		System.out.println(persona2.damePersona());
		System.out.println(persona3.damePersona());
		

	}

}
