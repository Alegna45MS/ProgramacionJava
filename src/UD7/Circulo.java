package UD7;

public class Circulo extends Figura{
	private double radio;
	private Punto punto;
	
	public Circulo(int radio,Punto punto) {
		super("Circulo");
		this.radio=radio;
		this.punto=punto;
	}
	
	public Punto getPunto() {
		return punto;
	}

	public double getRadio() {
		return radio;
	}

	@Override
	public double obtenerArea() {
		return Math.PI*radio*radio;
	}

	@Override
	public double obtenerVolumen() {
		return 0;
	}

}
