/**
 * Clase Fraccion
 *
 * Contiene informacion de las fracciones
 *
 * @author Angela
 * @version 1.0
 */
public class Fraccion {
	//atributos
	/**
	 * Numerador de la fraccion
	 */
	private int num;
	/**
	 * Denominador de la fraccion
	 */
	private int den;
	//constructor
	/**
	 * Constructor con 2 parametros
	 * 
	 * @param num   numerador de  la fraccion
	 * @param den denominador de la fraccion
	 */
	public Fraccion(int num,int den) {
		this.num=num;
		this.den=den;
	}
	//getters
	public void mostrar() {
		System.out.println(num+"/"+den);
	}
	public int dameNumerador() {
		return num;
	}
	public int dameDenominador() {
		return den;
	}
	public Fraccion suma(Fraccion f2) {
		int numRsdo=num*f2.dameDenominador()+
				den*f2.dameNumerador();
		int denRsdo=den*f2.dameDenominador();
		Fraccion fraccionResultado=new Fraccion(numRsdo,denRsdo);
		return fraccionResultado;
	}
}
