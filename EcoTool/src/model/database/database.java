package model.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Qui va il collegamento al Database
public class database {
	
	private static String LOCATION="jdbc:mysql://localhost:3306/pedaggiautostrade?serverTimezone=UTC";
			//monitoraggioambientale?characterEncoding=UTF-8&useSSL=false";
			//characterEncoding=UTF-8&useSSL=false?";
	private static String NAME="root";
	private static String PSW="root";
	
	
	//Effettua connessione DB
	public Connection Connect() {
		
	
		Connection myConn;
		
		try {
			myConn=DriverManager.getConnection(LOCATION,NAME,PSW);
			System.out.println("\n----Connessione Effettuata Corretamente al Database---- ");
			return myConn;
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
}