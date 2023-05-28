package curso_logica_java;

import java.util.Scanner;

public class NumeroMaior {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
			int num1, num2;
		
	System.out.println("Digite o primeiro numero: ");
	num1 = teclado.nextInt();
	
	System.out.println("Digite o segundo numero: ");
	num2 = teclado.nextInt();
		
	if(num1>num2)
	System.out.println(" o numero " + num1 + " é maior que o numero " + num2);
	else
		System.out.println(" o numero " + num2 + " é maior que o numero " + num1);
		teclado.close();
	}

}
