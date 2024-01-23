package UD4;

import java.util.Scanner;

public class Ejfuncionesyarrays {
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		int[] nums=new int[8];
		int maximo;
		nums=rellenaArray(nums);
		mostrarArray(nums);
		maximo=encuentraMaximo(nums);
	}
	public static int[] rellenaArray(int[] nums) {
		for(int i=0;i<nums.length;i++) {
			System.out.println("Introduce un valor");
			nums[i]= entrada.nextInt();
		}
		return nums;
	}
	public static void mostrarArray(int[] nums) {
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i]);
		}
		return;
	}
	public static int encuentraMaximo(int[] nums) {
		int maximo=nums[0];
		for (int i=1;i<nums.length;i++) {
			if (maximo<nums[i]) {
				maximo=nums[i];
			}
		}return maximo;
	}
}
