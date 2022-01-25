package java;

import java.util.ArrayList;

public class Teste {
	
	public static void main(String[] args) {
		int [] numeros_impares = {1,3,5};
		String [] pais = { "Brasil", "Argentina", "Canadá", "Chile"};
		int[] numeros_pares = new int[5];
		numeros_pares [0] = 2; 
		numeros_pares [1] = 4;
		numeros_pares [2] = 6;
		numeros_pares [3] = 8;
		numeros_pares [4] = 10;
		System.out.println(numeros_pares.length);
		System.out.println(numeros_impares[2]);
		System.out.println(numeros_pares[3]);
		System.out.println(pais[2]);
		System.out.println(numeros_pares[4]);
		System.out.println("----------------------");
		
	    
		ArrayList<Integer>n_impares = new ArrayList<>();
		n_impares.add(1);
		n_impares.add(3);
		n_impares.add(5);
		System.out.println(n_impares.isEmpty());
		System.out.println(n_impares.size());
		System.out.println(n_impares.contains(6));

}
}