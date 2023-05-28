package curso_logica_java;

import java.util.Scanner;

public class Estrutura_Faca_Enquanto {
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	Scanner teclado = new Scanner(System.in);
char resp;

do {
	
	System.out.println("Digite a quantidade de numeros a ser somados: ");
	int n = teclado.nextInt();

	int soma=0;
	for(int i=0; i<n; i++) {
		System.out.println("Digite um valor: ");
		int x = teclado.nextInt();
		soma+=x;
	}

	System.out.println("A soma dos valores digitados foi: " + soma);

	System.out.println("Deseja continuar? [S/N]");
	resp = teclado.next().charAt(0);
}while(resp!='n');

System.out.println("Fim da execução");


	
	teclado.close();
	
		}

	

	}


