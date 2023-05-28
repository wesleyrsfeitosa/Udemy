package curso_logica_java;

//BIBLIOTECA NECESSÁRIA PARA ENTRADA DE DADOS PELO USUÁRIO


import javax.swing.JOptionPane;

public class EntradaDeDados5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome;
		int idade;
		Float salario;

		nome = JOptionPane.showInputDialog("Digite seu Nome: ");

		/*
		 * SEMPRE QUE EU QUISER ALTERAR O TIPO DE VARIÁVEL STRING PARA OUTRA VARIAVEL,
		 * VOU UTILIZAR O "parseInt" parseFloat" exemplos
		 */
		idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua Idade"));

		salario = Float.parseFloat(JOptionPane.showInputDialog("Digite seu Salario: "));

		System.out.println(nome);
		System.out.println(idade);
		System.out.println(salario);
	}

}