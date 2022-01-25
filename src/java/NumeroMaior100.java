package java;

import java.util.Scanner;

public class NumeroMaior100 {

	public static void main(String[] args) {
		// Variáveis
		int n;
		Scanner teclado = new Scanner(System.in);
		
		//Entradas
		System.out.println("Informe um número: ");
		n = teclado.nextInt();
		
		//Processamento
		if(n > 100) {
			System.out.println(n);
		}else {
			n = 0;
			System.out.println(n);
		}
		teclado.close();
	}

}
