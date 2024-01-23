package UD6;

public class UsoCoche {

	public static void main(String[] args) {
		//Creamos un coche
		//Random random=new Random()
		//Clase nombre_objeto=new Constructor(parametros)
		Coche renault=new Coche();
		//Usamos los metodos definidos en la clase
		renault.arrancar();
		renault.acelerar();
		System.out.println("La matricula es: "+renault.dameMatricula());
		renault.cambiaMatricula("256b");
		System.out.println("La nueva matricula es: "+renault.dameMatricula());
		Coche seat=new Coche("987k","verde",3);
		System.out.println("matricula:"+seat.dameMatricula()+" ruedas:"+seat.dameRuedas());
	}

}
