package controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

import javax.swing.DefaultListModel;

import model.DAO.GestoreUtenzaDAO;
import model.DAO.AutostradaDAO;
import model.componenti.*;

public class AutostradaCtrl implements AutostradaInt{
	
	public ArrayList<String> getAutostradebyUsername(String user) {
		 return new AutostradaDAO().AutostradeByUser(user);
	}
	//-----v
	public ArrayList<String> getCodCaselli(){
		
		return new AutostradaDAO().getCodCaselli();
	}
	//----v
	public ArrayList<String> getCasellibyIDautostrada(String Id){

		return new AutostradaDAO().getCasellibyIDautostrada(Id);//---V
	}
	
	//-----v
	public void setAutostrada(Autostrada a, Integer lunghezza){};
	
	public ArrayList<Integer> getkmbyID(String ID) {return null;};//-----tariffa
	
	public void setCasello(Casello c){}
	
	public ArrayList<String> getCodAutostrada(){
		return new AutostradaDAO().getCodAutostrada();
	}
	
	//------v
	
	public void deleteautostrada(String codiceSelected){}
	
	public void deletecasello(String id){}

	@Override
public ArrayList<String> getIdautostradaByusername(String user) {

		return null;
	}

//------X
	
		
	//<----------update
	public void  modAutostradaCtrl(String cod,String type,String nom) {
		new    AutostradaDAO().modAutostrada(cod, type, nom);
		
		
		
	}
	public void modCaselloCtrl(String codice, String km, String nome, String autostrada) {
		new AutostradaDAO().modCasello(codice, km, nome, autostrada);
		
	}

	
		
	}//<---------update
			
	
	
	
	


	
	

