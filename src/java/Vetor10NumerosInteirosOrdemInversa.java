package java;

import java.util.Scanner;

public class Vetor10NumerosInteirosOrdemInversa {
	
	public static void main(String[] args) {
		//Variáveis
		int[] vetor = new int[10];
		Scanner teclado = new Scanner(System.in);
		
		//Entradas
		for (int i = 0; i < 10; i++) {
			System.out.println("Informe o valor para o vetor: ");
			vetor[i] = teclado.nextInt();
			
		}
		for (int i = (vetor.length -1); i >= 0; i--) {
			System.out.println(vetor[i]);
		}
		teclado.close();
	}

}
