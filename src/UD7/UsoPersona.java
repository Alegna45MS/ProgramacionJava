package UD7;

import java.util.Scanner;

public class UsoPersona {
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int TAM=10;
		Persona[] lista=new Persona[TAM];
		int opcion=0,opcion2=0; 
		do {
			menu();
			opcion=in.nextInt();
			switch(opcion) {
			case 1:
				subMenu();
				opcion2=in.nextInt();
				in.nextLine();
				System.out.println("Introduce el nombre");
				String nombre=in.nextLine();
				System.out.println("Introduce el apellido");
				String apellido=in.nextLine();
				System.out.println("Introduce el dni");
				String dni=in.nextLine();
				System.out.println("Introduce el estado civil");
				String estado=in.nextLine();
				switch(opcion2) {
				case 1:
					System.out.println("Introduce el curso en el que esta");
					int curso=in.nextInt();
					in.nextLine();
					Estudiante alumno=new Estudiante(nombre,apellido,dni,estado,curso);
					if(lista.length<TAM) {
						for(int i=0;i<TAM;i++) {
							if(lista[i]==null) {
								lista[i]=alumno;
							}
						}
					}
					break;
				case 2:
					System.out.println("Introduce la fecha de incorporacion");
					String fecha=in.nextLine();
					System.out.println("Introduce el numero de despacho");
					int numDespacho=in.nextInt();
					System.out.println("Introduce el departamento en el que esta");
					String departamento=in.nextLine();
					in.nextLine();
					Profesor profesor=new Profesor(nombre,apellido,dni,estado,fecha,numDespacho,departamento);
					if(lista.length<TAM) {
						for(int i=0;i<TAM;i++) {
							if(lista[i]==null) {
								lista[i]=profesor;
							}
						}
					}
					break;
				case 3:
					System.out.println("Introduce la fecha de incorporacion");
					fecha=in.nextLine();
					System.out.println("Introduce el numero de despacho");
					numDespacho=in.nextInt();
					System.out.println("Introduce la seccion en la que trabaja");
					String seccion=in.nextLine();
					in.nextLine();
					Servicio empleServicio=new Servicio(nombre,apellido,dni,estado,fecha,numDespacho,seccion);
					if(lista.length<TAM) {
						for(int i=0;i<TAM;i++) {
							if(lista[i]==null) {
								lista[i]=empleServicio;
							}
						}
					}
				break;
				}
			break;
			case 2:
				showPeople(TAM, lista);
			break;
			case 3:
				System.out.println("Adios");
			break;
			default:
				System.out.println("Opcion no valida");
			}
		}while(opcion!=3);

	}
	public static void showPeople(int TAM, Persona[] lista) {
		for(int i=0;i<lista.length;i++) {
			if(lista[i]!=null) {
				System.out.println(lista[i]);
			}
		}
	}
	public static void menu() {
		System.out.println("1.Añadir persona");
		System.out.println("2.Mostrar personas");
		System.out.println("3.Salir");
	}
	public static void subMenu() {
		System.out.println("Escoge el tipo de persona que quiera añadir:");
		System.out.println("1.Alumno");
		System.out.println("2.Profesor");
		System.out.println("3.Servicio");
		}

}
