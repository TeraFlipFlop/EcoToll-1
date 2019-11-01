package model.DAO;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import controller.AutostradaInt;
import model.componenti.Autostrada;
import model.componenti.Casello;
import model.database.database;
import view.InterfacciaAdmin.mostra;

public class AutostradaDAO {
	
public ArrayList<String>  AutostradeByUser(String user) {
		ArrayList<String> alist=new ArrayList<String>();
		
		String amministratore;
		
		amministratore ="'"+user+"'";
		
		Connection con = new database().Connect();
		int km=0;
		String cod = null;
		String tipo=null;
		String nome=null;
		String autostrada =null;
		java.sql.PreparedStatement st = null;
		String sql =null;
		int i = 0;
		if(user.equals(""))sql="select * from autostrada";
		else
		
		
		sql="select * from autostrada where amministratore ="+amministratore;
		
		try {
	st=con.prepareStatement(sql);
			
		ResultSet res	=null;

		 st.execute();
		 res = st.getResultSet();
		while(res.next()) {
			
			cod=res.getString("codice");
			tipo =res.getString("tipo");
			nome= res.getString("nome");
			
			alist.add(cod);
			alist.add(tipo);
			alist.add(nome);
			
			
			
		}
		

	
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return alist;
		
}

//--------------------------V

public ArrayList<String> getCodCaselli(){

	 
		ArrayList<String> alist=new ArrayList<String>();

		Connection con = new database().Connect();
	
		java.sql.PreparedStatement st = null;
		String sql =null;
	
	
		
		
		sql="select codice from casello" ;
		
		try {
	st=con.prepareStatement(sql);
			
		ResultSet res	=null;

		 st.execute();
		 res = st.getResultSet();
		while(res.next()) {
			
			
			
			alist.add(res.getString("codice"));
	
		}
		

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return alist;}
	
//--------------------------V

public ArrayList<String> getCasellibyIDautostrada(String auto) {
		
		Connection con = new database().Connect();
		int km=0;
		String cod = null;
		
		String nome=null;
		String autostrada =null;
		java.sql.PreparedStatement st = null;
		String sql =null;
		if(auto.equals(""))sql="select * from casello";
		else
		sql="select * from casello where Autostrada='"+auto+"'";
		
		
		
		ArrayList<String> alist=new ArrayList<String>();
		
		
		try {
			st=con.prepareStatement(sql);
					
				ResultSet res	=null;

				 st.execute();
				 res = st.getResultSet();
				while(res.next()) {
					
					km=res.getInt("km");
					cod=res.getString("codice");
					nome= res.getString("nome");
					autostrada=res.getString("autostrada");
					
					
					alist.add(autostrada);
					alist.add(nome);
					 
				String	k=Integer.toString(km)   ;
					alist.add(k);
					alist.add(cod);
					
					
				};
				
			
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		return alist;}
		
//--------------------------V	

public void setAutostrada(Autostrada a, Integer lunghezza) {
		
		
	}

//--------------------------X

public ArrayList<Integer> getkmbyID(String ID) {
		// TODO Auto-generated method stub
		return null;
	}

//--------------------------X

public void setCasello(Casello c) {
		// TODO Auto-generated method stub
		
	}

//--------------------------X

public ArrayList<String> getCodAutostrada() {
		ArrayList<String> alist=new ArrayList<String>();

		Connection con = new database().Connect();
	
		java.sql.PreparedStatement st = null;
		String sql =null;
		
		sql="select codice from autostrada" ;
		
		try {
	st=con.prepareStatement(sql);
			
		ResultSet res	=null;

		 st.execute();
		 res = st.getResultSet();
		while(res.next()) {
			
			
			
			alist.add(res.getString("codice"));
	
		}
		

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return alist;}

//--------------------------V
	
public void deleteautostrada(String codiceSelected) {
		// TODO Auto-generated method stub
		
	}

//--------------------------X	
public void deletecasello(String id) {
		// TODO Auto-generated method stub
		
	}
	
//--------------------------X

public void modCasello(String cod, String km, String nom, String au) {
	
	Connection con = new database().Connect();

	
	
	String q= "UPDATE `pedaggiautostrade`.`casello` SET `Km` = '"+km+"', `nome` = '"+nom+"', `Autostrada` = '"+au+"'  WHERE (`codice` = '"+cod+"');";
	
	java.sql.PreparedStatement st = null;
	try {
		
			st=con.prepareStatement(q);
	
st.execute();
		
	} catch (SQLException e1) {
	
		e1.printStackTrace();
	}
	System.out.print("ho modificato");
	
	JOptionPane.showMessageDialog(null, "modifica effettuata");
	
 };//<----------update
public void modAutostrada(String cod, String type, String nom) {
	
	Connection con = new database().Connect();
	String codice =cod;
	String tipo = type ;
	String nome = nom ;
	
	
	
	String qq = "UPDATE pedaggiautostrade.autostrada SET  Nome = '"+ nome+"', Tipo = '"+ tipo  +"' WHERE (Codice ='"+  codice +"');";
	java.sql.PreparedStatement st = null;
	try {
		//st=con.prepareStatement(MOD_QUERY);
			st=con.prepareStatement(qq);
		//st.setString(1, "qualcosa");
st.execute();
		
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	System.out.print("ho modificato");
	JOptionPane.showMessageDialog(null, "modifica effettuata");
	
}

	
	
	
	
};//<---------update
		

	

