package curso_logica_java;

import java.util.Arrays;
import java.util.Scanner;

public class Vetores11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double v[] = { 3.5, 2.75, 9, -4.5 };
		Arrays.sort(v);// essa classe coloca os vetores em ordem crescente.
		for (double valor : v) {
			System.out.println(valor + " ");
		}

		teclado.close();
	}

}
