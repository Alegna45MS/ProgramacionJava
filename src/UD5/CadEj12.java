package UD5;

import java.util.Scanner;

/*
 * Ejercicio 12. Realizar un programa en java que gestione 
 * los datos de stock de una
tienda de comestibles,la información a recoger será: 
nombre del producto(no se
puede repetir), 
precio, 
cantidad en stock.
La tienda dispone de 10 productos distintos. El programa debe ser capaz de:
1. Dar de alta un producto nuevo.
2. Buscar un producto por su nombre.
3. Modificar el stock y precio de un producto dado.
 * 
 * */
public class CadEj12 {
	//Vamos a almacenar cada producto en el formato
	// "nombre;stock;precio"
	static Scanner in;
	static String[] productos;
	static int pos;
	public static void main(String[] args) {
		//Construimos un array de productos, inicialmente
		//	cada posicion es null
		productos=new String[10];
		in=new Scanner(System.in);
		int opcion=1;
		pos=0;
		do {
			
			System.out.println("1. Dar de alta un producto nuevo.");
			System.out.println("2. Buscar un producto por su nombre.");
			System.out.println("3. Modificar el stock y precio de un producto dado.");
			System.out.println("4. Salir");
			opcion=in.nextInt();
			switch(opcion) {
			case 1:
				altaProducto();
				break;
			case 2:
				if (buscarProducto()==true) {
					System.out.println("Si tenemos ese producto");
				}else {
					System.out.println("No tenemos ese producto");
				}
				break;
			case 3:
				break;
			case 4:
				break;
			default:
				System.out.println("Opción no válida.");
			
			}
		}while(opcion!=4);

	}
	
	public static void altaProducto() {
		String producto="",nombre,stock,precio;
		System.out.println("Introduce nombre:");
		nombre =in.nextLine();
		System.out.println("Introduce stock:");
		stock=in.nextLine();
		System.out.println("Introduce precio:");
		precio=in.nextLine();
		// construyo los datos del producto en el formato:
		// "nombre;stock;precio"
		producto=nombre+";"+stock+";"+precio;
		// almaceno el producto si hay espacio
		if (pos<10) {
			productos[pos]=producto;
			pos++;
		}else {
			System.out.println("No hay espacio. Tienes 10 productos");
		}

	}
	public static boolean buscarProducto() {
		System.out.println("Introduce el nombre del producto a buscar");
		String productoBuscar=in.nextLine();
		for(int i=0;i<10;i++) {
			if(productos[i].equals(productoBuscar)) {
				return true;
		}
	}
		return false;
	}
}
