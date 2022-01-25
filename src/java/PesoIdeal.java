package java;

import java.util.Scanner;

public class PesoIdeal {

	public static void main(String[] args) {
		//Vari�veis
		float altura, peso_ideal;
		char sexo;
		Scanner teclado = new Scanner(System.in);
		
		//Entradas
		System.out.println("Informe sua altura: ");
		altura = teclado.nextFloat();
			
		System.out.println("Informe o sexo m/f: ");
		sexo = teclado.next().charAt(0);
		
		
		//Processamento
		if(sexo == 'm') {
			peso_ideal = (float)(72.7 * altura) - 58;
			System.out.printf("Seu peso ideal � %.2f: ", peso_ideal);
		}
		if(sexo == 'f') {
			peso_ideal = (float)(62.1 * altura) - (float)44.7;
			System.out.printf("Seu peso ideal � %.2f: ", peso_ideal);
		}
        if(sexo != 'm' && sexo != 'f') {
        	System.out.println("Sexo n�o reconhecido.");
        	peso_ideal = 0;
        }
        teclado.close();
	}

}
