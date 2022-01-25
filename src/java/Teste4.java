package java;

import java.util.Scanner;

public class Teste4 {
	public static void main(String[] args) {
		float num1, num2, media;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		num1 = teclado.nextInt();
		
		System.out.println("Informe outro número: ");
		num2 = teclado.nextInt();
		
		media = (num1 + num2) / 2;
		
		System.out.printf("A média é %f\n:", media);
		
		teclado.close();
		
	}

}
