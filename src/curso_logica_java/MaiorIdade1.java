package curso_logica_java;

import javax.swing.JOptionPane;

public class MaiorIdade1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int idade, n20 = 0, maisvelha = 0, soma = 0;
float media;
for (int i=1; i<=5; i++) {
	
	idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a Idade: " + i));
	
	soma +=idade;
	
	if(maisvelha < idade)
	maisvelha = idade;
	
	if (idade>20)
		n20++;	
}

media = soma/5;
JOptionPane.showMessageDialog(null, "Idade mais velha  = " + maisvelha + 
								"\n Média = " + media + 
								"\nIdade Superior a 20 =  " + n20 );
	}

}