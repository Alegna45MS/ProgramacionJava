package Ejercicos_profesor;

public class CifradoJulioCesar {

	public static void main(String[] args) {
		String mensaje="zHola a todos";
		mensaje=mensaje.toLowerCase();
		String msjCodificado=codificar(mensaje,1);
		System.out.println(msjCodificado);


	}
	
	public static String codificar(String mensaje,int desplazamiento) {
		String mensajeCodificado="";
		for (int i=0;i<mensaje.length();i++) {
			char caracter=mensaje.charAt(i);
			char caracterCodificado=caracter;
			//minúscula
			if ((caracter>='a')&&(caracter<='z')) {
				caracterCodificado=(char)(caracter+desplazamiento);
				if (caracterCodificado>'z')
					caracterCodificado=(char)(caracterCodificado-('z'-'a'+1));
			}
			mensajeCodificado=mensajeCodificado+caracterCodificado;	
			//cualquier otro caracter
		}
		return mensajeCodificado;
	}
	/*public static String decodificar(String mensaje,int desplazamiento) {
		
	}*/
	

}
