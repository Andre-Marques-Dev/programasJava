package java;

import java.util.Scanner;

public class VetoresSuperiores50 {

	public static void main(String[] args) {
		// Variáveis
		int[] vetor = new int[10];
		boolean tem_maior_50 = false;
		Scanner teclado = new Scanner(System.in);
		
		//Entradas/Processamento
		for (int i = 0; i < 10; i++) {
			System.out.printf("Informe o valor para o vetor %d/10\n", (i + 1));
			vetor[i] = teclado.nextInt();
		}
		for (int i = 0; i < 10; i++) {
			if(vetor[i] > 50) {
				System.out.printf("O número %d está na posição %d\n", vetor[i], i);
				tem_maior_50 = true;
			}
		}
		if(!tem_maior_50) {
			System.out.println("Não existe nenhum número maior que 50");
		}
		teclado.close();

	}

}
