package java;

import java.util.Scanner;

public class Indicepoluicao {

	public static void main(String[] args) {
		// Variáveis
		float indice;
		Scanner teclado = new Scanner(System.in);
		
		//Entradas
		System.out.println("Informe o índice de poluição: ");
		indice = teclado.nextFloat();
		
		//Processamento
		if(indice >= 0.3 && indice < 0.4) {
			System.out.println("Atençao: Indústrias do 1° grupo devem suspender as atividades.");
		}else if(indice >= 0.4 && indice < 0.5) {
			System.out.println("Atenção: Indústrias do 1° e 2° grupo devem suspender as atividades.");
		}else if(indice >= 0.5) {
			System.out.println("Atenção: Todos os grupos devem suspender as atividades.");
		}
		teclado.close();
	}
}
