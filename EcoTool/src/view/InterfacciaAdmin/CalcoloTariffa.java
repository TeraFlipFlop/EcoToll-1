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
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.SwingConstants;
import javax.swing.DropMode;

public class CalcoloTariffa extends JFrame {
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
		btnAcquisisciTarga.setBounds(257, 98, 123, 21);
		getContentPane().add(btnAcquisisciTarga);
		
		JButton btnCalcola = new JButton("calcola");
		btnCalcola.setBounds(257, 168, 123, 21);
		getContentPane().add(btnCalcola);
		
		JButton btnEffettuaPagamento = new JButton("effettua pagamento");
		btnEffettuaPagamento.setBounds(257, 244, 123, 21);
		getContentPane().add(btnEffettuaPagamento);
		
		JTextPane txtpnLl = new JTextPane();
		txtpnLl.setText("report\r\n#\r\n#\r\n#\r\n#\r\n#\r\n#\r\n#\r\n#\r\n&");
		txtpnLl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtpnLl.setBounds(460, 99, 206, 198);
		getContentPane().add(txtpnLl);
		
		JLabel lblTarga = new JLabel("targa");
		lblTarga.setBounds(32, 76, 45, 13);
		getContentPane().add(lblTarga);
		
		JLabel lblImporto = new JLabel("importo");
		lblImporto.setBounds(32, 150, 45, 13);
		getContentPane().add(lblImporto);
		setBounds(100, 100, 711, 380);
	}
}
