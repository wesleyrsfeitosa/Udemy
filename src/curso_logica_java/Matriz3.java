package curso_logica_java;

import java.util.Scanner;

public class Matriz3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int n = teclado.nextInt();
		int[][] matriz = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matriz[i][j] = teclado.nextInt();
			}
		}
		System.out.println("DIAGONAL PRINCIPAL:");
		for (int i = 0; i < n; i++) {
			System.out.println(matriz[i][i] + " ");
		}
		System.out.println();

		int cont = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (matriz[i][j] < 0) {
					cont++;
				}

			}
		}
		
		System.out.println("QUANTIDADE DE NEGATIVOS = " + cont);

		teclado.close();
	}
}