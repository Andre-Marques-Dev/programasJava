package java;

import java.util.Scanner;

public class MetrosCentimetros {

	public static void main(String[] args) {
		// Vari�veis
		int metros, centimetros;
		Scanner teclado = new Scanner(System.in);
		
		//Entradas
		System.out.println("Informe o valor em metros: ");
		metros = teclado.nextInt();
		
		//Processamento
		centimetros = (metros * 100);
		
		//Sa�da
		System.out.println(metros + " metros em cent�metros �: " + centimetros);
		
		teclado.close();
	}

}
