package com.ufc.service;

import java.sql.SQLException;
import java.text.Normalizer;
import java.util.Scanner;

import com.ufc.view.InterfaceMain;

public class ForcaSERVICE {

	public void Forca(String Palavra, int numT) {
		
		String Palav[] = Palavra.split("|");
		String Pal = removeAccents(Palavra);
		String Pala[] = Pal.split("|");
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		String traco[] = new String[Palavra.length()];
		for (int i = 0; i < Palavra.length(); i++) {
			traco[i] = "_";
		}

		int PalavraString = Palavra.length();
		
		while (PalavraString > 0 && numT > 0) {

			System.out.println();
			for (int i = 0; i < Palavra.length(); i++) {
				System.out.print(" " + traco[i] + " ");
			}
			System.out.println();

			System.out.println("Você tem " + numT + " chances de adivinhar");
			System.out.println("A palavra tem " + PalavraString + " letras restantes");
			System.out.println("Digite uma letra: ");

			String letra = teclado.next();
			encerrarForca(letra);
			letra = removeAccents(letra);

			boolean iscorrect = false;
			for (int i = 0; i < traco.length; i++) {

				if ((letra.toLowerCase().contains(Pala[i]))) {
					traco[i] = Palav[i];
					PalavraString--;
					iscorrect = true;
				}
				if ((letra.toUpperCase().contains(Pala[i]))) {
					traco[i] = Palav[i];
					PalavraString--;
					iscorrect = true;
				}
			}

			if (!iscorrect) {
				numT--;
			}
		}

		if (PalavraString == 0) {
			System.out.println("\n" + Palavra);
			System.out.println("PARABENS! Você ACERTOU! :)");

		} else {
			System.out.println("Infelizmente Você Perdeu :(");
			System.out.println("A palavra era " + Palavra);
		}
	}

	public static String removeAccents(String str) {
		str = Normalizer.normalize(str, Normalizer.Form.NFD);
		str = str.replaceAll("[^\\p{ASCII}]", "");
		return str;
	}
	
	public void encerrarForca(String letra) {
		if (letra.equals("0")) {
			
			InterfaceMain mainScreen = new InterfaceMain();
			try {
				mainScreen.start();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else return;
		
	}
}


//Código Backup

//package com.ufc.service;
//
//import java.text.Normalizer;
//import java.util.Scanner;
//
//public class ForcaSERVICE {
//
//	public void Forca(String Palavra, int numT) {		
//
//		@SuppressWarnings("resource")
//		Scanner teclado = new Scanner(System.in);
//
//		char[] traco = new char[Palavra.length()];
//		for (int i = 0; i < Palavra.length(); i++) {
//			traco[i] = '_';
//		}
//
//		int PalavraString = Palavra.length();
//		
//		if (numT == 0) {
//			numT = 6;
//		}
//
//		while (PalavraString > 0 && numT > 0) {
//			
//			System.out.println();
//			for (int i = 0; i < Palavra.length(); i++) {
//				traco[0]=Character.toUpperCase(traco[0]);
//				System.out.print(" " + traco[i] + " ");
//			}
//			System.out.println();
//
//			System.out.println("Você tem " + numT + " chances de adivinhar");
//			System.out.println("A palavra tem " + PalavraString + " letras restantes");
//			System.out.println("Digite uma letra: ");
//
//			teclado.nextLine();
//			char letras = teclado.next().charAt(0);
//
//			letras = Character.toLowerCase(letras);
//			char letrasM = Character.toUpperCase(letras);
//			
//			boolean iscorrect = false;
//			for (int i = 0; i < traco.length; i++) {
//
//				if ((Palavra.charAt(i) == letras) || Palavra.charAt(i) == letrasM) {
//					traco[i] = letras;
//					PalavraString--;
//					iscorrect = true;
//				}
//			}
//
//			if (!iscorrect) {
//				numT--;
//			}
//		}
//
//		if (PalavraString == 0) {
//			System.out.println("\n" + Palavra);
//			System.out.println("PARABENS! Você ACERTOU! :)");
//
//		} else {
//			System.out.println("Infelizmente Você Perdeu :(");
//			System.out.println("A palavra era " + Palavra);
//		}
//	}
//	
//	public static String removeAccents(String str) {
//	    str = Normalizer.normalize(str, Normalizer.Form.NFD);
//	    str = str.replaceAll("[^\\p{ASCII}]", "");
//	    return str;
//	}
//}
