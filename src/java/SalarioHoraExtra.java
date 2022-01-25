package java;

import java.util.Scanner;

public class SalarioHoraExtra {

	public static void main(String[] args) {
		// Vari�veis
		int c;
		float n, e = 0, salario, valor_hora = (float)10.00;
		Scanner teclado = new Scanner(System.in);
		
		//Entradas
		System.out.println("Informe o c�digo: ");
		c = teclado.nextInt();
		
		System.out.println("Informe a quantidade de horas trabalhadas: ");
		n = teclado.nextFloat();
		
		//Processamento
		if(n > 50) {
			e = (float)(n - 50) * (float)20.00;
			salario = (50 * valor_hora) + e;
			System.out.printf("Sal�rio total � R$ %.2f\n", salario);
			System.out.printf("Sal�rio excedente � R$ %.2f\n", e);
		}else {
			salario = n * valor_hora;
			System.out.printf("Sal�rio total � R$ %.2f\n", salario);
			System.out.printf("Sal�rio excedente � R$ %.2f\n", e);
		}
		teclado.close();
	}

}
