package controller;

import java.util.ArrayList;
import java.util.LinkedList;

import javax.swing.DefaultListModel;

import model.DAO.GestoreUtenzaDAO;
import model.componenti.*;

public interface AutostradaInt {
	
	public LinkedList<String>  getAutostradebyUsername(String user) ;
	
	public LinkedList<String>  getCasellibyIDautostrada(String ID);
	
	public void setAutostrada(Autostrada a, Integer lunghezza);
	
	public ArrayList<Integer> getkmbyID(String ID);
	
	public void setCasello(Casello c);
	
	public ArrayList<String> getIdautostradaByusername(String user);
	
	public void deleteautostrada(String codiceSelected);
	
	public void deletecasello(String id);
}

	
	

