package java;

import java.util.Scanner;

public class NumeroPositivoNegativo {

	public static void main(String[] args) {
		// Vari�veis
		int numero, a, b;
		Scanner teclado = new Scanner(System.in);
		
		//Entradas
		System.out.println("Informe um n�mero: ");
		numero = teclado.nextInt();
		
		//Processamento
		if(numero > 0) {
			a = numero;
			//Sa�da
			System.out.println(a);
		}else {
			b = numero;
			//Sa�da
			System.out.println(b);
		}
		
		teclado.close();
	}

}
