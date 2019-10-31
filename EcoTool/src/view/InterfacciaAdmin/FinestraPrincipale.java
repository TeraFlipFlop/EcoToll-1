package view.InterfacciaAdmin;
import view.Login.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.LoginController;
import view.Login;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.TextField;
import javax.swing.JLabel;

			//FINESTRA PRINCIPALE

public class FinestraPrincipale extends JFrame {
	public FinestraPrincipale(String username) {
		String user= username;
		setBounds(100, 100, 455, 357);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
						//BOTTONE GESTIONE AUTOSTRADE
		
		JButton btnNewButton = new JButton("Gestione Autostrade");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
					//CHIAMATE VIEW "GESTIONE AUTOSTRADE"
			 {
				dispose();
				GestioneAutostrade l = new GestioneAutostrade(username);
				l.setVisible(true);
			}
	}
});
		btnNewButton.setBounds(16, 117, 139, 47);
		
						//BOTTONE CASELLI
		
		JButton btnGestioneCaselli = new JButton("Gestione Caselli");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
				//DIMENSIONE BOTTONE CASELLI
		
		btnGestioneCaselli.setBounds(277, 117, 139, 43);
		
				//INSRIMENTO LISTENER AL CLICK SUL BOTTONE
		
		getContentPane().add(btnGestioneCaselli);
		btnGestioneCaselli.addActionListener(new ActionListener() {
			
					//CHIAMATA VIEW GESTIONE CASELLI
			
			public void actionPerformed (ActionEvent e ) {
				dispose();
				GestioneCaselli q = new GestioneCaselli(username);
				q.setVisible(true);
			}
		});
		
					//BOTTONE GESTIONE TARIFFE
		
		JButton btnGestioneTariffe = new JButton("Gestione Tariffe");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent p) {
			}
		});
		btnGestioneTariffe.setBounds(16, 204, 139, 44);
		getContentPane().add(btnGestioneCaselli);
		btnGestioneTariffe.addActionListener(new ActionListener() {
			
						//CHIAMATA VIEW GESTIONE TARIFFE
			
			public void actionPerformed (ActionEvent p) {
				dispose();
				GestioneTariffe t = new GestioneTariffe(username);
				t.setVisible(true);
			}
		});
		
						//BOTTONE CALCOLO TARIFFA
		
		JButton btnCalcoloTariffa = new JButton("Calcolo Tariffa");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent p) {
			}
		});
		btnCalcoloTariffa.setBounds(143, 65, 139, 44);
		getContentPane().add(btnCalcoloTariffa);
		btnCalcoloTariffa.addActionListener(new ActionListener() {
			
					//CHIAMATA VIEW CALCOLO TARIFFA
			
			public void actionPerformed (ActionEvent i) {
				dispose();
				CalcoloTariffa t = new CalcoloTariffa(username);
				t.setVisible(true);
			}
		});
		
						//BOTTONE GESTIONE VEICOLI
		
				JButton btnGestioneVeicoli = new JButton("Gestione Veicoli");
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent p) {
					}
				});
				btnGestioneVeicoli.setBounds(277, 204, 139, 44);
				getContentPane().add(btnGestioneVeicoli);
				btnGestioneVeicoli.addActionListener(new ActionListener() {
					
						//CHIAMATA VIEW GESTIONE VEICOLI
					
					public void actionPerformed (ActionEvent i) {
						dispose();
						GestioneVeicoli t = new GestioneVeicoli(username);
						t.setVisible(true);
					}
				});
		
//questi sono i bottoni della finestra principale, non dovrebbero essere qui ma funzionano lo stesso
		
		getContentPane().setLayout(null);
		getContentPane().add(btnNewButton);
		getContentPane().add(btnGestioneCaselli);
		getContentPane().add(btnGestioneTariffe);
		getContentPane().add(btnGestioneVeicoli);
		
					// BOTTONE LOGOUT
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLogout.setBounds(155, 266, 117, 29);
		getContentPane().add(btnLogout);{}
		
				//SCRITTA "SELEZIONA ATTIVITà"
		
		JLabel lblSelezionareAttivitDesiderata = new JLabel("Selezionare attivit\u00E0\u00A0desiderata:");
		lblSelezionareAttivitDesiderata.setBounds(6, 6, 194, 47);
		getContentPane().add(lblSelezionareAttivitDesiderata);
		
			//VISUALIZZA IL NOME DELL'ATTUALE UTENTE LOGGATO
		
		JLabel lblNewLabel = new JLabel("Bentornato "+username);
		lblNewLabel.setBounds(266, 21, 150, 16);
		getContentPane().add(lblNewLabel);
			
		//UN PEZZO DEL LOGOUT, QUESTA IDE POSIZIONA A CASO MA FUNZIONA
		
		btnLogout.addActionListener(new ActionListener() {
						
			//CHIAMATA VIEW "LOGIN" DOPO LOGOUT
			
			public void actionPerformed (ActionEvent e ) {
				dispose();
				Login l = new Login();
				l.setVisible(true);
			}
		});
	}
}
