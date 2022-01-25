package java;

import java.util.Scanner;

public class Teste3 {
	
	public static void main(String[] args) {
		int numero;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		numero = teclado.nextInt();
		
		if(numero >= 0) {
			System.out.println("Numero positivo");
		}else {
			System.out.println("Numero negativo");
		}
		teclado.close();
	}

}
