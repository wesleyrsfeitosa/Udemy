package curso_logica_java;

import javax.swing.JOptionPane;

public class QuantidadeCedulas1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n100=0, n50=0, n20=0, n10=0, n5=0, n2=0, n1=0, resto, valor;
		valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor"));
	resto = valor; 
	
	if(resto>= 100) {
		n100 = resto / 100;
		resto= resto % 100;
	}
	if(resto>= 50) {
		n50 = resto / 50;
		resto= resto %50;
	}
	if(resto>= 20) {
		n20 = resto / 20;
		resto= resto %20;
	}
	if(resto>= 10) {
		n10 = resto / 10;
		resto= resto %10;
	}
	if(resto>= 5) {
		n5 = resto / 5;
		resto= resto %5;
	}
	if(resto>= 2) {
		n2 = resto / 2;
		resto= resto %2;
	}
	if(resto>= 1) {
		n1 = resto / 1;
		resto= resto %1;
	}
	JOptionPane.showMessageDialog(null,"\nValor Digitado" + valor + 
									"\n Notas de 100 = " + n100 +
									"\n Notas de 50 = " + n50 +
									"\n Notas de 20 = " + n20 +
									"\n Notas de 10 = " + n10 +
									"\n Notas de 5 = " + n5 +
									"\n Notas de 2 = " + n2 +
									"\n Notas de 1 = " + n1);
	}

}