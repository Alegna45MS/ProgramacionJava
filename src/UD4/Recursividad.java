package UD4;

public class Recursividad {

	public static void main(String[] args) {
		int num=fact(5);
		System.out.println(num);
	}
	public static int fact(int num) {
		//caso base
		if (num<=1) {
			return 1;
		}else {
			//caso general
			return num*fact(num-1);
		}
	}
}
