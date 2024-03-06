package UD7;

public class Estudiante extends Persona{
	private int curso;
	
	public Estudiante(String nombre, String apellido, String dni, String estCivil,int curso) {
		super(nombre, apellido, dni, estCivil);
		this.curso=curso;
	}

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}

	public String toString() {
		return super.toString()+"curso=" + curso;
	}
	
}
