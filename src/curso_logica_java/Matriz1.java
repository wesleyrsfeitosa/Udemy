package curso_logica_java;

import java.util.Scanner;

public class Matriz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		System.out.println("Entre com um numero M: ");
		int m = teclado.nextInt();
		System.out.println("Entre com um numero N: ");
		int n = teclado.nextInt();

		int[][] matriz = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println("Digite o valor ");
				matriz[i][j] = teclado.nextInt();

				//System.out.println("Digite o valor de n: ");
				//matriz[j] = teclado.nextInt();

			}
		}

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {

				System.out.printf(matriz[i][j] + " ");
			}
		
		System.out.println();

		}

		teclado.close();
	}

}
