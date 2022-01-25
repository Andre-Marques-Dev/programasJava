package java;

import java.util.Scanner;

public class NumeroPositivoNegativo {

	public static void main(String[] args) {
		// Variáveis
		int numero, a, b;
		Scanner teclado = new Scanner(System.in);
		
		//Entradas
		System.out.println("Informe um número: ");
		numero = teclado.nextInt();
		
		//Processamento
		if(numero > 0) {
			a = numero;
			//Saída
			System.out.println(a);
		}else {
			b = numero;
			//Saída
			System.out.println(b);
		}
		
		teclado.close();
	}

}
