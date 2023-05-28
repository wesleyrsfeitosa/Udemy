package curso_logica_java;

import java.util.Scanner;

public class Estrutura_Repetitiva_For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner teclado = new Scanner(System.in);

System.out.println("Digite a quantidade de numeros a ser somados: ");
int n = teclado.nextInt();

int soma=0;
for(int i=0; i<n; i++) {
	System.out.println("Digite um valor: ");
	int x = teclado.nextInt();
	soma+=x;
}

System.out.println("A soma dos valores digitados foi: " + soma);

	
teclado.close();
	}

}
