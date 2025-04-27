package br.dev.samarasantos.temperatura.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.dev.samarasantos.temperatura.model.Temperatura;

public class TelaConversor {

	private JTextField txtCelsius;
	private JLabel lblCelsius;
	private JButton buttonKelvin;
	private JButton buttonFahreinheit;
	private JLabel lblResultado;
	private JLabel lblMensagemErro;
	private JButton buttonLimpar;

	public void criarTelaConversor() {

		JFrame tela = new JFrame();
		tela.setSize(500, 500);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setTitle("Conversor de Temperatura");
		tela.setLocationRelativeTo(null);
		tela.setLayout(null);
		tela.setResizable(false);

		JLabel lblCelsius = new JLabel();
		lblCelsius.setText("Temperatura em graus celsius:");
		Font font = new Font("Arial", Font.BOLD, 12);
		lblCelsius.setFont(font);
		lblCelsius.setBounds(15, 18, 300, 20);

		JTextField txtCelsius = new JTextField();
		Font font1 = new Font("Arial", Font.BOLD, 30);
		txtCelsius.setFont(font1);
		txtCelsius.setBounds(15, 50, 460, 40);

		JButton buttonKelvin = new JButton();
		buttonKelvin.setText("Kelvin");
		buttonKelvin.setBounds(15, 115, 220, 60);

		JButton buttonFahrenheit = new JButton();
		buttonFahrenheit.setText("Fahrenheit");
		buttonFahrenheit.setBounds(245, 115, 220, 60);

		JLabel lblResultado = new JLabel();
		Font font2 = new Font("Arial", Font.BOLD, 30);
		lblResultado.setFont(font2);
		lblResultado.setBounds(165, 135, 200, 200);

		JLabel lblMensagemErro = new JLabel();
		Font font3 = new Font("Arial", Font.BOLD, 15);
		lblMensagemErro.setFont(font3);
		lblMensagemErro.setForeground(Color.RED);
		lblMensagemErro.setBounds(150, 170, 250, 250);
		
		JButton buttonLimpar = new JButton();
		buttonLimpar.setText("Limpar");
		buttonLimpar.setBounds(130, 380, 220, 60);

		tela.getContentPane().add(lblCelsius);
		tela.getContentPane().add(txtCelsius);
		tela.getContentPane().add(buttonKelvin);
		tela.getContentPane().add(buttonFahrenheit);
		tela.getContentPane().add(lblResultado);
		tela.getContentPane().add(lblMensagemErro);
		tela.getContentPane().add(buttonLimpar);

		buttonFahrenheit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				try {
					
					String respostaUsuario = txtCelsius.getText();
					double celsius = Double.parseDouble(respostaUsuario);
					txtCelsius.setText("");

					Temperatura temperatura = new Temperatura();
					temperatura.setCelsius(celsius);
					double resultado = temperatura.converterParaFahrenheit();

					lblResultado.setText(resultado + " F°");
					

				} catch (NumberFormatException erro) {
					
					txtCelsius.setText("");
					lblMensagemErro.setText("O valor digitado é inválido");

				}
			}
		});

		buttonKelvin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					String respostaUsuario = txtCelsius.getText();
					double celsius = Double.parseDouble(respostaUsuario);
					txtCelsius.setText("");

					Temperatura temperatura = new Temperatura();
					temperatura.setCelsius(celsius);
					double resultado = temperatura.converterParaKelvin();

					lblResultado.setText(resultado + " K°");
					
					
				} catch (NumberFormatException erro) {
					
					txtCelsius.setText("");
					lblMensagemErro.setText("O valor digitado é inválido");

				}

			}
		});
		
		buttonLimpar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				txtCelsius.setText("");
				lblMensagemErro.setText("");
				lblResultado.setText("");
			}
		});

		tela.setVisible(true);
	}

}
