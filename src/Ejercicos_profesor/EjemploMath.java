package Ejercicos_profesor;

public class EjemploMath {
	//Math es una clase utilitaria, de forma
	// que no tiene constructores y sus métodos son
	// estáticos.
	// Sintaxis para usar los métodos es:
	//	Clase.método
	public static void main(String[] args) {
		//calcular valor absoluto
		int num = Math.abs(-5);
		System.out.println(num);
		// obtener el valor máximo entre dos números
		num =Math.max(89, 5);
		System.out.println(num);
		// obtenemos la potencia
		double resultado=Math.pow(2, 3);
		System.out.println(resultado);
		// raiz cuadrada
		System.out.println(Math.sqrt(9));
		// número PI
		System.out.println(Math.PI);
		// Funciones de redondeo
		System.out.println(Math.floor(2.9));
		System.out.println(Math.ceil(2.1));
		System.out.println(Math.round(5.5));
	}
}
