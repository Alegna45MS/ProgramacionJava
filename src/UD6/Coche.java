package UD6;

public class Coche {
	//Definir atributos y los encapsulamos
	private String matricula;
	private int ruedas;
	private String color;
	private int puertas;
	
	//Definir el metodo constructor
	//Sirve para:
	//1. Reservar en memoria RAM
	//2. Cuando se crea un objeto,llevarlo a un estado inicial conocido
	public Coche() {
		matricula="1234a";
		ruedas=4;
		color="rojo";
		puertas=5;
	}
	//Definimos los metodos
	public void arrancar() {
		System.out.println("Coche arrancado");;
	}
	public void acelerar() {
		System.out.println("Coche esta acelerando");
	}

}
