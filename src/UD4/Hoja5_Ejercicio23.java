package UD4;

import java.util.Scanner;

public class Hoja5_Ejercicio23 {
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		int[] nums=new int[5];
		int[] nums2=new int[5];
		int aux;
		nums=rellenaArray(nums);
		mostrarArray(nums);
		copiaArray(nums,nums2);
		System.out.println(" ");
		mostrarArray(nums2);
		System.out.println(" ");
		arrayBurbuja(nums);
		
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
	public static void copiaArray(int[] nums,int[]nums2) {
		for (int i=0;i<nums.length;i++) {
			nums2[i]=nums[i];
		}
	}
	public static void arrayBurbuja(int[] nums) {
		int aux;
		for(int i=0;i<5;i++) {
			for(int j=0;j<5-1;j++) {
				if(nums[j+1]<nums[j]) {
					aux=nums[j+1];
					nums[j+1] = nums[j];
					nums[j] = aux;
				}
			}
		}
        for (int k=0; k<5;k++) {
            System.out.print(nums[k]);
        }
	}
}
