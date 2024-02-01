package UD6;

public class Simplificar {

	public static void main(String[] args) {
		int numerador=105;
		int denominador=210;
			for(int i=numerador;i>0;i--) {
				if(numerador%i==0 && denominador%i==0) {
					numerador=numerador/i;
					denominador=denominador/i;
			}
		}System.out.println(numerador+"/"+denominador);

	}
}
