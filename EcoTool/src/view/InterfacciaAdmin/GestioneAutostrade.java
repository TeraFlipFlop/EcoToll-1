package view.InterfacciaAdmin;

import java.awt.BorderLayout;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.PreparedStatement;

import controller.AutostradaCtrl;
import controller.LoginController;
import model.DAO.AutostradaDAO;
import model.database.database;
import view.Login;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;

public class GestioneAutostrade extends JFrame {
	private static final String CREATE_QUERY_AUTOSTRADA = "insert into autostrada values(?,?,?,?)";
	private static final String DELETE_QUERY = "delete from autostrada where codice = ?";	
	
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	String a;
	
				//FINESTRA PRINCIPALE
	
	public GestioneAutostrade(String  user) {
		getContentPane().setLayout(null);
		setBounds(100, 100, 453, 346);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
					//BOTTONE INDIETRO
		
		JButton btnIndietro = new JButton("indietro");
		btnIndietro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				FinestraPrincipale l = new FinestraPrincipale(user);
				l.setVisible(true);
			}
		});
					//DIMENSIONI BOTTONE INDIETRO
		
		btnIndietro.setBounds(327, 6, 117, 29);
		getContentPane().add(btnIndietro);
		
						//BOTTONE CANCELLA
		
		JButton btnCancella = new JButton("cancella");
		btnCancella.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection con = new database().Connect();
				String cod= textField.getText() ;
				java.sql.PreparedStatement st = null;
				try {
					st=con.prepareStatement(DELETE_QUERY);
					
					st.setString(1, cod);
		st.execute();
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				System.out.print("ho cancellato");
				JOptionPane.showMessageDialog(null, "ho cancellato");
				
			}
		});
					//DIMENSIONI BOTTONE CANCELLA
		
		btnCancella.setBounds(297, 225, 117, 29);
		getContentPane().add(btnCancella);
		
						//BOTTONE INSERISCI
		
		JButton btnInserisci = new JButton("inserisci");
		btnInserisci.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection con = new database().Connect();
				String cod= textField.getText() ;
				String tipo = textField_1.getText();
				String nome = textField_2.getText();
				
				java.sql.PreparedStatement st = null;
				try {
					st=con.prepareStatement(CREATE_QUERY_AUTOSTRADA);
					
					st.setString(1, cod);
					st.setString(2, nome);
					st.setString(3, tipo);
					st.setString(4, user);
					
					st.execute();
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
					System.out.print("ci sto dentro un casino");
					JOptionPane.showMessageDialog(null, "autostrada inserita");

			}
		});
					//DIMENSIONE BOTTONE INSERISCI
		
		btnInserisci.setBounds(39, 225, 117, 29);
		getContentPane().add(btnInserisci);
		
							//SERIE DI TEXTFIELD
		
		textField = new JTextField();
		textField.setBounds(263, 60, 130, 26);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(263, 111, 130, 26);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(263, 149, 130, 26);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
					
						//SERIE DI LABEL
		
		JLabel lblCodice = new JLabel("Codice");
		lblCodice.setBounds(39, 65, 61, 16);
		getContentPane().add(lblCodice);
		
		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setBounds(39, 116, 61, 16);
		getContentPane().add(lblTipo);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(39, 154, 61, 16);
		getContentPane().add(lblNome);
			
						//Bottone Mostra Tutto
		
		JButton btnMostraTutto = new JButton("Mostra Tutto");
		btnMostraTutto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				mostra t=new mostra (0,null);
				t.setVisible(true);
				t.setBounds(200, 200, 450, 339);
				//mostra m=new mostra(0,null);
				//m.setVisible(true);
			}
		});
					//Dimensioni bottone Mostra Tutto
		
		btnMostraTutto.setBounds(168, 263, 117, 29);
		getContentPane().add(btnMostraTutto);
		
		
					//Label Gestione Autostrade
		
		JLabel lblGestioneAutostrade = new JLabel("Gestione Autostrade");
		lblGestioneAutostrade.setBounds(39, 19, 130, 16);
		getContentPane().add(lblGestioneAutostrade);
				
							//COMBO BOX
		
		ArrayList <String> codlist = new ArrayList <String>() ;
		codlist =  new AutostradaCtrl().getCodAutostrada();
		String [] codicevar = new String[codlist.size()];
		JComboBox jComboBox = new JComboBox(codlist.toArray(codicevar));
		JComboBox codiceComboBox = jComboBox;
		
		codiceComboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			String	codiceSelected = codiceComboBox.getSelectedItem().toString();
		textField.setText(codiceSelected);
		ArrayList <String> codlist =  new AutostradaCtrl().getCodAutostrada();
		String []codicevar = new String[codlist.size()];
		
			}
		});
						//DIMENSIONI COMBO BOX
		
		codiceComboBox.setBounds(130, 61, 130, 27);
		getContentPane().add(codiceComboBox);
		
						//BOTTONE REFRESH
		
		JButton btnRefresh = new JButton("refresh");
		btnRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GestioneAutostrade f = new GestioneAutostrade(user);
				f.setVisible(true);
				dispose();
			}
		});
						//DIMENSIONI BOTTONE REFRESH
		
		btnRefresh.setBounds(198, 6, 117, 29);
		getContentPane().add(btnRefresh);
		
					//BOTTONE MODIFICA
		
		JButton button = new JButton("modifica");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//CHIAMATE VIEW "ModAUTOSTRADA"
				
				 {
					dispose();
					ModAutostrada p = new ModAutostrada(user);
					p.setVisible(true);
				}
		}
		});
					//DIMENSIONE BOTTONE MODIFICA
		
		button.setBounds(168, 225, 117, 29);
		getContentPane().add(button);
	}
}



