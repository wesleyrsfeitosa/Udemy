package curso_logica_java;

import java.util.Scanner;

public class Vetores4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite o tamanho do vetor: ");
		int n = teclado.nextInt();

		String[] nome = new String[n];
		int[] idade = new int[n];
		double[] altura = new double[n];
		double soma = 0;
		int cont = 0;

		for (int i = 0; i < n; i++) {
			System.out.println("digite o nome: ");
			nome[i] = teclado.next();
			System.out.println("digite a idade: ");
			idade[i] = teclado.nextInt();
			System.out.println("digite a altura:");
			altura[i] = teclado.nextDouble();

			soma += altura[i];
		}

		for (int i = 0; i < n; i++) {
			System.out.printf("\nNome: %s, Idade: %d anos, Altura: %.2f", nome[i], idade[i], altura[i]);
		}

		double media = soma / n;
		System.out.printf("\nAltura média: %.2f", media);

		for (int i = 0; i < n; i++) {
			if (idade[i] < 16) {
				cont += 1;
			}
		}
			double x = (double) cont *100 / n;
			System.out.printf("Pessoas com menos de 16 anos %.1f%% %n", x);

		

		teclado.close();
	}

}
