package java;

import java.util.Scanner;

public class NumeroParImpar {

	public static void main(String[] args) {
		// Variáveis
		int numero, p = 0, i = 0;
		Scanner teclado = new Scanner(System.in);
		
		//Entrada
		System.out.println("Informe um número: ");
		numero = teclado.nextInt();
		
		//Processamento
		if(numero % 2 == 0) {
			p = numero;
		}else {
			i = numero;
		}
		System.out.println(p);
		System.out.println(i);
		
		teclado.close();
	}

}
