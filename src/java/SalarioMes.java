package java;

import java.util.Scanner;

public class SalarioMes {

	public static void main(String[] args) {
		// Vari�veis
		float valor_por_hora, salario;
		int horas_trabalhadas;
		Scanner teclado = new Scanner(System.in);
		
		//Entradas
        System.out.println("Quanto voc� ganha por hora? ");
        valor_por_hora = teclado.nextFloat();
		
        System.out.println("Quantas horas voc� trabalhou neste m�s? ");
        horas_trabalhadas = teclado.nextInt();
        
        //Processamento
        salario = (horas_trabalhadas * valor_por_hora);
        
        //Sa�da
        System.out.println("Neste m�s voc� vai receber R$ " + salario);
        
        teclado.close();
	}

}
