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
	//Sobrecarga de constructor
	public Coche(String matriculaInicial,String nuevoColor,int nuevasPuertas) {
		matricula=matriculaInicial;
		color=nuevoColor;
		puertas=nuevasPuertas;
		ruedas=4;
	}
	//Definimos metodo getter:lectura
	public String dameMatricula() {
		return matricula;
	}
	public int dameRuedas() {
		return ruedas;
	}
	public String dameColor() {
		return color;
	}
	public int damePuertas() {
		return puertas;
	}
	//Definimos metodo setter:escritura
	public void cambiaMatricula(String nuevaMatricula) {
		//Cambiamo el valor del atributo al valor que pasamos
		matricula=nuevaMatricula;
	}
	public void cambiaColor(String nuevoColor) {
		color=nuevoColor;
	}
	//Definimos los metodos
	public void arrancar() {
		System.out.println("Coche arrancado");;
	}
	public void acelerar() {
		System.out.println("Coche esta acelerando");
	}

}
