package curso_logica_java;

import java.util.Scanner;

public class Vetores6 {

	public static void main(String[] args) {
	
		 int[] nota = new int[3];
	     Scanner teclado = new Scanner(System.in);
	     
	     //recebendo os números
	     for(int i=0 ; i < 3 ; i++){
	         System.out.println("Entre com o número " + (i+1) + ": ");
	         nota[i] = teclado.nextInt();
	     }
	     
	     //exibindo os números
	     for(int i=0 ; i < 3 ; i++){
	         System.out.printf("Número %d -> Valor armazenado: %d\n",i+1, nota[i]);
	     }
	     
	     
	     teclado.close();
	 }


	}

