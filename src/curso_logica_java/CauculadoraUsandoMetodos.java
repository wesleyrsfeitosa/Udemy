package curso_logica_java;

import java.util.Scanner;

public class CauculadoraUsandoMetodos {

	/* METODOS */
	public static double Soma(double valor1, double valor2) {
		double resultado;
		resultado = valor1 + valor2;
		System.out.println(resultado);
		return 0;
	}

	public static double Subtracao(double valor1, double valor2) {
		double resultado;
		resultado = valor1 - valor2;
		System.out.println(resultado);
		return 0;
	}

	public static double Multiplicao(double valor1, double valor2) {
		double resultado;
		resultado = valor1 * valor2;
		System.out.println(resultado);
		return 0;
	}

	public static double divisao(double valor1, double valor2) {
		double resultado;
		resultado = valor1 / valor2;
		System.out.println(resultado);
		return 0;
	}
	/* FIM METODOS */

	public static void main(String[] args) {
		/* OBJETOS E VARIAVEIS */
		double valor1, valor2;
		char sinal, sair;
		boolean continuar = true;

		Scanner teclado = new Scanner(System.in);

		/* RECEBENDO DADOS DO USER */
		do {
			System.out.println("\n----CALCULADORA SIMPLES----");
			System.out.println("\n\nDeseja continuar? [s/n]");
			sair = teclado.next().charAt(0);

			if (sair == 'n' || sair == 'N') {
				continuar = false;
			} else if (sair == 's' || sair == 'S') {

				System.out.print("\nPrimeiro valor: ");
				valor1 = teclado.nextInt();

				System.out.print("\nSinal de operacao: ");
				sinal = teclado.next().charAt(0);

				System.out.print("\nSegundo valor: ");
				valor2 = teclado.nextInt();

				System.out.println("\n\n====RESULTADO====\n\n");

				/* IMPRIMINDO DADOS */
				switch (sinal) {
				case '+':
					System.out.println(valor1);
					System.out.println(sinal);
					System.out.println(valor2);
					System.out.println("______________");
					Soma(valor1, valor2);

					break;

				case '-':
					System.out.println(valor1);
					System.out.println(sinal);
					System.out.println(valor2);
					System.out.println("______________");
					Subtracao(valor1, valor2);

					break;

				case '*':

					System.out.println(valor1);
					System.out.println(sinal);
					System.out.println(valor2);
					System.out.println("______________");
					Multiplicao(valor1, valor2);

					break;

				case '/':

					System.out.println(valor1);
					System.out.println(sinal);
					System.out.println(valor2);
					System.out.println("______________");
					divisao(valor1, valor2);

					break;
				default:
					System.out.println("\n(SINAL DA OPERACAO IVALIDO!)\n");
					break;
				}
			} else {
				System.out.println("\nAPENAS 'S' OU 'N'. Digite novamente\n");
			}

		} while (continuar);
		
		teclado.close();
	}
}
