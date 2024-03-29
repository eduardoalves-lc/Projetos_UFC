package com.ufc.view;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.ufc.controller.PalavraController;
import com.ufc.entity.Palavra;
import com.ufc.controller.CategoriaController;
import com.ufc.controller.ForcaController;

public class InterfaceMain {

	Scanner scanner = new Scanner(System.in);
	List<Palavra> lista = new ArrayList<Palavra>();

	PalavraController PalavraC = new PalavraController();
	CategoriaController CategoriaC = new CategoriaController();
	ForcaController ForcaC = new ForcaController();

	public void start() throws SQLException {
		boolean loop = true;
		while (loop) {
			System.out.println("___________________________________________________________\n");
			System.out.println("                     JOGO DA FORCA                           ");
			System.out.println(" Digite 1 para iniciar nova jogada.                        \n");
			System.out.println(" Digite 2 para encerrar o jogo.                            \n");
			System.out.println("___________________________________________________________\n");

			String option = scanner.nextLine();
			if (option.matches("^[0-1]{1}")) {
				int n = Integer.parseInt(option);
				if (n < 1 || n > 2) {
					System.out.println("Op��o invalida, digite um das op��es listadas!");
				} else {
					switch (n) {
					case 1:
						Forca();
						System.out.println("Jogo Encerrado!");
						loop = false;
						break;
					case 2:
						System.out.println("Jogo Encerrado!");
						loop = false;
						break;
					}

				}
			} else {
				System.out.println("Somente digite numeros inteiros! Tente novamente...");
			}
		}
	}

	private void Forca() throws SQLException {
		System.out.println("Por favor, digite o ID da categoria\n");
		System.out.println("1 - Continentes \n");
		System.out.println("2 - Ilhas \n");
		System.out.println("3 - Paises \n");
		System.out.println("4 - Estados \n");
		System.out.println("5 - Cidades \n");
		System.out.println("\n");
		System.out.println("\n");
		System.out.println("Para retornar ao menu principal digite: 0 \n");
		System.out.println("0 - Retornar ao Menu Principal \n");

		String ID_c = scanner.nextLine();
		if (ID_c.equals("")) {
			System.out.println("ID em branco!\n");
			return;
		} if (ID_c.equals("0")) {
			start();
		}
		
		String numTentativas = Tentativas();
		
		
		int numT = Integer.parseInt(numTentativas);
		int id_cat = Integer.parseInt(ID_c);
		lista = PalavraC.ListaPalavras(id_cat);
		ForcaC.ForcaC(PalavraC.SortearPalavra(lista), numT);
	}
	
	public String Tentativas () {
		String numTentativas = null;
		
		while (numTentativas == null) {
			System.out.println("Por favor, digite o maximo de tentativas\n");
			numTentativas = scanner.nextLine();
			if (numTentativas.equals("")) {
				System.out.println("N�mero de tentativas em branco!\n");
				return Tentativas();
			} if (numTentativas.equals("0")) {
				InterfaceMain mainScreen = new InterfaceMain();
				try {
					mainScreen.start();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return numTentativas;
	}
}
