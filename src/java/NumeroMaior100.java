package java;

import java.util.Scanner;

public class NumeroMaior100 {

	public static void main(String[] args) {
		// Vari�veis
		int n;
		Scanner teclado = new Scanner(System.in);
		
		//Entradas
		System.out.println("Informe um n�mero: ");
		n = teclado.nextInt();
		
		//Processamento
		if(n > 100) {
			System.out.println(n);
		}else {
			n = 0;
			System.out.println(n);
		}
		teclado.close();
	}

}
