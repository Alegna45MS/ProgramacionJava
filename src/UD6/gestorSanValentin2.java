package UD6;

import java.util.Scanner;

public class gestorSanValentin2 {
	static Scanner in = new Scanner(System.in);
	static Pareja[] parejas = new Pareja[10];
	public static void main(String[] args) {
		int opcion;
		do {
			mostrarMenu();
			opcion=in.nextInt();
			switch(opcion) {
			case 1:
				//Datos de las dos personas
				System.out.println("Introduce los datos de la persona 1:");
				System.out.println("Nombre:");
				String nom1=in.nextLine();
				in.nextLine();
				System.out.println("DNI:");
				String dni1=in.nextLine();
				Persona p1=new Persona(nom1,dni1);
				System.out.println("Introduce los datos de la persona 2:");
				System.out.println("Nombre:");
				String nom2=in.nextLine();
				System.out.println("DNI:");
				String dni2=in.nextLine();
				Persona p2=new Persona(nom2,dni2);
				Pareja pareja=new Pareja(p1,p2);
				System.out.println("En que posicion guardar?");
				int pos=in.nextInt();
				//Datos de los regalos
				System.out.println("Introduce los datos del regalo 1");
				System.out.println("Nombre:");
				String nomR1=in.nextLine();
				in.nextLine();
				System.out.println("Precio:");
				double precio=in.nextInt();
				System.out.println("Descripcion:");
				String descr=in.nextLine();
				in.nextLine();
				Regalo r1=new Regalo(nomR1,precio,descr);
				System.out.println("Introduce los datos del regalo 2");
				System.out.println("Nombre:");
				String nomR2=in.nextLine();
				System.out.println("Precio:");
				double precio2=in.nextInt();
				in.nextLine();
				System.out.println("Descripcion:");
				String descr2=in.nextLine();
				Regalo r2=new Regalo(nomR2,precio2,descr2);
				pareja.setRegaloParaPersona1(r2);
				pareja.setRegaloParaPersona2(r1);
				//Agregar pareja al array
				agregarPareja(pareja,pos);
			break;
			case 2:
				mostrarDetallesParejas();
			break;
			case 3:
				System.out.println("Adios");
			break;
			default:
				System.out.println("Opcion no valida");
			}
		}while (opcion!=3);

	}
	public static void mostrarMenu() {
		System.out.println("1. Agregar pareja y sus regalos");
		System.out.println("2. Mostrar detalles de las parejas y sus regalos.");
		System.out.println("3. Salir del programa");
	}
	public static void agregarPareja(Pareja pareja,int pos) {
			if(parejas[pos]==null) {
				parejas[pos]=pareja;
			}else {
				System.out.println("La posicion esta ocupada");
			}
	}
	public static void mostrarDetallesParejas() {
		for(int i=0;i<parejas.length;i++) {
			System.out.println(parejas[i].toString());
		}
	}

}
