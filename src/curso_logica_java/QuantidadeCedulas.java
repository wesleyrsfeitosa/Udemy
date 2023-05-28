package curso_logica_java;

import java.util.Scanner;

public class QuantidadeCedulas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int n100=0, n50=0, n20=0, n10=0, n5=0, n2=0, n1=0, resto, valor;
		
		System.out.println("Digite o valor: ");
		valor = teclado.nextInt();
		
		resto = valor;
		
		if(resto >=100) {
			n100 = resto/100;
			resto = resto %100;
		}
		if(resto >=50) {
			n50 = resto/50;
			resto = resto %50;
		}
		if(resto >=20) {
			n20 = resto/20;
			resto = resto %20;
		}
		if(resto >=10) {
			n10 = resto/10;
			resto = resto %10;
		}
		if(resto >=5) {
			n5 = resto/5;
			resto = resto %5;
		}
		if(resto >=2) {
			n2 = resto/2;
			resto = resto %2;
		}
		if(resto >=1) {
			n1 = resto/1;
			resto = resto %1;
		}
		
		System.out.println("Valor Digitado " + valor + 
							"\nNotas de 100 " + n100 +
							"\nNotas de 50 " + n50 +
							"\nNotas de 20 " + n20 +
							"\nNotas de 10 " + n10 +
							"\nNotas de 5 " + n5 +
							"\nNotas de 2 " + n2 +
							"\nNotas de 1 " + n1);
teclado.close();
	}

}
