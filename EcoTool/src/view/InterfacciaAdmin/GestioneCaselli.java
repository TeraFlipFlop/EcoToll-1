package view.InterfacciaAdmin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import view.Login;
import controller.AutostradaCtrl;
import controller.LoginController;
import model.database.database;

import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class GestioneCaselli extends JFrame{
	private static final String CREATE_QUERY_CASELLI = "insert into casello values(?,?,?,?)";
	private static final String DELETE_QUERY = "delete from casello where codice = ?";
	
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	String a;
	
				//SCHERMATA INIZIALE
	
	public GestioneCaselli(String username) {
		getContentPane().setLayout(null);
		setBounds(100, 100, 462, 353);
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
					//DIMENSIONI BOTTONE INDIETRO
			
			btnIndietro.setBounds(327, 6, 117, 29);
			getContentPane().add(btnIndietro);
			
			
					//SERIE DI TEXTFIELD
			textField = new JTextField();
			textField.setBounds(272, 60, 130, 26);
			getContentPane().add(textField);
			textField.setColumns(10);
			
			textField_1 = new JTextField();
			textField_1.setBounds(272, 99, 130, 26);
			getContentPane().add(textField_1);
			textField_1.setColumns(10);
			
			textField_2 = new JTextField();
			textField_2.setBounds(272, 137, 130, 26);
			getContentPane().add(textField_2);
			textField_2.setColumns(10);
			
			textField_3 = new JTextField();
			textField_3.setBounds(272, 175, 130, 26);
			getContentPane().add(textField_3);
			textField_3.setColumns(10);
			
			
			
			//BOTTONE REFRESH
			
JButton btnRefresh = new JButton("refresh");
btnRefresh.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		GestioneCaselli f = new GestioneCaselli (username);
		f.setVisible(true);
		dispose();
		
	}
});
			//DIMENSIONI BOTTONE REFRESH

btnRefresh.setBounds(198, 6, 117, 29);
getContentPane().add(btnRefresh);
			
			
						//SERIE DI LABEL
			JLabel lblId = new JLabel("ID");
			lblId.setBounds(47, 65, 61, 16);
			getContentPane().add(lblId);
			
			JLabel lblAutostrada = new JLabel("Km");
			lblAutostrada.setBounds(47, 104, 76, 16);
			getContentPane().add(lblAutostrada);
			
			JLabel lblKm = new JLabel("Autostrada");
			lblKm.setBounds(47, 142, 76, 16);
			getContentPane().add(lblKm);
			
			JLabel lblNome = new JLabel("Nome");
			lblNome.setBounds(47, 180, 61, 16);
			getContentPane().add(lblNome);
			
			
						//BOTTONE INSERISCI
			
			JButton btnInserisci = new JButton("inserisci");
			btnInserisci.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Connection con = new database().Connect();
					String codice= textField.getText();
					String Km = textField_1.getText();
					String nome = textField_3.getText();
					String Autostrada = textField_2.getText();
					
					
					java.sql.PreparedStatement st = null;
					try {
						st=con.prepareStatement(CREATE_QUERY_CASELLI);
						
						st.setString(1, codice);
						st.setString(2, Km);
						st.setString(3, Autostrada);
						st.setString(4, nome);
						
						st.execute();
						
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
						System.out.print("ci sto dentro un casino");
						btnRefresh.doClick();
						JOptionPane.showMessageDialog(null, "inserito");

				}
			});
						//DIMENSIONE BOTTONE INSERISCI
			
			btnInserisci.setBounds(20, 225, 117, 29);
			getContentPane().add(btnInserisci);
			
			
			
						//BOTTONE MODIFICA
			
			JButton button = new JButton("modifica");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					//CHIAMATE VIEW "ModAUTOSTRADA"
					
					 {
						dispose();
						ModCasello p = new ModCasello(username);
						p.setVisible(true);
					}
			}
			});
			
			
						//DIMENSIONE BOTTONE MODIFICA
			button.setBounds(156, 225, 117, 29);
			getContentPane().add(button);
			
						//BOTTONE CANCELLA
			
			JButton btnCancella = new JButton("Cancella");
			btnCancella.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Connection con = new database().Connect();
					String codice = textField.getText();
			
					java.sql.PreparedStatement st = null;
					
					try {
						st=con.prepareStatement(DELETE_QUERY);
						
						st.setString(1, codice);

						st.execute();
						
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
						System.out.print("dovrebbe andare");
						btnRefresh.doClick();
						JOptionPane.showMessageDialog(null, "eliminato");

				}
			});
						//DIMENSIONI BOTTONE CANCELLA
			
			btnCancella.setBounds(285, 225, 117, 29);
			getContentPane().add(btnCancella);
			
			
					//Bottone Mostra Tutto
			
			JButton btnMostraTutto = new JButton("Mostra Tutto");
			btnMostraTutto.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					mostra m=new mostra(1,null);
					m.setVisible(true);
					m.setBounds(200, 200, 450, 339);
				}
			});
						//Dimensioni bottone Mostra Tutto
			
			btnMostraTutto.setBounds(156, 263, 117, 29);
			getContentPane().add(btnMostraTutto);
				
				

				
							//LABEL CASELLI
				
				JLabel lblGestioneCaselli = new JLabel("Gestione Caselli");
				lblGestioneCaselli.setBounds(20, 11, 103, 16);
				getContentPane().add(lblGestioneCaselli);
				
				
				
				
				ArrayList <String> codlist1 = new ArrayList <String>() ;
				
				codlist1 =  new AutostradaCtrl().getCodCaselli();
				String [] codicevar1 = new String[codlist1.size()];
				JComboBox comboBox = new JComboBox(codlist1.toArray(codicevar1));
				
				
				comboBox.setBounds(157, 62, 103, 22);
				getContentPane().add(comboBox);
				
				
				
				//COMBO BOX
		
				
				comboBox.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
					String	codiceSelected = comboBox.getSelectedItem().toString();
					textField.setText(codiceSelected);
				
				
				
				
				
									


					}
				});}}