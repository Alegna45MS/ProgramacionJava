package UD11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Menu {
	static Connection miConexion;
	static Statement miStatement;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int opcion;
		do {
			menu();
			opcion = in.nextInt();
			switch (opcion) {
			case 1:
				in.nextLine();
				System.out.println("Introduce el nombre");
				String nombre=in.nextLine();
				System.out.println("Introduce el dni");
				String dni=in.nextLine();
				System.out.println("Introduce su edad");
				int edad=in.nextInt();
				try {
					miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_prueba", "user","password");
					miStatement = miConexion.createStatement();
					String instruccionSQL2 = "INSERT INTO personas VALUES("+"'"+dni+"'"+","+"'"+nombre+"'"+","+"'"+edad+"'"+");";
					miStatement.executeUpdate(instruccionSQL2);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case 2:
				in.nextLine();
				System.out.println("Escribe el dni de la persona que quieras cambiar la edad");
				dni=in.nextLine();
				System.out.println("Escribe la nueva edad");
				edad=in.nextInt();
				try {
					miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_prueba", "user","password");
					miStatement = miConexion.createStatement();
					String instruccionSQL2 = "UPDATE personas SET edad = "+edad+" WHERE dni="+"'"+dni+"'"+";";
					miStatement.executeUpdate(instruccionSQL2);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case 3:
				in.nextLine();
				System.out.println("Escribe el dni de la persona que quieras borrar");
				dni=in.nextLine();
				try {
					miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_prueba", "user","password");
					miStatement = miConexion.createStatement();
					String instruccionSQL2 = "DELETE FROM personas WHERE dni = "+"'"+dni+"'"+";";
					miStatement.executeUpdate(instruccionSQL2);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case 4:
				in.nextLine();
				System.out.println("Escribe el nombre de la persona que quieras buscar");
				nombre=in.nextLine();
				try {
					miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_prueba", "user","password");
					miStatement = miConexion.createStatement();
					String instruccionSQL2 = "Select * from personas where nombre="+"'"+nombre+"';";
					ResultSet miResultset=miStatement.executeQuery(instruccionSQL2);
					while(miResultset.next()){
						System.out.println("DNI:"+miResultset.getString("dni") +"\n"+"Nombre:"+miResultset.getString("nombre")+"\n"+"Edad:"+miResultset.getInt("edad"));
						}
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			break;
			case 5:
				System.out.println("Adios");
				break;
			default:
				System.out.println("opcion no valida");
			}
		} while (opcion != 5);

	}
	public static void menu() {
		System.out.println("Escoge una opcion");
		System.out.println("1.Insertar persona");
		System.out.println("2.Actualizar edad");
		System.out.println("3.Borrar persona");
		System.out.println("4.Buscar persona por nombre");
		System.out.println("5.Salir");
	}

}
