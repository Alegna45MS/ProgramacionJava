package UD5;

public class EjemploMath {
	//Math es una clase utilitaria de forma que no tiene constructores y sus etodods son estaticos
	//Sintasis para usar metodo es:clase.metodo
	public static void main(String[] args) {
		//Calcular valor absoluto
		int num = Math.abs(-5);
		System.out.println(num);
		//Obtener el valor maximo entre dos numeros
		num = Math.max(90, 3);
		System.out.println(num);
		//Obtenemos la potencia
		double resultado=Math.pow(2,3);
		System.out.println(resultado);
		//Obtenemos la raiz
		System.out.println(Math.sqrt(9));
		//numero pi
		System.out.println(Math.PI);
		//Ceil Redondea un numero decimal al alza
		System.out.println(Math.ceil(4.2));
		//floor redondea un número decimal a la baja
		System.out.println(Math.floor(9.8));
		//redondea a la baja del 0.1 al 0.4 y a la alza del 0.5 al 0.9.
		System.out.println(Math.round(3.4));
		System.out.println(Math.round(9.6));
		System.out.println(Math.round(5.5));
		
		
		

	}

}
