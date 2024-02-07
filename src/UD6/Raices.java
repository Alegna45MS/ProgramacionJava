package UD6;

public class Raices {
	private int a,b,c;
	
	public Raices(int a,int b,int c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	public double getDiscriminante() {
		double discr=Math.pow(b, 2)-(4*a*c);
		return discr;
	}
	public void obtenerRaices() {
		if(tieneRaices()==true) {
			double x1=(-b+Math.sqrt(getDiscriminante()))/(2*a);
			double x2=(-b-Math.sqrt(getDiscriminante()))/(2*a);
			System.out.println("solucion1:"+x1);
			System.out.println("solucion 2:"+x2);
		}else {
			System.out.println("La ecuacion tiene una sola raiz o ninguna");
		}
	}
	public void obtenerRaiz() {
		if(tieneRaiz()==true) {
			System.out.println(-b/(2*a));
		}else {
			System.out.println("La ecuacion tiene dos raices");
		}
	}
	public boolean tieneRaices() {
		if(getDiscriminante()>0) {
			return true;
		}
		return false;
		
	}
	public boolean tieneRaiz() {
		if(getDiscriminante()==0) {
			return true;
	}
		return false;
	}
}

