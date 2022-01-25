package java;

import java.util.Scanner;

public class UsuarioSenha {

	public static void main(String[] args) {
		// Variáveis
		String nome, senha;
		Scanner teclado = new Scanner(System.in);
		
		//Entrada
		System.out.println("Informe o nome: ");
		nome = teclado.next();
		
		System.out.println("Informe a senha: ");
		senha = teclado.next();
		
		//Processamento
		while(nome.equals(senha)) {
			System.out.println("Erro: O nome de usuário e senha devem ser diferentes.");
			
			//Entrada
			System.out.println("Informe o nome: ");
			nome = teclado.next();
			
			System.out.println("Informe a senha: ");
			senha = teclado.next();
		}
		teclado.close();
	}
}
