package java;

import java.util.Scanner;

public class Somar02NumerosMultiplicar {

	public static void main(String[] args) {
		// Variáveis
		int num1, num2, soma, multiplicacao;
		Scanner teclado = new Scanner(System.in);
		
		//Entradas
		System.out.println("Informe o primeiro número: ");
		num1 = teclado.nextInt();
		
		System.out.println("Informe o segundo número: ");
		num2 = teclado.nextInt();
		
		//Processamento
		soma = num1 + num2;
		multiplicacao = soma * num1;
		
		//Saída
		System.out.println("O resultado da mulplicação é: " + multiplicacao);
		
		teclado.close();
		
	}

}