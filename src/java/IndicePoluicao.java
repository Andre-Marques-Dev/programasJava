package java;

import java.util.Scanner;

public class Indicepoluicao {

	public static void main(String[] args) {
		// Vari�veis
		float indice;
		Scanner teclado = new Scanner(System.in);
		
		//Entradas
		System.out.println("Informe o �ndice de polui��o: ");
		indice = teclado.nextFloat();
		
		//Processamento
		if(indice >= 0.3 && indice < 0.4) {
			System.out.println("Aten�ao: Ind�strias do 1� grupo devem suspender as atividades.");
		}else if(indice >= 0.4 && indice < 0.5) {
			System.out.println("Aten��o: Ind�strias do 1� e 2� grupo devem suspender as atividades.");
		}else if(indice >= 0.5) {
			System.out.println("Aten��o: Todos os grupos devem suspender as atividades.");
		}
		teclado.close();
	}
}
