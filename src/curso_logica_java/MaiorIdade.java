package curso_logica_java;

import java.util.Scanner;

public class MaiorIdade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int idade, maisvelha = 0, n20 = 0, soma = 0;
	float media;

		for (int i = 1; i <= 5; i++) {
			System.out.println("Digite a " + i + "º idade");
		idade = teclado.nextInt();
soma +=idade;

if(idade>maisvelha)
	maisvelha=idade;

if(idade>20)
	n20++;



		}
		
		media=soma/5;
		System.out.printf(" a media das idade é %.0f, a pessoa mais velha tem %d anos, e tem %d pessoas acima de 20 anos", 
				media, maisvelha,n20 );
		
		teclado.close();
	}

}
