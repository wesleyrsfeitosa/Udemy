package curso_logica_java;

import java.util.Scanner;

public class Vetores9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner teclado = new Scanner(System.in);
      int n[] = {3,2,8,7,5,4};
      System.out.println("Na posição de N " + n.length);
      for(int c=0; c<=5; c++) {
    	  System.out.println("Na posição " + c + " temos o valor " + n[c]);
      }
      
      teclado.close();
	}
	
}
