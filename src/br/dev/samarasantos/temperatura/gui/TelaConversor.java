package br.dev.samarasantos.temperatura.gui;


import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		
		JLabel lblResultado = new JLabel();
		lblResultado.setText("Resultado");
		Font font2 = new Font("Arial", Font.BOLD, 30);
		lblResultado.setFont(font2);
		lblResultado.setBounds(165, 135, 200, 200);
		
		JLabel lblMensagemErro = new JLabel();
		lblMensagemErro.setText("Por favor, insira um número valido!");
		lblMensagemErro.setBounds(150, 170, 250, 250);
		
		
		tela.getContentPane().add(lblCelsius);
		tela.getContentPane().add(txtCelsius);
		tela.getContentPane().add(buttonKelvin);
		tela.getContentPane().add(buttonFahreinheit);
		tela.getContentPane().add(lblResultado);
		tela.getContentPane().add(lblMensagemErro);
		
		buttonFahreinheit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		
		buttonKelvin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				
			}
		});
		
		tela.setVisible(true);
	}
	
	
}
