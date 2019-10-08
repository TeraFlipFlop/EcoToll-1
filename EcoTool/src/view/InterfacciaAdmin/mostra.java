package view.InterfacciaAdmin;
import view.InterfacciaAdmin.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.TableColumn;

import view.Login;
import controller.AutostradaCtrl;
import controller.LoginController;
import model.database.database;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.ListModel;
import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;

import javax.swing.JFrame;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.TextArea;
import javax.swing.JList;
import model.sql.*;
public class mostra  extends JFrame{
	public mostra(int i,String auto) {
		this.setBounds(200, 200, 484, 364);
		this.setLocation(1000, 1000);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblMostraTutto = new JLabel("mostra tutto");
		lblMostraTutto.setBounds(105, 10, 247, 16);
		lblMostraTutto.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblMostraTutto);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 28, 434, 283);
		getContentPane().add(scrollPane);
		
		JTextArea ta = new JTextArea();
		scrollPane.setViewportView(ta);
		
		
		 
		LinkedList<String> alist=new LinkedList<String>();
		String li="";
		
		

		if (i==0) {
			
			alist= new AutostradaCtrl().getAutostradebyUsername("");
	
		int j=0;
		li="codice\t  nome\t  tipo \n";
		for (String s:alist) {
			if(j<3) {li=li+" "+s+"\t ";j++;}
			
			if(j==3) {li=li+"\n";j=0;}
			    
			
		}
		ta.setText(li);}
		
		
		else	if (i==1) {
			System.out.print(auto);
			
			
			alist= new AutostradaCtrl().getCasellibyIDautostrada("");
					
					int j=0;
					li="autostrada\t nome\t km\t codice \n";
					for (String s:alist) {
						if(j<4) {li=li+" "+s+"\t";j++;}
						
						if(j==4) {li=li+"\n";j=0;}
						    }
					
					ta.setText(li);}
					
					JButton btnRefresh = new JButton("refresh");
					btnRefresh.setBounds(311, 8, 117, 20);
					btnRefresh.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							mostra m=new mostra(i,auto);
							m.setVisible(true);
							m.setBounds(200, 200, 450, 339);
							dispose();			
			}
					});{
					getContentPane().add(btnRefresh);
					} }
		
		
	
		
	}
	

