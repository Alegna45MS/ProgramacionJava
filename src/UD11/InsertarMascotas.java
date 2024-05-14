package UD11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertarMascotas {
	static Connection miConexion;
	static Statement miStatement;
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		try {
			miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/ClienteMascota", "user","password");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Introduce el id del cliente");
		int idCliente,idMascota;
		//Pedimos el id del cliente y nos aseguramos de que existe
		do {
			idCliente=Integer.parseInt(in.nextLine());
		}while(!existeCliente(idCliente));
		//Pedimos el id de la mascota y nos aseguramos de que NO existe
		do {
			System.out.println("Introduce el id de la mascota");
			idMascota=Integer.parseInt(in.nextLine());
			
		}while(existeMascota(idMascota));
		System.out.println("Introduce el nombre de la mascota");
		String nombreMascota=in.nextLine();
		introducirMascota(idMascota,nombreMascota,idCliente);
		/*int id=1;
		boolean introducir=true;
		do {
			System.out.println("Desea introducir mascota?si(1) o no(2)");
			int opcion=in.nextInt();
			if(opcion==1) {
				introducirMascota(id);
				id++;
			}else {
				introducir=false;
			}
		}while(introducir==false);*/
	}
	public static boolean existeCliente(int id) {
		String consulta="Select * from Cliente where id_cliente='"+id+"';";
		try {
			miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/ClienteMascota", "user","password");
			miStatement = miConexion.createStatement();
			ResultSet miResultset=miStatement.executeQuery(consulta);
			if(miResultset.next()) {
				return true;
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return false;
	}
	public static boolean introducirMascota(int idMascota,String nombre,int idCliente) {
		try {
			miStatement = miConexion.createStatement();
			String insertar="INSERT INTO Mascotas VALUES("+"'"+idMascota+"'"+","+"'"+nombre+"'"+","+"'"+idCliente+"'"+");";
			miStatement.executeUpdate(insertar);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return false;
	}
	public static boolean existeMascota(int id) {
		String consulta="Select * from Mascotas where id_mascota='"+id+"';";
		try {
			miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/ClienteMascota", "user","password");
			miStatement = miConexion.createStatement();
			ResultSet miResultset=miStatement.executeQuery(consulta);
			if(miResultset.next()) {
				return true;
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return false;
	}
}