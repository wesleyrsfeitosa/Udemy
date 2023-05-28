package curso_logica_java;

import javax.swing.JOptionPane;

public class Soma5Valores1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int soma = 0, valor;

for ( int i=1; i<=5; i++) {
	
	valor = Integer.parseInt(JOptionPane.showInputDialog("DIgite o Valor " + i));
	
	soma += valor;
	
}

JOptionPane.showInputDialog(null, " A soma é igual a " + soma);
	}

}