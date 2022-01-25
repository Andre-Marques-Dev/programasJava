package java;

import java.util.Scanner;

public class Maiornumero {

	public static void main(String[] args) {
		// Variáveis
		int n, maior = 0;
		Scanner teclado = new Scanner(System.in);
		
		//Entradas	
		System.out.println("Informe um número: ");
		n = teclado.nextInt();
		
		//Processamento
		while(n != 0) {
			if(n > maior) {
				maior = n;
		}
		System.out.println("Informe um número: ");
		n = teclado.nextInt();
	}
	System.out.printf("O maior número é %d", maior);
    teclado.close();
}
	
}
