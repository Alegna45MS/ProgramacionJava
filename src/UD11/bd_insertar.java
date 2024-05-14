package UD11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class bd_insertar {
	public static void main(String[] args) {
		try{
//1.- Crear conexion: en MYSQL: SHOW VARIABLES WHERE VARIABLE_NAME IN('hostname','port')
			Connection miConexion=
					DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_prueba","user","password");
//2.- Crear objeto Statement
			Statement miStatement=miConexion.createStatement();
//3.- Ejecutar SQL
			String instruccionSQL2="INSERT INTO personas VALUES('123a','paco',21)";
// Para insert, update, delete
			miStatement.executeUpdate(instruccionSQL2);
		} catch(Exception e){
			System.out.println(e.getMessage());
}
}
}
