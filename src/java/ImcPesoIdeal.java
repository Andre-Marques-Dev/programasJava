package java;

import java.util.Scanner;

public class ImcPesoIdeal {

	public static void main(String[] args) {
		// Vari�veis
		float altura, peso_ideal;
		Scanner teclado = new Scanner(System.in);
		
		//Entradas
		System.out.println("Qual a sua altura? ");
		altura = teclado.nextFloat();
		
		//Processamento
		peso_ideal = (float)(altura * 72.7) - 58; 
		
		//Sa�da
		System.out.println("Seu peso ideal seria: " + peso_ideal);
		
		teclado.close();
	}

}
