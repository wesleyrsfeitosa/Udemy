package curso_logica_java;

import java.util.Scanner;

public class SalarioLiquido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String nome;
		int dependentes;
		float salariob, salariol, horastrabalhadas, inss, ir;
		
		System.out.println("Digite seu nome: ");
		nome = teclado.nextLine();
		
		System.out.println("Digite a quantidade de horas trabalhadas: ");
		horastrabalhadas = teclado.nextFloat();
		
		System.out.println("Digite a quantidade de dependentes: ");
		dependentes = teclado.nextInt();
		
		salariob = (float) horastrabalhadas*12 + dependentes*40;
		
		salariol = salariob - (salariob*0.085f) - (salariob * 0.05f);
		
		inss = salariob*0.085f;
		
		ir = salariob * 0.05f;
		
		
		System.out.println("Nome: " + nome);
		System.out.println("Numero de dependentes: " + dependentes);
		System.out.println("Salario Bruto: " + salariob);
		System.out.println("Horas trabalhadas: " + horastrabalhadas);
		System.out.println("Desconto do INSS: " + inss);
		System.out.println("Desconto IR: " + ir);
		System.out.println("Salarioo Liquido: " + salariol);
	
		teclado.close();

	}

}
