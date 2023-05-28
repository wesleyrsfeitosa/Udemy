package curso_logica_java;

import java.util.Scanner;

public class Exercicio_Salario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner teclado = new Scanner(System.in);
String nome, cargo;
int idade;
float salariol, salariob, reajuste, gratificacao, salariototal, desconto;

System.out.println("Digite seu nome: ");
nome = teclado.nextLine();

System.out.println("Digite seu cargo: ");
cargo = teclado.nextLine();

System.out.println("Digite sua idade: ");
idade = teclado.nextInt();

System.out.println("Digite seu salario bruto: ");
salariob = teclado.nextFloat();

salariototal = salariob + ( reajuste = 0.38f * salariob) + ( gratificacao = 0.20f * salariob) ;

salariol = salariototal - (desconto = 0.15f * salariototal);

System.out.println("Nome: " + nome);
System.out.println("Cargo: " + cargo);
System.out.println("Idade: " + idade);
System.out.println("Salario Bruto: " + salariob);
System.out.println("Reajuste: " + reajuste );
System.out.println("Gratificação: " + gratificacao);
System.out.println("Desconto do salario total: " + desconto);
System.out.println("Salario Liquido: " + salariol);

teclado.close();

	}

}
