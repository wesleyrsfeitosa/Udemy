package curso_logica_java;

import java.util.Scanner;

public class Vetores7 {

	public static void main(String[] args) {
		
		 
	     float[] nota = new float[3];
	     String nome;
	     Scanner teclado = new Scanner(System.in);
	    
	     System.out.print("Nome do aluno: ");
	     nome = teclado.nextLine();
	    
	     System.out.print("Primeira nota: ");
	     nota[0] = teclado.nextFloat();
	    
	     System.out.print("Segunda nota: ");
	     nota[1] = teclado.nextFloat();
	    
	     //média
	     nota[2] = (nota[0] + nota[1])/2;
	    
	     System.out.printf("O aluno %s tirou %.1f e %.1f, obtendo média final %.2f",nome,nota[0],nota[1],nota[2]);
	     
	     
	     teclado.close();
	 }

	}
