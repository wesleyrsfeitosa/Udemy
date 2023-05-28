package curso_logica_java;

import javax.swing.JOptionPane;

public class Estrutua_If2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero de 1 a 12"));

if (valor==1)
	JOptionPane.showMessageDialog(null, "Janeiro");
else if(valor==2)
		JOptionPane.showMessageDialog(null, "Fevereiro");	
else if(valor==3)
	JOptionPane.showMessageDialog(null, "Março");	
else if(valor==4)
	JOptionPane.showMessageDialog(null, "Abril");	
else if(valor==5)
	JOptionPane.showMessageDialog(null, "Maio");	
else if(valor==6)
	JOptionPane.showMessageDialog(null, "Junho");	
else if(valor==7)
	JOptionPane.showMessageDialog(null, "Julho");
else if(valor==8)
	JOptionPane.showMessageDialog(null, "Agosto");	
else if(valor==9)
	JOptionPane.showMessageDialog(null, "Setembro");
else if(valor==10)
	JOptionPane.showMessageDialog(null, "Outubro");
else if(valor==11)
	JOptionPane.showMessageDialog(null, "Novembro");	
else if(valor==12)
	JOptionPane.showMessageDialog(null, "Dezembro");	
else 
	JOptionPane.showMessageDialog(null, "Valor Inválido");	

			
		
	}

}
