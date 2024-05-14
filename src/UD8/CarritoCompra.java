package UD8;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CarritoCompra {
	public static void main(String[] args) {
		HashMap<String, Integer> carrito = new HashMap<String, Integer>();
		Scanner scanner = new Scanner(System.in);
		int opcion = 1;
		int cantidad = 1;
		String producto = " ";
		do {
			System.out.println("0. Salir");
			System.out.println("1. Añadir a carrito");
			System.out.println("2. Quitar de carrito");
			System.out.println("3. Listar carrito");
			opcion = scanner.nextInt();
			switch (opcion) {
			case 1:
				do {
					scanner.nextLine();
					System.out.println("Inserta producto");
					producto = scanner.nextLine();
				} while (carrito.containsKey(producto));
				carrito.put(producto, cantidad);
				System.out.println("Producto introducido");
			break;
			case 2:
				scanner.nextLine();
				System.out.println("Introduce el producto a quitar");
				producto=scanner.nextLine();
				if (carrito.containsKey(producto)) {
					carrito.remove(producto);
					System.out.println("Producto borrado");
				} else {
					System.out.println("Producto no existe");
				}
			break;
			case 3:
				Set<String> claves = carrito.keySet();
				for (String key : claves) {
					// accedemos al valor por clave
					System.out.println("Producto:" + key + " Cantidad:" + carrito.get(key));
				}
				break;
			}
		} while (opcion != 0);
	}

}
