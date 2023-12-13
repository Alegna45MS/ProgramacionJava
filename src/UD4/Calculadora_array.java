package UD4;

import java.util.Scanner;

public class Calculadora_array {
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		double[] nums=new double[5];
		for (int i=0;i<nums.length;i++) {
			System.out.println("Introduce un valor");
			nums[i]= entrada.nextDouble();
		}
		System.out.println("suma:"+sumarElementos(nums));
		System.out.println("resta:"+restarElementos(nums));
		System.out.println("multiplicacion:"+multiplicarElementos(nums));
		System.out.println("division:"+dividirElementos(nums));
		System.out.println("Media:"+calcularPromedio(nums));
		System.out.println("Maximo:"+encontrarMaximo(nums));
		System.out.println("Minimo:"+encontrarMinimo(nums));
		System.out.println("Se encontró el numero?"+buscarNumero(nums,2));
		System.out.println("Suma acumulada:"+sumaAcumulada(nums));

		
		
	}
	public static double sumarElementos(double[] nums) {
		/**
		 * Calcula la suma de todos los elementos en un array.
		 * @param array El array de números.
		 * @return La suma de los elementos.
		 */
		double suma=0;
		for(int i=0;i<nums.length;i++) {
			suma=suma+nums[i];
		}
		return suma;
	}
	public static double restarElementos(double[] nums) {
		/**
		 * Calcula la resta de todos los elementos en un array.
		 * @param array El array de números.
		 * @return La resta de los elementos.
		 */
		double resta=0;
		for(int i=0;i<nums.length;i++) {
			resta=nums[i]-resta;
		}
		return resta;
	}
	public static double multiplicarElementos(double[] nums) {
		/**
		 * Calcula la multiplicación de todos los elementos en un array.
		 * @param array El array de números.
		 * @return La multiplicación de los elementos.
		 */
		double mult=1;
		for(int i=0;i<nums.length;i++) {
			mult=mult*nums[i];
		}
		return mult;
	}
	public static double dividirElementos(double[] nums) {
		/**
		 * Calcula la división de todos los elementos en un array.
		 * @param array El array de números.
		 * @return La división de los elementos.
		 */
		double div=0;
		for(int i=0;i<nums.length;i++) {
			div=div/nums[i];
			if(nums[i]==0) {
				return 0;
			}
		}
		return div;
	}
	public static double calcularPromedio(double[] nums) {
		/**
		 * Calcula el promedio de todos los elementos en un array.
		 * @param array El array de números.
		 * @return El promedio de los elementos.
		 */
		double suma=sumarElementos(nums);
		return suma/nums.length;
	}
	public static double encontrarMaximo(double[] nums) {
		/**
		 * Encuentra el valor máximo en un array.
		 * @param array El array de números.
		 * @return El valor máximo en el array.
		 */
		double maximo=nums[0];
		for (int i=0;i<nums.length;i++) {
			if (maximo<nums[i]) {
				maximo=nums[i];
			}
		}return maximo;
	}
	public static double encontrarMinimo(double[] nums) {
		/**
		 * Encuentra el valor mínimo en un array.
		 * @param array El array de números.
		 * @return El valor mínimo en el array.
		 */
		double minimo=nums[0];
		for(int i=0;i<nums.length;i++) {
			if(minimo>nums[i]) {
				minimo=nums[i];
			}
		}return minimo;
	}
	public static double[] sumaAcumulada(double[] nums) {
		/**
		 * Calcula la suma acumulada de los elementos en un array.
		 * @param array El array de números.
		 * @return Un nuevo array con la suma acumulada de los elementos.
		 */
		double[] nums2=new double[nums.length];
		nums2[0]=nums[0];
		for (int i=1;i<nums.length;i++) {
			nums2[i]=nums[i-1]+nums[i];
		}
		return nums2;
	}
	public static double[] invertirArray(double[] nums) {
		/**
		 * Invierte el orden de los elementos en un array.
		 * @param array El array de números.
		 * @return Un nuevo array con el orden invertido de los elementos.
		 */
		double[] nums_inverso=new double[nums.length];
		
		return nums_inverso;
	}
	public static boolean buscarNumero(double[] nums, double numero) {
		/**
		 * Verifica si un número específico está presente en el array.
		 * @param array El array de números.
		 * @param numero El número a buscar.
		 * @return true si el número está presente, false en caso contrario.
		 */
		boolean num_buscado=false;
		for (int i=0;i<nums.length;i++) {
			if(numero==nums[i]) {
				num_buscado=true;
		}
		
		}
		return num_buscado;
	}
}
