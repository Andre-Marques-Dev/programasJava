package java;

import java.util.Scanner;

public class NumeroParImparPositivoNegativo {

	public static void main(String[] args) {
		// Vari�veis
		int numero;
		Scanner teclado = new Scanner(System.in);
		
		//Entradas
		System.out.println("Informe um n�mero: ");
		numero = teclado.nextInt();
		
		//Processamento
		if(numero % 2 == 0) {
			if(numero > 0) {
				System.out.printf("O n�mero %d � par e positivo\n", numero);
			}else {
				System.out.printf("O n�mero %d � par e negativo\n", numero);
			}
		}else {
			if(numero < 0) {
					System.out.printf("O n�mero %d � �mpar e positivo\n", numero);
			}else {
					System.out.printf("O n�mero %d � �mpar e negativo\n", numero);
			}
		}
		teclado.close();

	}

}
