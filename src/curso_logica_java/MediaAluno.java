package curso_logica_java;

import java.util.Scanner;

public class MediaAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		String nome;
		float nota1, nota2, nota3, nota4, media;
		
		System.out.println(" Digite seu nome: ");
		nome = teclado.nextLine();
		
		System.out.println(" Digite a nota 1: ");
		nota1 = teclado.nextFloat();
		
		System.out.println(" Digite a nota 2: ");
		nota2 = teclado.nextFloat();
		
		System.out.println(" Digite a nota 3: ");
		nota3 = teclado.nextFloat();
		
		System.out.println(" Digite a nota 4: ");
		nota4 = teclado.nextFloat();
		
		media = (nota1+nota2+nota3+nota4)/4;
		
		if(media>=7)
			System.out.println("o aluno " + nome + " foi aprovado com a nota " + media);
		else
			System.out.println("o aluno " + nome + " foi reprovado com a nota " + media);	
		
		teclado.close();
	}

}
