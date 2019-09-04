package com.ufc.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SelectCateg {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SelectCateg window = new SelectCateg();
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
	public SelectCateg() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 341, 245);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblSelecioneUmaCategoria = new JLabel("Selecione uma categoria");
		lblSelecioneUmaCategoria.setBounds(89, 11, 179, 14);
		frame.getContentPane().add(lblSelecioneUmaCategoria);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(78, 36, 159, 22);
		frame.getContentPane().add(comboBox);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				
			}
		});
		btnConfirmar.setBounds(104, 138, 114, 23);
		frame.getContentPane().add(btnConfirmar);
		
		JButton btnEncerrarJogo = new JButton("Encerrar Jogo");
		btnEncerrarJogo.setBounds(189, 172, 126, 23);
		frame.getContentPane().add(btnEncerrarJogo);
		
		JLabel lblDigiteONmero = new JLabel("Digite o n\u00FAmero maximo de tentativas");
		lblDigiteONmero.setBounds(64, 76, 211, 14);
		frame.getContentPane().add(lblDigiteONmero);
		
		textField = new JTextField();
		textField.setBounds(123, 101, 67, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnVoltarAoMenu = new JButton("Voltar ao Menu");
		btnVoltarAoMenu.setBounds(23, 172, 134, 23);
		frame.getContentPane().add(btnVoltarAoMenu);
	}
}
