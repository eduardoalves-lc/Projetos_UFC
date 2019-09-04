package com.ufc.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class TelaJogo {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaJogo window = new TelaJogo();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaJogo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(26, 169, 96, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblDigiteUmaLetra = new JLabel("Digite uma letra");
		lblDigiteUmaLetra.setBounds(26, 148, 141, 14);
		frame.getContentPane().add(lblDigiteUmaLetra);
		
		JButton btnVerificar = new JButton("Verificar");
		btnVerificar.setBounds(133, 168, 96, 23);
		frame.getContentPane().add(btnVerificar);
		
		JButton btnEncerrarJogo = new JButton("Encerrar Jogo");
		btnEncerrarJogo.setBounds(301, 227, 123, 23);
		frame.getContentPane().add(btnEncerrarJogo);
		
		JButton btnNovoJogo = new JButton("Novo Jogo");
		btnNovoJogo.setBounds(173, 227, 109, 23);
		frame.getContentPane().add(btnNovoJogo);
		
		JButton btnVoltarAoMenu = new JButton("Voltar ao Menu");
		btnVoltarAoMenu.setBounds(26, 227, 130, 23);
		frame.getContentPane().add(btnVoltarAoMenu);
		
		JLabel lblPalavra = new JLabel("Palavra");
		lblPalavra.setBounds(175, 11, 96, 14);
		frame.getContentPane().add(lblPalavra);
		
		JLabel lblTentativasDisponiveis = new JLabel("Tentativas Disponiveis");
		lblTentativasDisponiveis.setBounds(294, 110, 130, 14);
		frame.getContentPane().add(lblTentativasDisponiveis);
		
		JLabel lblNErros = new JLabel("N\u00BA Erros");
		lblNErros.setBounds(335, 161, 63, 14);
		frame.getContentPane().add(lblNErros);
	}
}
