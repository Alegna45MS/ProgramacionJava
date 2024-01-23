package Ejercicos_profesor;

public class CadEj6 {

	public static void main(String[] args) {
		String cad="Hola a todas";
		
		System.out.println(invierteCadena(cad));

	}
	
	public static String invierteCadena(String cad) {
		String cadInv="";
		
		for (int i=cad.length()-1;i>=0;i--) {
			cadInv=cadInv+cad.charAt(i);
		}
		return cadInv;
	}

}
