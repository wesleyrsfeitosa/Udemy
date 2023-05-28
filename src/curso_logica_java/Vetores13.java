package curso_logica_java;

import java.util.Arrays;
import java.util.Scanner;

public class Vetores13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner teclado = new Scanner(System.in);
	int[] v = new  int[20];
	Arrays.fill(v, 1); // essa classe vai preencher todas posições com o numero 0 solicitei
	for(double valor: v) {
		System.out.printf(valor + " ");
	}
	System.out.println("");
	for(int valor: v) {
		System.out.printf(valor + " ");
	}
	

teclado.close();
	}

}
