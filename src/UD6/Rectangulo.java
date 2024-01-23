package UD6;

public class Rectangulo {
	//Definir atributos
	private int base;
	private int altura;
	
	public Rectangulo(int baseIni,int alturaIni) {
		base=baseIni;
		altura=alturaIni;
	}
	//getter:lectura

	public int dameBase() {
		return base;
	}
	public int dameAltura() {
		return altura;
	}
	//setter:escritura
	public void cambiarBase(int nuevaBase) {
		base=nuevaBase;
		
	}
	public void cambiarAltura(int nuevaAltura) {
		altura=nuevaAltura;
	}
	//Metodos
	public int calcularArea() {
		return base*altura;
	}
	public int calcularPerimetro() {
		return base*2+altura*2;
	}
}


