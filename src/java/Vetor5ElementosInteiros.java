package java;

import java.util.ArrayList;

public class Vetor5ElementosInteiros {

	public static void main(String[] args) {
		// variáveis
		ArrayList<Integer> vetor = new ArrayList<Integer>();
		ArrayList<Integer> pares = new ArrayList<Integer>();
		
		for (int i = 0; i < 5; i++) {
			vetor.add(i);
			if(i % 2 == 0) {
				if(i > 0) {
				    pares.add(i);
				}
			}
			
		}
		
		for(Integer n : pares) {
			System.out.println(n);
		}

	}

}
