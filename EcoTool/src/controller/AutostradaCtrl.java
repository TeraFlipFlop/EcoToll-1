package controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

import javax.swing.DefaultListModel;

import model.componenti.*;
import model.sql.GestoreUtenza;
import model.sql.SQLAutostrada;

public class AutostradaCtrl implements AutostradaInt{
	
	public LinkedList<String> getAutostradebyUsername(String user) {
		 return new SQLAutostrada().AutostradeByUser(user);
	}
	//-----v
	public ArrayList<String> getCodCaselli(){
		
		return new SQLAutostrada().getCodCaselli();
	}
	//----v
	public LinkedList<String> getCasellibyIDautostrada(String Id){

		return new SQLAutostrada().getCasellibyIDautostrada(Id);//---V
	}
	
	//-----v
	public void setAutostrada(Autostrada a, Integer lunghezza){};
	
	public ArrayList<Integer> getkmbyID(String ID) {return null;};//-----tariffa
	
	public void setCasello(Casello c){}
	
	public ArrayList<String> getCodAutostrada(){
		return new SQLAutostrada().getCodAutostrada();
	}
	
	//------v
	
	public void deleteautostrada(String codiceSelected){}
	
	public void deletecasello(String id){}

	@Override
public ArrayList<String> getIdautostradaByusername(String user) {

		return null;
	}

//------X
	
	public void modCaselloCtrl() {};//<----------update
	public void modAutostradaCtrl() {};//<---------update
			
	
	
	
	
}

	
	

