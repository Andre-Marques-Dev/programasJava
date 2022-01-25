package java;

import java.util.Scanner;

public class Soma02Numeros {

	public static void main(String[] args) {
		//Variáveis
		int num1, num2, soma;
		Scanner teclado = new Scanner(System.in);
		
		//Entradas
		System.out.println("Informe o primeiro número: ");
		num1 = teclado.nextInt();
		
		System.out.println("Informe o segundo número: ");
		num2 = teclado.nextInt();
		
		//Processamento
		soma = (num1 + num2);
		
		//Saída
		System.out.println("O resultado da soma é: " + soma);
		
		teclado.close();
	}

}
