package Ejercicos_profesor;
// Simular la tirada de un dado entre [1,6]
import java.util.Random;

public class EjemploRandom {

	public static void main(String[] args) {
		// Paso 1: Definir y construir un objeto
		// 				de tipo Random (Clase Random)		
		// Defino un objeto: 
		// Clase nombre_objeto
		Random ale = null;
		// Construimos el objeto: reservamos RAM
		// nombre_objeto=new Constructor(parámetro)
		ale=new Random();
		
		//Paso 2: usarlo a través de sus métodos
		// nombre_objeto.método(parámetros)
		// ale
		int tirada=ale.nextInt(6)+1;
		System.out.println(tirada);
		
		

	}

}
