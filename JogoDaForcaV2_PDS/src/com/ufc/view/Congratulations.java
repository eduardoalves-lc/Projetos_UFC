package com.ufc.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Congratulations {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Congratulations window = new Congratulations();
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
	public Congratulations() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 247);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblParabnsVocGanhou = new JLabel("Parab\u00E9ns, voc\u00EA ganhou !!!");
		lblParabnsVocGanhou.setBounds(152, 23, 167, 14);
		frame.getContentPane().add(lblParabnsVocGanhou);
		
		JLabel lblPalavra = new JLabel("A palavra \u00E9 ::");
		lblPalavra.setBounds(44, 72, 95, 14);
		frame.getContentPane().add(lblPalavra);
		
		JButton btnNovoJogo = new JButton("Novo Jogo");
		btnNovoJogo.setBounds(29, 173, 110, 23);
		frame.getContentPane().add(btnNovoJogo);
		
		JButton btnEncerrarJogo = new JButton("Encerrar Jogo");
		btnEncerrarJogo.setBounds(152, 173, 118, 23);
		frame.getContentPane().add(btnEncerrarJogo);
		
		JButton btnVoltarAoMenu = new JButton("Voltar ao Menu");
		btnVoltarAoMenu.setBounds(280, 173, 131, 23);
		frame.getContentPane().add(btnVoltarAoMenu);
	}

}
