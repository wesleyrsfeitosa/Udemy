package curso_logica_java;

import java.util.Scanner;

public class FuncoesEMetodos2 {

	public static int soma(int a,int b) {
		int s = a * b;
		return s;
		
	}
	
	public static void main(String[] args) {
Scanner teclado = new Scanner(System.in);

		System.out.println("Digite o primeiro valor");
		int n = teclado.nextInt();
		
		System.out.println("Digite o segundo valor");
		int m = teclado.nextInt();
		
		int j = soma(n,m);
		
		System.out.println(m + " * " + n + " = " + j);
		
	teclado.close();	
		
	}
	
	
}
