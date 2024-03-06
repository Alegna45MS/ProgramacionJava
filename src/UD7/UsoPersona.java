package UD7;

import java.util.Scanner;

public class UsoPersona {

	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int TAM=10;
		Persona[] lista=new Persona[TAM];
		int opcion=0,opcion2=0;
		do {
			System.out.println("1.Añadir persona");
			System.out.println("2.Mostrar personas");
			System.out.println("3.Salir");
			opcion=in.nextInt();
			switch(opcion) {
			case 1:
				System.out.println("Escoge que tipo de personas introducir:Alumno(1),Profesor(2),Personal Servicio(3)");
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
				if(opcion==1) {
					System.out.println("Introduce el curso en el que esta");
					int curso=in.nextInt();
					Estudiante alumno=new Estudiante(nombre,apellido,dni,estado,curso);
					if(lista.length<TAM) {
						for(int i=0;i<TAM;i++) {
							if(lista[i]==null) {
								lista[i]=alumno;
							}
						}
					}
				}
				if(opcion==2) {
					in.nextLine();
					System.out.println("Introduce la fecha de incorporacion");
					String fecha=in.nextLine();
					System.out.println("Introduce el numero de despacho");
					int numDespacho=in.nextInt();
					System.out.println("Introduce el departamento en el que esta");
					String departamento=in.nextLine();
					Profesor profesor=new Profesor(nombre,apellido,dni,estado,fecha,numDespacho,departamento);
					if(lista.length<TAM) {
						for(int i=0;i<TAM;i++) {
							if(lista[i]==null) {
								lista[i]=profesor;
							}
						}
					}
				}
				if(opcion==3) {
					in.nextLine();
					System.out.println("Introduce la fecha de incorporacion");
					String fecha=in.nextLine();
					System.out.println("Introduce el numero de despacho");
					int numDespacho=in.nextInt();
					System.out.println("Introduce la seccion en la que trabaja");
					String seccion=in.nextLine();
					Servicio empleServicio=new Servicio(nombre,apellido,dni,estado,fecha,numDespacho,seccion);
					if(lista.length<TAM) {
						for(int i=0;i<TAM;i++) {
							if(lista[i]==null) {
								lista[i]=empleServicio;
							}
						}
					}
				}
			break;
			case 2:
				for(int i=0;i<TAM;i++) {
					if(lista[i]!=null) {
						System.out.println(lista[i].toString()+"\n");
					}
				}
			break;
			case 3:
				System.out.println("Adios");
			break;
			default:
				System.out.println("Opcion no valida");
			}
		}while(opcion!=3);

	}
	public static void mostrarPersonas() {

	}

}
