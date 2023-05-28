package curso_logica_java;

import java.util.Scanner;

public class Vetores2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
				
		System.out.println("Digite o tamanho do vetor: ");
		int n = teclado.nextInt();
		
		double[] vet = new double[n];
		
		for(int i=0; i<n; i++) {
			System.out.println("Digite o valor do na posição " + i);
			vet[i] = teclado.nextDouble();
		}
		
		for(int i=0; i<n; i++) {
			if(vet[i] < 0)
			System.out.println("o valor do vetor na posição " + i + " é " + vet[i]);
		}
		
		teclado.close();
		
	}

}
