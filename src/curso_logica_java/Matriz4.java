package curso_logica_java;

import java.util.Scanner;

public class Matriz4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		int m = teclado.nextInt();
		int n = teclado.nextInt();

		double[][] numeros = new double[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				numeros[i][j] = teclado.nextDouble();
			}
		}
		double [] vet = new double[m];
	      for(int i=0 ; i < m ; i++){
	    	  double soma = 0.0;
	    	  for(int j=0 ; j < n ; j++){
	    		 soma = soma + numeros[i][j];  
	    	  }
	    	  vet[i] = soma;
	      }
	      for(int i=0 ; i < m ; i++){
	    	  System.out.printf("%.1f%n", vet[1]);
	    	  
	      }
	      
	      
	      
	       teclado.close();
		}
		
	}
