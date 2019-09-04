package com.ufc.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

public class GameOver {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameOver window = new GameOver();
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
	public GameOver() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 132);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblVocNoAcertou = new JLabel("Voc\u00EA n\u00E3o acertou !!!");
		lblVocNoAcertou.setBounds(160, 11, 117, 14);
		frame.getContentPane().add(lblVocNoAcertou);
		
		JButton btnTentarNovamente = new JButton("Tentar Novamente");
		btnTentarNovamente.setBounds(10, 60, 142, 23);
		frame.getContentPane().add(btnTentarNovamente);
		
		JButton btnVoltarAoMenu = new JButton("Voltar ao Menu");
		btnVoltarAoMenu.setBounds(160, 60, 129, 23);
		frame.getContentPane().add(btnVoltarAoMenu);
		
		JButton btnEncerrarJogo = new JButton("Encerrar Jogo");
		btnEncerrarJogo.setBounds(299, 60, 125, 23);
		frame.getContentPane().add(btnEncerrarJogo);
	}

}
