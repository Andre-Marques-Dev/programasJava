package java;

import java.util.Scanner;

public class MultaExcessoPeixes {

	public static void main(String[] args) {
		// Vari�veis
		float p, m;
		String e = "excesso";
		Scanner teclado = new Scanner(System.in);
		
		//Entradas
		System.out.println("Informe o peso dos peixes: ");
		p = teclado.nextFloat();
		
		//Processamento
		if(p > 50) {
			m = (float)(p - 50) * (float)4.00;
			//Sa�da
			System.out.printf("Voc� dever� pagar R$ %.2f em multas.", m);
		}else {
			m = 0;
			e = "0";
			//Sa�da
			System.out.println("Multas: " + m);
			System.out.println("Excesso: " + e);
		}
		teclado.close();

	}

}
