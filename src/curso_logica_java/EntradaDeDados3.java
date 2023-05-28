package curso_logica_java;

import java.util.Scanner;

public class EntradaDeDados3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String nome;
		int idade;
		float salario;
		
		System.out.print("Digite seu nome: ");
		nome = teclado.nextLine();
		
		System.out.print("Digite sua idade: ");
		idade = teclado.nextInt();
		
		System.out.println("Digite seu salario: ");
		salario = teclado.nextFloat();
		
		System.out.println("nome:  " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Salario: " + salario);
		
		teclado.close();
		
	}

}
