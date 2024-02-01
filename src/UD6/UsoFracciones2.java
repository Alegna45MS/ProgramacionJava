package UD6;

import java.util.Scanner;

public class UsoFracciones2 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int num;
		System.out.println("Introduce el numero de fracciones");
		num=in.nextInt();
		Fraccion[] fracciones=new Fraccion[num];
		for (int i=0;i<num;i++) {
			System.out.println("Introduce el numerador");
			int nume=in.nextInt();
			System.out.println("Introduce el denominador");
			int deno=in.nextInt();
			Fraccion f=new Fraccion(nume,deno);
			fracciones[i]=f;
		}
		Fraccion sum=new Fraccion(0,1);
		for(int i=0;i<num;i++) {
			sum=sum.sumar(fracciones[i]);
		}
		System.out.println(sum.mostrar());
	}

}
