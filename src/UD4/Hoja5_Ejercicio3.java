package UD4;

public class Hoja5_Ejercicio3 {
//Que muestre por pantalla los números del 1 al 100, utilizar recursividad
	public static void main(String[] args) {
		mostrarNums(1);

	}
	public static void mostrarNums(int num) {
		System.out.println(num);
		//caso general
		if (num<100) {
			mostrarNums(num+1);
		}
		//caso base si num es 100
		//no lo muestra sino que hace un return
	}
}
