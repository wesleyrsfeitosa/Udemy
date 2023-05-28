package curso_logica_java;

import javax.swing.JOptionPane;

public class NumeroMaior1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1, num2;
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero: "));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero: "));
	if (num1>num2) 
	
		JOptionPane.showMessageDialog(null, "O numero : " + num1 + " é maior que o " + num2);
		
	else
		JOptionPane.showMessageDialog(null, "O numero : " + num2 + " é maior que o " + num1);	
	}

}