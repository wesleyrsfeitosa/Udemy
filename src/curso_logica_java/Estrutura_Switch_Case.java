package curso_logica_java;

import javax.swing.JOptionPane;

public class Estrutura_Switch_Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero de 1 a 12"));

switch (valor) {
case 1:
	JOptionPane.showMessageDialog(null, "Janeiro");
	break;
case 2: 
		JOptionPane.showMessageDialog(null, "Fevereiro");	
		break;
case 3:
	JOptionPane.showMessageDialog(null, "Março");
	break;
case 4:
	JOptionPane.showMessageDialog(null, "Abril");
	break;
case 5:
	JOptionPane.showMessageDialog(null, "Maio");	
	break;
case 6:
	JOptionPane.showMessageDialog(null, "Junho");	
	break;
case 7:
	JOptionPane.showMessageDialog(null, "Julho");
	break;
case 8:
	JOptionPane.showMessageDialog(null, "Agosto");	
	break;
case 9:
	JOptionPane.showMessageDialog(null, "Setembro");
	break;
case 10:
	JOptionPane.showMessageDialog(null, "Outubro");
	break;
case 11:
	JOptionPane.showMessageDialog(null, "Novembro");	
	break;
case 12:
	JOptionPane.showMessageDialog(null, "Dezembro");
	break;
default:
	JOptionPane.showMessageDialog(null, "Valor Inválido");	

}	
		
	}

}
