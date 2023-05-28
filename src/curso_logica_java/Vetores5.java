package curso_logica_java;

import java.util.Scanner;

public class Vetores5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite o tamanho do vetor: ");
		int n = teclado.nextInt();
		
		String[] nomes = new String[n];
		
		for (int i = 0; i < n; i++) {
		System.out.println("Digite o " + i + "º nome");	
		nomes[i] = teclado.next();
		}
		
		System.out.println("nomes lidos:");	
		for (String s : nomes) {
		System.out.println(s);	
		}
		
		System.out.println("Imprimindo o nome alocado no vetor nomes posição 1\n" + nomes[1]);
		
		teclado.close();
	}

}
