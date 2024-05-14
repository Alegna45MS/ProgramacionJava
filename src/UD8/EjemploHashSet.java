package UD8;

import java.util.HashSet;

public class EjemploHashSet {
	public static void main(String[] args) {
		//Construimos un Set de frutas(NO se pueden repetir
		HashSet<String> frutas=new HashSet<String>();
		//añadimos elementos a la coleccion
		frutas.add("Pera");
		frutas.add("Manzana");
		frutas.add("Naranja");
		frutas.add("Platano");
		frutas.add("Pera");
		//admite nulos
		frutas.add(null);
		//comprobamos si un elememto ya existe en la lista
		System.out.println(frutas.contains("Platano"));
		//obtenemos tamaño coleccion
		System.out.println(frutas.size());
		//borramos elemeto de la coleccion
		frutas.remove("Pera");
		//mostramos la coleccion
		System.out.println(frutas);
		//recorremos la coleccion
		for(String fruta:frutas) {
			System.out.println(fruta);
		}
		
	}

}
