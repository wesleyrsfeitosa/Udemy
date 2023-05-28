package curso_logica_java;

import java.io.IOException;

public class EntradaDeDados {

	public static void main(String[] args) throws IOException {
	


System.out.print("Digite seu Nome: ");
byte[] valor = new byte [100];
System.in.read(valor);
String nome = new String(valor);
System.out.print("Seu nome é: " + nome);
		
		
	}

}