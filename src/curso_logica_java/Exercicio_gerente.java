package curso_logica_java;

import java.util.Scanner;

public class Exercicio_gerente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		String produto;
		Float valorProduto, parcelas, resto, entrada;
		
		System.out.println("Digite o produto: ");
		produto = teclado.nextLine();
		
		System.out.println("Digite o valor do produto: ");
		valorProduto = teclado.nextFloat();
		
		resto = valorProduto % 3;
		
		parcelas = (valorProduto - resto) / 3;
		
		entrada = parcelas + resto;
		
		System.out.println("Nome do produto: " + produto);
		System.out.println("Valor do produto: " + valorProduto);
		System.out.println("Valor das parcelas: " + parcelas);
		System.out.println("valor da entrada: " + entrada);
		
		teclado.close();

	}

}
