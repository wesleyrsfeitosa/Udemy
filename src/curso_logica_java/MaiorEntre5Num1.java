package curso_logica_java;

import javax.swing.JOptionPane;

public class MaiorEntre5Num1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num, maior = 0;

for(int j=1; j<=5;j++) {
	
	num = Integer.parseInt(JOptionPane.showInputDialog("Digite o Valor: " + j));

	if(num > maior)
	maior = num;
}
	JOptionPane.showMessageDialog(null,"Maior igual a: " + maior);

	}

}