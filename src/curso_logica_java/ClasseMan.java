package curso_logica_java;

import java.util.Scanner;

public class ClasseMan {

	static int soma(int a, int b) {
		int s = a+b;
		return s;
	}
	
	public static void main(String[] args) {
		

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("vai comecar a contagem");
		System.out.println(ClasseOperacoes.contador(1,15));
	 int sm = soma(5,7);
	 System.out.println(" A soma vale " + sm);
			entrada.close();
	}

}

