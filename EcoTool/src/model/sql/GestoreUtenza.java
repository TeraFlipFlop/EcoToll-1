package model.sql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

import model.database.database;

public class GestoreUtenza {

	//Effettuiamo la logica del login
	
	public String login(String username, String password) {
			
			
			
			//Connessione al database per prendere i dati
			Connection con = new database().Connect();
			try {
				Statement st=con.createStatement();
				
				//Controlliamo se l'utente loggato è un admin mediante la query su amministratore 
				
				
				System.out.println(username);
				System.out.println(password);
				
				ResultSet result=st.executeQuery("select * from amministratore where Username='"+username+"'and Password='"+password+"'");
				
				// se è admin 
				if(result.next()) {
					return "amministratore";
					
				}

				
				//Se l'utente non è un admin verifichiamo se è un gestore 
				//Se è un gestore allora andiamo a vedere di che tipo è , quindi faremo una query per prenderci l'attributo tipo
				
				// result=st.executeQuery("select * from gestoresensori where Username='"+username+"'and Password='"+password+"'");
				
				 //if(result.next()) {
					// System.out.println(result.getString("Tipo"));
					 //return result.getString("Tipo");
					 	 
				//}
				
			

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//Se l'utente non è ne admin e ne Gestore 
			return "";
		}

}
