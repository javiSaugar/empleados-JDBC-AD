package bd;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
		
	public static void conectar() {
		
	        try {
	            String url = "jdbc:mysql://localhost:3306/empleados";
	            String user = "root";
	            String pass = " ";

	            Connection conn = DriverManager.getConnection(url, user, pass);
	            System.out.println("Conexión exitosa");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	 }
}


