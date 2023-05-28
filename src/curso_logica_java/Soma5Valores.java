package curso_logica_java;

import java.util.Scanner;

public class Soma5Valores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		int valor, soma=0;
		for(int i=1; i<=5; i++) {
			System.out.println("Digite o " + i + "º valor");
			valor= teclado.nextInt();
			soma+=valor;
		}
System.out.println(" A soma é igual a " + soma);

teclado.close();
	}

}
