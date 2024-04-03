package UD7;

public class UsoFigura {

	public static void main(String[] args) {
		Figura[] figuras=new Figura[3];
		Punto p=new Punto(5,7);
		Circulo circulo=new Circulo(3,p);
		Cilindro cilindro=new Cilindro(10,circulo);
		figuras[0]=p;
		figuras[1]=circulo;
		figuras[2]=cilindro;
		for(int i=0;i<3;i++) {
			System.out.println(figuras[i].getNombre()+" Area="+figuras[i].obtenerArea()+" Volumen="+figuras[i].obtenerVolumen());
		}
	}

}
