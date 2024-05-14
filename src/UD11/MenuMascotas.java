package UD11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MenuMascotas {
	static Connection miConexion;
	static Statement miStatement;
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		int opcion;
		do {
			menu();
			opcion=in.nextInt();
			switch(opcion) {
			case 1:
				try {
					miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/ClienteMascota", "user","password");
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
				in.nextLine();
				int idCliente,idMascota;
				System.out.println("Introduce el id del cliente");
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
			break;
			case 2:
				try {
					miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/ClienteMascota", "user","password");
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
				in.nextLine();
				System.out.println("Introduce el id del cliente");
				//Pedimos el id del cliente y nos aseguramos de que existe
				do {
					idCliente=Integer.parseInt(in.nextLine());
				}while(!existeCliente(idCliente));
				//Pedimos el id de la mascota y nos aseguramos de que existe
				do {
					System.out.println("Introduce el id de la mascota");
					idMascota=Integer.parseInt(in.nextLine());
					
				}while(!existeMascota(idMascota));
				actualizarNombreMascotas(idCliente,idMascota);
			break;
			case 3:
				try {
					miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/ClienteMascota", "user","password");
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
				in.nextLine();
				//Pedimos el id de la mascota y nos aseguramos de que NO existe
				do {
					System.out.println("Introduce el id de la mascota");
					idMascota=Integer.parseInt(in.nextLine());
					
				}while(!existeMascota(idMascota));
				borrarMascota(idMascota);
				
			break;
			case 4:
				try {
					miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/ClienteMascota", "user","password");
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
				in.nextLine();
				System.out.println("Introduce el id del cliente");
				//Pedimos el id del cliente y nos aseguramos de que existe
				do {
					idCliente=Integer.parseInt(in.nextLine());
				}while(!existeCliente(idCliente));
				consultarMascotasCliente(idCliente);
			break;
			case 5:
				System.out.println("Adios");
			break;
			default:
				System.out.println("opcion no valida");
			}
		}while(opcion!=5);

	}
	public static void menu() {
		System.out.println("Escoge la opcion que quieras");
		System.out.println("1.Introduce mascota");//verificar si la mascota no existe y existe cliente
		System.out.println("2.Actualizar nombre mascota");//verificar mascota existe
		System.out.println("3.Borrar mascota");//verificar mascota existe
		System.out.println("4.Consultar mascotas de cliente");//verificar cliente existe
		System.out.println("5.Salir");
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
	public static boolean borrarMascota(int idMascota) {
		if(existeMascota(idMascota)) {
			try {
				miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/ClienteMascota", "user","password");
				miStatement = miConexion.createStatement();
				String instruccionSQL2 = "DELETE FROM Mascotas WHERE id_mascota ='"+idMascota+"';";
				miStatement.executeUpdate(instruccionSQL2);
				return true;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}else {
			System.out.println("No hay mascota con esta id");
		}
		return false;
		}
	public static void consultarMascotasCliente(int idCliente) {
		if(existeCliente(idCliente)) {
			try {
				miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/ClienteMascota", "user","password");
				miStatement = miConexion.createStatement();
				String consulta = "Select * from Mascotas where id_cliente="+"'"+idCliente+"';";
				ResultSet miResultset=miStatement.executeQuery(consulta);
				while(miResultset.next()){
					System.out.println("ID mascota:"+miResultset.getInt("id_mascota") +"\n"+"Nombre:"+miResultset.getString("nombre")+"\n"+"ID cliente:"+miResultset.getInt("id_cliente"));
					}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
	}
}
	public static void actualizarNombreMascotas(int id_cliente,int id_mascota) {
			System.out.println("Escribe el nuevo nombre");
			String nuevoNombre=in.nextLine();
			try {
				miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/ClienteMascota", "user","password");
				miStatement = miConexion.createStatement();
				String update = "UPDATE Mascotas SET nombre = '"+nuevoNombre+"' WHERE id_cliente='"+id_cliente+"' and id_mascota='"+id_mascota+"';";
				miStatement.executeUpdate(update);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
	}
}
