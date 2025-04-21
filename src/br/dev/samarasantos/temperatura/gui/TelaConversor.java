package br.dev.samarasantos.temperatura.gui;


import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaConversor {

	private JTextField txtCelsius;
	private JLabel lblCelsius;
	private JButton buttonKelvin;
	private JButton buttonFahreinheit;
	private JLabel lblResultado;
	private JLabel lblMensagemErro;
	
	public void criarTelaConversor() {
		
		JFrame tela = new JFrame();
		tela.setSize(500, 500);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setTitle("Conversor de Temperatura");
		tela.setLocationRelativeTo(null);
		tela.setLayout(null);
		tela.setResizable(false);
		tela.setVisible(true);
		
		
		JLabel lblCelsius = new JLabel();
		lblCelsius.setText("Temperatura em graus celsius: ");
		Font font = new Font("Arial", Font.BOLD, 12);
		lblCelsius.setFont(font);
		lblCelsius.setBounds(15, 18, 200, 20);
		
		JTextField txtCelsius = new JTextField();
		Font font1 = new Font("Arial", Font.BOLD, 30);
		txtCelsius.setFont(font1);
		txtCelsius.setBounds(15, 50, 460, 40);
		
		JButton buttonKelvin = new JButton();
		buttonKelvin.setText("Kelvin");
		buttonKelvin.setBounds(15, 115, 220, 60);
		
		JButton buttonFahreinheit = new JButton();
		buttonFahreinheit.setText("Fahreinheit");
		buttonFahreinheit.setBounds(245, 115, 220, 60);
		
		
		tela.getContentPane().add(lblCelsius);
		tela.getContentPane().add(txtCelsius);
		tela.getContentPane().add(buttonKelvin);
		tela.getContentPane().add(buttonFahreinheit);
		
		
		
	}
	
	
}
