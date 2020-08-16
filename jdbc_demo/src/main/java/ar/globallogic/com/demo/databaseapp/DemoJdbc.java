package ar.globallogic.com.demo.databaseapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DemoJdbc {
			
	public static void main(String args[]) {
		try {
			System.out.println("Connecting to database! .....");
			
			//Se conecta a un cliente que carga la base en memoria llamado H2, para fines practicos. 
			//En este caso H2 esta levantando la base desde un archivo para evitar los inserts al principio del proyecto.
			//Para bases de datos mysql la url de conn seria jdbc:mysql://localhost:3306/Alumno
			Connection connection = DriverManager.getConnection("jdbc:h2:./src/main/resources/Alumno.h2",
					"root", "root");
			System.out.println("Database connected!\n");

			// Genero una sentencia sql donde pido un parametro para el nombre con el signo
			// (?).
			String updadeSentence = "SELECT id, nombre, nombre2 from ALUMNO where nombre2 = ?";

			// Generar un statement para preparar y ejecutar en el siguiente paso,  la consulta sql en la base de datos,
			//con la conexion que ya fue establecida
			//En caso de no tener parametros la consulta, puedo utilizar "statement".
			PreparedStatement preparedStatement = connection.prepareStatement(updadeSentence);

			// Actualizo el sql anterior con los parametros, setString(posicion_parametro, valor)
			preparedStatement.setString(1, "Quito");

			// Utitlizo executeQuery para realizar una consulta a la base y lo guardo en ResultSet
			// ResultSet: es una "tabla virtual" que permite mover el cursor entre sus registros.
			ResultSet resultSet = preparedStatement.executeQuery();
			
			//Recorro el resultset
			while (resultSet.next()) {
				System.out.print("id : " + resultSet.getInt("id"));
				System.out.print(" | nombre : " + resultSet.getString("nombre"));
				System.out.println(" | apellido : " + resultSet.getString("nombre2"));
			}
		
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	
}
