package java;

import java.util.Scanner;

public class Maiornumero {

	public static void main(String[] args) {
		// Vari�veis
		int n, maior = 0;
		Scanner teclado = new Scanner(System.in);
		
		//Entradas	
		System.out.println("Informe um n�mero: ");
		n = teclado.nextInt();
		
		//Processamento
		while(n != 0) {
			if(n > maior) {
				maior = n;
		}
		System.out.println("Informe um n�mero: ");
		n = teclado.nextInt();
	}
	System.out.printf("O maior n�mero � %d", maior);
    teclado.close();
}
	
}
