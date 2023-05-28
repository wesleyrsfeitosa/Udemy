package curso_logica_java;

import java.util.Scanner;

public class Exercicio_Dias_Vida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		int anos, meses, dias, diasvida;
		System.out.println("Preciso calcular quantos dias vc ja viveu, então vou precisar da sua idade em anos, meses e dias.");
		System.out.println("Digite sua idade: ");
		anos = teclado.nextInt();
		System.out.println("Digite os meses: ");
		meses = teclado.nextInt();
		System.out.println("Digite os dias: ");
		dias = teclado.nextInt();
		
		anos = anos*365;
		meses = meses*30;
		
		diasvida = anos + meses + dias;
		
		System.out.println("Você ja viveu " + diasvida + " Dias");
teclado.close();
	}

}
