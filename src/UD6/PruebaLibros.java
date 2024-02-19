package UD6;

public class PruebaLibros {

	public static void main(String[] args) {
		ConjuntoLibros listaLibros = new ConjuntoLibros();
		Libro libro1=new Libro("Carrie","Stephen King",200,9);
		Libro libro2=new Libro("Divergente","Veronica Roth",400,6.5);
		
		listaLibros.agregarLibros(libro1);
        listaLibros.agregarLibros(libro2);
        
        listaLibros.mostrarLibros();
        
        listaLibros.mostrarMejorCalificacion();
        listaLibros.mostrarMenorCalificacion();
        
        listaLibros.eliminarLibroPorAutor("Veronica Roth");
        listaLibros.eliminarLibroPorTitulo("Carrie");
        
		Libro libro3=new Libro("Harry Potter 1","J.K. Rollin",100,8.5);
		listaLibros.agregarLibros(libro3);
		listaLibros.mostrarLibros();
		
        

	}

}
