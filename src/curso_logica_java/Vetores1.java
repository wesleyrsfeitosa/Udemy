package curso_logica_java;

import java.util.Scanner;

public class Vetores1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);

		int n;
		System.out.println("Digite o valor do vetor: ");
		n = teclado.nextInt();
		double[] vet = new double[n];
		
		for(int i=0; i<n; i++) {
			System.out.println("Digite o valor da posição " + i);
			vet[i] = teclado.nextDouble();
			
		}
		
		for(int i=0; i<n; i++) {
			System.out.printf("%.2f\n", vet[i]);
		}
		
		teclado.close();
	}

}
