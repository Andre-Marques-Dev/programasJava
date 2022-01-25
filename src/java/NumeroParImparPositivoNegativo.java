package java;

import java.util.Scanner;

public class NumeroParImparPositivoNegativo {

	public static void main(String[] args) {
		// Variáveis
		int numero;
		Scanner teclado = new Scanner(System.in);
		
		//Entradas
		System.out.println("Informe um número: ");
		numero = teclado.nextInt();
		
		//Processamento
		if(numero % 2 == 0) {
			if(numero > 0) {
				System.out.printf("O número %d é par e positivo\n", numero);
			}else {
				System.out.printf("O número %d é par e negativo\n", numero);
			}
		}else {
			if(numero < 0) {
					System.out.printf("O número %d é ímpar e positivo\n", numero);
			}else {
					System.out.printf("O número %d é ímpar e negativo\n", numero);
			}
		}
		teclado.close();

	}

}
