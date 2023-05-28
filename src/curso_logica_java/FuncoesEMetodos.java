package curso_logica_java;

import java.util.Scanner;

public class FuncoesEMetodos {

	
		// TODO Auto-generated method stub
		/* O VOID É UM PROCEDIMENTO SEM RETORNO E O SOMA
		É O METODO QUE SERA CHAMADO.*/
		
		static void soma(int a, int b) {
			int s = a+b;
			System.out.println("A soma é "+s);
		}
		public static void main(String[] args) {
			
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("comecou o programa");
			soma(15, 15);
				entrada.close();
		}

	}
