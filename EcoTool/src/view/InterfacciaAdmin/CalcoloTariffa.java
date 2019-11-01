package view.InterfacciaAdmin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import view.Login;
import controller.AutostradaCtrl;
import controller.LoginController;
import controller.veicoloCtrl;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.SwingConstants;
import javax.swing.DropMode;
import javax.swing.JComboBox;
import javax.swing.JTextArea;

public class CalcoloTariffa extends JFrame {
	public String id =null;
	private JTextField textField;
	private JTextField textField_1;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	public CalcoloTariffa(String username) {
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
				btnIndietro.setBounds(526, 17, 117, 29);
				getContentPane().add(btnIndietro);
		
		
		getContentPane().setLayout(null);
		
		JLabel lblCalcoloPedaggio = new JLabel("Calcolo Pedaggio");
		lblCalcoloPedaggio.setBounds(21, 23, 108, 16);
		getContentPane().add(lblCalcoloPedaggio);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(33, 99, 155, 19);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setBounds(33, 169, 155, 19);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JRadioButton rdbtnCarta = new JRadioButton("carta");
		buttonGroup.add(rdbtnCarta);
		rdbtnCarta.setBounds(33, 244, 103, 21);
		getContentPane().add(rdbtnCarta);
		
		JRadioButton rdbtnContanti = new JRadioButton("contanti");
		buttonGroup.add(rdbtnContanti);
		rdbtnContanti.setBounds(33, 282, 103, 21);
		getContentPane().add(rdbtnContanti);
		
		JButton btnAcquisisciTarga = new JButton("acquisisci targa");
		btnAcquisisciTarga.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String g = new veicoloCtrl().get_targa();
			textField.setText(g);
			}
		});
		btnAcquisisciTarga.setBounds(257, 98, 123, 21);
		getContentPane().add(btnAcquisisciTarga);
		
		JButton btnCalcola = new JButton("calcola");
		btnCalcola.setBounds(257, 167, 123, 21);
		getContentPane().add(btnCalcola);
		
		JButton btnEffettuaPagamento = new JButton("effettua pagamento");
		btnEffettuaPagamento.setBounds(257, 244, 123, 21);
		getContentPane().add(btnEffettuaPagamento);
		
		JLabel lblTarga = new JLabel("targa");
		lblTarga.setBounds(32, 76, 45, 13);
		getContentPane().add(lblTarga);
		
		JLabel lblImporto = new JLabel("importo");
		lblImporto.setBounds(32, 150, 45, 13);
		getContentPane().add(lblImporto);
		
	
		
	
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(484, 197, 76, 22);
		getContentPane().add(comboBox_2);
		
		JLabel lblAutostrada = new JLabel("autostrada");
		lblAutostrada.setBounds(484, 74, 96, 16);
		getContentPane().add(lblAutostrada);
		
		JLabel lblEntrata = new JLabel("entrata");
		lblEntrata.setBounds(484, 130, 56, 16);
		getContentPane().add(lblEntrata);
		
		JLabel lblUscita = new JLabel("uscita");
		lblUscita.setBounds(484, 179, 56, 16);
		getContentPane().add(lblUscita);
		
		JTextArea txtrE = new JTextArea();
		txtrE.setText("report");
		txtrE.setBounds(484, 260, 197, 60);
		getContentPane().add(txtrE);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(484, 145, 76, 22);
		getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(484, 98, 76, 22);
		getContentPane().add(comboBox_1);
		setBounds(100, 100, 711, 380);
	}
}
