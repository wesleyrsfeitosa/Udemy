package curso_logica_java;

import java.util.Scanner;

public class Vetores8 {

	public static void main(String[] args) {
		
		int[] numero = new int[5];
        int soma=0;
        Scanner teclado = new Scanner(System.in);
        
        for(int cont=0 ; cont< numero.length ; cont++){
            System.out.print("Entre com o número "+(cont+1)+": ");
            numero[cont]=teclado.nextInt();
        }
            
        for(int cont : numero){
            soma += cont;
        }
        
        System.out.println("A soma dos números que você digitou é "+soma);

            
   	     teclado.close();
   	 }
        
           	}
