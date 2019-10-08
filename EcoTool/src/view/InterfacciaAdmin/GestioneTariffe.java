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
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.BoxLayout;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JComboBox;
import javax.swing.JSeparator;
import javax.swing.JSplitPane;

public class GestioneTariffe extends JFrame{
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	public GestioneTariffe(String username) {
		setBounds(100, 100, 450, 339);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		//BOTTONE INDIETRO
		JButton btnIndietro = new JButton("indietro");
		btnIndietro.setBounds(351, 6, 93, 29);
		btnIndietro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				FinestraPrincipale u = new FinestraPrincipale(username);
				u.setVisible(true);
			}
		});
		getContentPane().setLayout(null);
		getContentPane().add(btnIndietro);
		
		JLabel lblTariffe = new JLabel("Tariffe");
		lblTariffe.setBounds(28, 44, 61, 16);
		getContentPane().add(lblTariffe);
		
		JLabel lblOneri = new JLabel("Oneri");
		lblOneri.setBounds(303, 47, 61, 16);
		getContentPane().add(lblOneri);
		
		JLabel lblClasseA = new JLabel("Classe A");
		lblClasseA.setBounds(28, 84, 61, 16);
		getContentPane().add(lblClasseA);
		
		JLabel lblClasseB = new JLabel("Classe B");
		lblClasseB.setBounds(28, 112, 61, 16);
		getContentPane().add(lblClasseB);
		
		JLabel lblClasse = new JLabel("Classe 3");
		lblClasse.setBounds(28, 139, 61, 16);
		getContentPane().add(lblClasse);
		
		JLabel lblClasse_1 = new JLabel("Classe 4");
		lblClasse_1.setBounds(28, 167, 61, 16);
		getContentPane().add(lblClasse_1);
		
		JLabel lblClasse_2 = new JLabel("Classe 5");
		lblClasse_2.setBounds(28, 195, 61, 16);
		getContentPane().add(lblClasse_2);
		
		JLabel lblEuro = new JLabel("Euro 1");
		lblEuro.setBounds(254, 84, 61, 16);
		getContentPane().add(lblEuro);
		
		JLabel lblEuro_1 = new JLabel("Euro 2");
		lblEuro_1.setBounds(254, 112, 61, 16);
		getContentPane().add(lblEuro_1);
		
		JLabel lblEuro_2 = new JLabel("Euro 3");
		lblEuro_2.setBounds(254, 139, 61, 16);
		getContentPane().add(lblEuro_2);
		
		JLabel lblEuro_3 = new JLabel("Euro 4");
		lblEuro_3.setBounds(254, 167, 61, 16);
		getContentPane().add(lblEuro_3);
		
		JLabel lblEuro_4 = new JLabel("Euro 5");
		lblEuro_4.setBounds(254, 195, 61, 16);
		getContentPane().add(lblEuro_4);
		
		JLabel lblEuro_5 = new JLabel("Euro 6");
		lblEuro_5.setBounds(254, 223, 61, 16);
		getContentPane().add(lblEuro_5);
		
		textField = new JTextField();
		textField.setBounds(99, 79, 130, 26);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(101, 107, 130, 26);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(101, 134, 130, 26);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(101, 162, 130, 26);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(101, 190, 130, 26);
		getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(313, 79, 130, 26);
		getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(314, 107, 130, 26);
		getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(314, 134, 130, 26);
		getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(314, 162, 130, 26);
		getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(314, 190, 130, 26);
		getContentPane().add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(314, 223, 130, 26);
		getContentPane().add(textField_10);
		textField_10.setColumns(10);
		
		JButton btnCambia = new JButton("Cambia");
		btnCambia.setBounds(46, 268, 117, 29);
		getContentPane().add(btnCambia);
		
		JButton btnCambia_1 = new JButton("Cambia");
		btnCambia_1.setBounds(301, 268, 117, 29);
		getContentPane().add(btnCambia_1);
		
		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setBounds(28, 223, 61, 16);
		getContentPane().add(lblTipo);
		
		String [] pet = {"montagna","pianura"};
		
		JComboBox comboBox = new JComboBox(pet);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (comboBox.getSelectedIndex()==0) {
					
					JOptionPane.showMessageDialog(rootPane, "");
					
					
				};
				if (comboBox.getSelectedIndex()==1) {
					
					JOptionPane.showMessageDialog(rootPane, "Pianura");

				};
				if (comboBox.getSelectedIndex()==2) {
					
					JOptionPane.showMessageDialog(rootPane, "Montagna");

				
			}}
		});
		comboBox.setBounds(101, 219, 128, 27);
		
		getContentPane().add(comboBox);
		
		JLabel label = new JLabel("New label");
		label.setBounds(111, 223, 61, 16);
		getContentPane().add(label);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(241, 84, 1, 12);
		getContentPane().add(separator);

	}	
}
