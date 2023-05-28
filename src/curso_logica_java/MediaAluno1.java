package curso_logica_java;

import java.util.Scanner;

public class MediaAluno1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String nome, resultado;
		Float nota, soma=0f, media;
		
		System.out.println(" Digite seu nome: ");
		nome = teclado.nextLine();
		resultado = "Aluno: " + nome;
		
		for(int i=1; i<=4; i++) {
			
			System.out.println(" Digite a nota: " + i);
			nota = teclado.nextFloat();
			soma = soma + nota;
			resultado +="\nNota " + i + " = " + nota;
		}
		
		media = soma/4;
		
			if(media>=7)
				resultado += "\n ALuno aprovado com a media " + media;
			else
				resultado += "\n ALuno reprovado com a media " + media;
			
			System.out.println(resultado);
			
			teclado.close();
		}
		

	}


