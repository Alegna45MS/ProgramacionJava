package UD6;

public class ConjuntoLibros {
	private Libro[] libros;
	private int cantLibros;
	private int CAPACIDAD=10;
	
	public ConjuntoLibros() {
		libros = new Libro[CAPACIDAD];
        cantLibros = 0;
	}
	public boolean agregarLibros(Libro libro) {
		if (cantLibros < libros.length) {
            libros[cantLibros] = libro;
            cantLibros++;
            return true;
        } else {
            System.out.println("El conjunto de libros está lleno.");
            return false;
        }
	}
	public boolean eliminarLibroPorTitulo(String titulo) {
		for (int i = 0; i < cantLibros; i++) {
            if (libros[i].getTitulo().equals(titulo)) {
                for (int j = i; j < cantLibros - 1; j++) {
                    libros[j] = libros[j + 1];
                }
                cantLibros--;
                return true;
            }
		}
		return false;
	}
	public boolean eliminarLibroPorAutor(String autor) {
		for (int i = 0; i < cantLibros; i++) {
            if (libros[i].getAutor().equals(autor)) {
                for (int j = i; j < cantLibros - 1; j++) {
                    libros[j] = libros[j + 1];
                }
                cantLibros--;
                return true;
            }
		}
		return false;
	}
	public void mostrarMejorCalificacion() {
		if (cantLibros == 0) {
            System.out.println("No hay libros en el conjunto.");
        }else {
        // int maxcalif=conjunto[0].dameCalificacion();
        Libro mayorCalif = libros[0];
        for (int i = 1; i < cantLibros; i++) {
            if (libros[i].getCalif() > mayorCalif.getCalif()) {
                mayorCalif = libros[i];
            }
        }
        System.out.println("Libro con mayor calificación:");
        System.out.println("Título: " + mayorCalif.getTitulo());
        System.out.println("Autor: " + mayorCalif.getAutor());
        System.out.println("Numero de paginas");
        System.out.println("Calificación: " + mayorCalif.getCalif());
    }
	}

	public void mostrarMenorCalificacion() {
		if (cantLibros == 0) {
            System.out.println("No hay libros en la lista.");
        }else {
        Libro menorCalif = libros[0];
        for (int i = 1; i < cantLibros; i++) {
            if (libros[i].getCalif() < menorCalif.getCalif()) {
                menorCalif = libros[i];
            }
        }
        System.out.println("Libro con menor calificación:");
        System.out.println("Título: " + menorCalif.getTitulo());
        System.out.println("Autor: " + menorCalif.getAutor());
        System.out.println("Calificación: " + menorCalif.getCalif());
        }
	}
	public void mostrarLibros() {
		if (cantLibros == 0) {
            System.out.println("No hay libros en la lista.");
        }
		for(int i=0;i<cantLibros;i++) {
			System.out.println("Libro " + (i + 1) + ":");
            System.out.println("Título: " + libros[i].getTitulo());
            System.out.println("Autor: " + libros[i].getAutor());
            System.out.println("Calificación: " + libros[i].getCalif());
            System.out.println();
		}
	}
}
