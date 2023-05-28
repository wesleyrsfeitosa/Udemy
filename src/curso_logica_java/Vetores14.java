package curso_logica_java;

import java.util.Arrays;

public class Vetores14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n[] = { 3, 2, 8, 7, 5, 4 };
		Arrays.sort(n);
		System.out.println("Total de casas de n = " + n.length);

		for (int valor : n) {
			System.out.print(valor + " ");
		}

	}
}
