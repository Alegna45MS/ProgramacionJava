package UD6;

public class Fraccion {

	private int numerador,denominador;
	
	public Fraccion(int num,int den) {
		numerador=num;
		denominador=den;
	}
	public String mostrar() {
		return numerador+"/"+denominador;
	}
	public int getDenominador() {
		return denominador;
	}
	public int getNumerador() {
		return numerador;
	}
	public Fraccion sumar(Fraccion f) {
		int num=numerador*f.getDenominador()+f.getNumerador()*denominador;
		int den=denominador*f.getDenominador();
		Fraccion fsuma=new Fraccion(num,den);
		return fsuma;
	}
	public Fraccion multiplicar(Fraccion f) {
		int num=numerador*f.getNumerador();
		int den=denominador*f.getDenominador();
		Fraccion fmult=new Fraccion(num,den);
		return fmult;
	}
	public Fraccion restar(Fraccion f) {
		int num=numerador*f.getDenominador()-f.getNumerador()*denominador;
		int den=denominador*f.getDenominador();
		Fraccion fresta=new Fraccion(num,den);
		return fresta;
	}
	public Fraccion dividir(Fraccion f) {
		int num=numerador*f.getDenominador();
		int den=denominador*f.getNumerador();
		Fraccion fdiv=new Fraccion(num,den);
		return fdiv;
	}
	public boolean esIgual(Fraccion f) {
		f.simplificar();
		int fnum=f.getNumerador();
		int fden=f.getDenominador();
		if(numerador==fnum && denominador==fden) {
			return true;
		}
		return false;
	}
	public void simplificar() {
		for(int i=numerador;i>0;i--) {
			if(numerador%i==0 && denominador%i==0) {
				numerador=numerador/i;
				denominador=denominador/i;
			}
		}
	}
}
