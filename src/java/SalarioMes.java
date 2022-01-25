package java;

import java.util.Scanner;

public class SalarioMes {

	public static void main(String[] args) {
		// Variáveis
		float valor_por_hora, salario;
		int horas_trabalhadas;
		Scanner teclado = new Scanner(System.in);
		
		//Entradas
        System.out.println("Quanto você ganha por hora? ");
        valor_por_hora = teclado.nextFloat();
		
        System.out.println("Quantas horas você trabalhou neste mês? ");
        horas_trabalhadas = teclado.nextInt();
        
        //Processamento
        salario = (horas_trabalhadas * valor_por_hora);
        
        //Saída
        System.out.println("Neste mês você vai receber R$ " + salario);
        
        teclado.close();
	}

}
