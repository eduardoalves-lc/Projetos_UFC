package com.ufc.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Principal {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
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
	public Principal() {
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
		
		JLabel lblJogoDaForca = new JLabel("Jogo da Forca");
		lblJogoDaForca.setBounds(178, 28, 110, 14);
		frame.getContentPane().add(lblJogoDaForca);
		
		JButton btnIniciarJogo = new JButton("Iniciar Jogo");
		btnIniciarJogo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				//INICIAR JOGO
				InterfaceMain mainScreen = new InterfaceMain();
				try {
					mainScreen.start();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnIniciarJogo.setBounds(157, 62, 110, 23);
		frame.getContentPane().add(btnIniciarJogo);
		
		JButton btnEncerrarJogo = new JButton("Encerrar Jogo");
		btnEncerrarJogo.setBounds(283, 227, 141, 23);
		frame.getContentPane().add(btnEncerrarJogo);
		
		JButton btnCategorias = new JButton("Categorias");
		btnCategorias.setBounds(22, 148, 102, 23);
		frame.getContentPane().add(btnCategorias);
		
		JButton btnPalavras = new JButton("Palavras");
		btnPalavras.setBounds(134, 148, 109, 23);
		frame.getContentPane().add(btnPalavras);
		
		JLabel lblCadastrarNova = new JLabel("Cadastrar Novas");
		lblCadastrarNova.setBounds(22, 121, 201, 14);
		frame.getContentPane().add(lblCadastrarNova);
		
		JLabel lblMenu = new JLabel("MENU");
		lblMenu.setBounds(195, 11, 48, 14);
		frame.getContentPane().add(lblMenu);
	}
}
