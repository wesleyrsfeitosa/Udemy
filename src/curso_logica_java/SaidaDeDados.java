package curso_logica_java;

public class SaidaDeDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome = "Wesley Rodrigues";
		int idade = 33;
		boolean casado = false;
		float salario = 1250f;
		char sexo= 'M';
		
		System.out.println(" nome: " + nome + "\n Idade: " + idade +
						  " \n casado: " + casado + "\n salario: " + salario + "\n sexo: " + sexo);
		
		System.out.println("");

		System.out.printf(" nome: %s \n Idade: %d \n casado: %b \n salario: %f \n sexo: %c", nome, idade, casado, salario, sexo );
	}

}
