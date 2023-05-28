package curso_logica_java;

import java.util.Scanner;

/*Crie um aplicativo que receba 5 valores do
usuário e calcule a média dos 5, dos primeiros 
4, 3 e 2 valores inseridos. Use apenas um método 
que receba uma lista de argumentos de tamanho qualquer.*/

public class FuncoesEMetodos3 {

	 public static float media(float... valores){
	        float media=0;
	        
	        for(float valor: valores){
	            media +=valor;
	        }
	        
	        return media/valores.length;
	    }

	    public static void main(String[] args){
	            float valor1, valor2, valor3, valor4, valor5;
	            Scanner teclado = new Scanner(System.in);
	            
	            System.out.print("Entre com o valor 1: ");
	            valor1 = teclado.nextFloat();
	            System.out.print("Entre com o valor 2: ");
	            valor2 = teclado.nextFloat();
	            System.out.print("Entre com o valor 3: ");
	            valor3 = teclado.nextFloat();
	            System.out.print("Entre com o valor 4: ");
	            valor4 = teclado.nextFloat();
	            System.out.print("Entre com o valor 5: ");
	            valor5 = teclado.nextFloat();
	            
	            
	            System.out.println("A média dos 5 números é: "+media(valor1,valor2,valor3,valor4,valor5));
	            System.out.println("A média dos 4 primeiros números é: "+media(valor1,valor2,valor3,valor4));
	            System.out.println("A média dos 3 primeiros números é: "+media(valor1,valor2,valor3));
	            System.out.println("A média dos 2 primeiros números é: "+media(valor1,valor2));
	      teclado.close();  
	    }


	}
