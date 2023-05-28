package curso_logica_java;

import java.util.Scanner;

public class MaiorEntre5Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner teclado = new Scanner(System.in);
int num, maior=0;

for(int i=1; i<=5; i++) {
	System.out.println("Digite o " + i + " numero");
	num = teclado.nextInt();
	
	if (num>maior)
		maior=num;
}
	System.out.println(" o maior numero digitado foi: " + maior);

	teclado.close();
	}

}
