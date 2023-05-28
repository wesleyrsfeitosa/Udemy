package curso_logica_java;

//Biblioteca abaixo para entrada de dados pelo usuário.
import java.util.Scanner;

public class EntradaDeDados2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// criado objeto teclado para ter o controle da entrada de dados
		Scanner teclado = new Scanner(System.in);

		/*
		 * Abaixo o usuario digita o nome, onde sera armazenado na variavel nome criada
		 * do tipo String,chamei o objeto teclado para armazenar o nome
		 */
		System.out.println("Digite um valor String: ");
		String nome = teclado.nextLine();

		System.out.println("o Valor String é: " + nome);
		
		teclado.close();
	}

}