import java.util.Scanner;

public class palabrasDemasiadoLargas {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String palabras="";
		String[] palabraAbreviada=new String[4];
		int numPalabras=4;
		for(int i=0;i<numPalabras;i++) {
			palabras=in.nextLine();
			if(palabras.length()>10) {
				palabraAbreviada[i]=""+palabras.charAt(0)+(palabras.length()-2)+palabras.charAt(palabras.length()-1);
				//System.out.print(palabras.charAt(0));
				//System.out.println(palabras.length());
				//System.out.println(palabras.charAt(palabras.length()-1));
			}else {
				palabraAbreviada[i]=palabras;	
			}
		}
		for(int i=0;i<numPalabras;i++) {
			System.out.println(palabraAbreviada[i]);
		}
	}
}
