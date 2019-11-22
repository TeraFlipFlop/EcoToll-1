package view.InterfacciaAdmin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import view.Login;
import controller.LoginController;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class GestioneVeicoli extends JFrame {
	public GestioneVeicoli(String username) {
		getContentPane().setLayout(null);
		setBounds(100, 100, 450, 339);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		//BOTTONE INDIETRO
		JButton btnIndietro = new JButton("indietro");
		btnIndietro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				FinestraPrincipale u = new FinestraPrincipale(username);
				u.setVisible(true);
			}
		});
		btnIndietro.setBounds(327, 6, 117, 29);
		getContentPane().add(btnIndietro);
		
		JTextArea txtrioDevoSchioppare = new JTextArea();
		txtrioDevoSchioppare.setRows(10);
		txtrioDevoSchioppare.setText("-io devo schioppare perche sono inutile-\r\n+\r\n+\r\n+\r\n+\r\n+\r\n&");
		txtrioDevoSchioppare.setBounds(52, 45, 325, 212);
		getContentPane().add(txtrioDevoSchioppare);
	}	
}
