package curso_logica_java;

import java.util.Scanner;

public class Estrutura_While_Enquanto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int x, soma = 0;

		System.out.print("Entre com um numero: ");
		x = teclado.nextInt();

		while (x != 0) {
			soma += x;
			System.out.print("Entre com outro numero: ");
			x = teclado.nextInt();
		}
		System.out.print("A Soma dos valores digitados foi: " + soma);

		teclado.close();
	}

}
