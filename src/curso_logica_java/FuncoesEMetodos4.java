package curso_logica_java;

import java.util.Scanner;

/*Um professor, muito legal, fez 3 provas durante um semestre 
mas só vai levar em conta as duas notas mais altas para calcular
a média.
Faça uma aplicação em Java que peça o valor das 3 notas, 
mostre como seria a média com essas 3 provas, a média com
as 2 notas mais altas, bem como sua nota mais alta e sua 
nota mais baixa. Essas médias devem ser calculadas usando 
o mesmo método, pois você é um programador Java e não vai ficar criando métodos à toa.
Crie outro método que receba as 3 notas e retorna a maior 
delas. E outro que retorna a menor.*/

public class FuncoesEMetodos4 {

	public static float media(float... notas){
		float m=0;
		for(float nota: notas){
		m +=nota;
		}
		return m/notas.length;

		}

		public static float maiorn(float n,float n2,float n3) {
		float maiorn;
		maiorn = Math.max(Math.max(n, n2), n3);

		return maiorn;
		}

		public static float menorn(float n,float n2,float n3) {
		float menorn;
		menorn = Math.min(Math.min(n, n2),n3);

		return menorn;
		}

		public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float n,n2,n3;

		System.out.println("Digite a primeira nota:");
		n = teclado.nextFloat();
		if((n<0)||(n>10)){
		do{
		System.out.println("A nota é inválida.");
		System.out.println("Digite a primeira nota:");
		n = teclado.nextFloat();
		}while((n<0)||(n>10));
		}

		System.out.println("Digite a segunda nota:");
		n2 = teclado.nextFloat();
		if((n2<0)||(n2>10)){
		do{
		System.out.println("A nota é inválida.");
		System.out.println("Digite a segunda nota:");
		n2 = teclado.nextFloat();
		}while((n2<0)||(n2>10));
		}

		System.out.println("Digite a terceira nota:");
		n3 = teclado.nextFloat();
		if((n3<0)||(n3>10)){
		do{
		System.out.println("A nota é inválida.");
		System.out.println("Digite a terceira nota:");
		n3 = teclado.nextFloat();
		}while((n3<0)||(n3>10));
		}

		System.out.println("A media das três notas é: "+media(n,n2,n3));
		if((n<n2)&&(n<n3)){
		System.out.println("A media das duas maiores notas é: "+media(n2,n3));
		}

		if((n2<n)&&(n2<n3)){
		System.out.println("A media das duas maiores notas é: "+media(n,n3));
		}

		if((n3<n2)&&(n3<n)){
		System.out.println("A media das duas maiores notas é: "+media(n,n2));
		}

		System.out.println("A maior nota é: "+maiorn(n,n2,n3));
		System.out.println("A menor nota é: "+menorn(n,n2,n3));
		teclado.close();
		}

		}
