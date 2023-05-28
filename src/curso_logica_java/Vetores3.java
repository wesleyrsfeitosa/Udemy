package curso_logica_java;

import java.util.Scanner;

public class Vetores3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite o tamanho do vetor: ");
		int n = teclado.nextInt();
		double soma = 0, media;
		double[] vet = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Digite a " + i + "ª nota");
			vet[i] = teclado.nextDouble();

		}

		for (int i = 0; i < n; i++) {
			System.out.println("nota na posição " + i + " é " + vet[i]);
		}

		for (int i = 0; i < n; i++)
			soma += vet[i];
			media = soma / n;
		System.out.println("A media é " + media);
		System.out.println("A soma é " + soma);

		teclado.close();
	}
}
