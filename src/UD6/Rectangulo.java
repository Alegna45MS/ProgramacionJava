package UD6;

public class Rectangulo {
	//Definir atributos
	private double base;
	private double altura;
	
	public Rectangulo(double bas,double alt) { //inicializar atributos
		base=bas;
		altura=alt;
	}
	//getter:lectura

	public double dameBase() { //Opcional
		return base;
	}
	public double dameAltura() {
		return altura;
	}
	//setter:escritura
	/*public void cambiarBase(int nuevaBase) {
		base=nuevaBase;
		
	}
	public void cambiarAltura(int nuevaAltura) {
		altura=nuevaAltura;
	}*/
	//Metodos
	public double calcularArea() {
		return base*altura;
	}
	public double calcularPerimetro() {
		return (base*2)+(altura*2);
	}
}


