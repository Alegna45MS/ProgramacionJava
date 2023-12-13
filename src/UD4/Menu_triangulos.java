package UD4;

import java.util.Scanner;

public class Menu_triangulos {
//Crear un menu de una calculadora que te saca el perimentro de un triangulo segun su tipo
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		double lado1,lado2,lado3,perimetro;
		int num;
		do {
			System.out.println("Opciones del menú:");
			System.out.println("1.Equilátero");
			System.out.println("2.Isósceles");
			System.out.println("3.Escaleno");
			System.out.println("4.Salir");
			num = entrada.nextInt();
			if (num==1) {
				System.out.println("Introduce la medida del triangulo equilatero");
				lado1 = entrada.nextInt();
				perimetro = lado1*3;
				System.out.println("El perimetro del triangulo es: "+perimetro);
			}else if (num==2) {
				System.out.println("Introduce dos medidas del triangulo isosceles");
				lado1 = entrada.nextInt();
				lado2 = entrada.nextInt();
				perimetro = (lado1*2)+lado2;
				System.out.println("El perimetro del triangulo es: "+perimetro);
			}else if (num==3) {
				System.out.println("Introduce las tres medidas del trinagulo escaleno");
				lado1 = entrada.nextInt();
				lado2 = entrada.nextInt();
				lado3 = entrada.nextInt();
				perimetro = lado1 + lado2 + lado3;
				System.out.println("El perimetro del triangulo es: "+perimetro);
			}else if (num<1 || num>4){
				System.out.println("Opcion no valida");	
			}		
		}while (num != 4);{
			System.out.println("Adios");
			
		}
	}

}
