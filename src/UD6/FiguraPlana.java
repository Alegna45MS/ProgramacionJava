package UD6;

public class FiguraPlana {
	private double base;
	private double altura;
	private double radio;
	private double lado1,lado2,lado3;
	
	public FiguraPlana(double base,double altura,double lado1,double lado2,double lado3,double radio) {
		this.base=base;
		this.altura=altura;
		this.radio=radio;
		this.lado1=lado1;
		this.lado2=lado2;
		this.lado3=lado3;
	}
	public String toString() {
		return "base:"+base+", altura:"+altura;
	}
	public double areaTriangulo() {
		return base*altura;
	}
	public double areaCuadrado() {
		return base*altura;
	}
	public double areaCirculo() {
		return 3.14*radio;
	}
	public double perimetroTriangulo() {
		return lado1+lado2+lado3;
	}
	public double perimetroCuadrado() {
		return lado1*2+lado2*2;
	}
	public double perimetroCirculo() {
		return 2*3.14*radio;
	}
}
