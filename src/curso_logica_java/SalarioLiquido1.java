package curso_logica_java;

import javax.swing.JOptionPane;

public class SalarioLiquido1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int hora, dep;
		Float inss, ir, salariob, salariol;
		
		hora = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas: "));

		dep =  Integer.parseInt(JOptionPane.showInputDialog("DIgite a quantidade de dependentes: "));

		salariob = (float)hora*12 + dep*40;
		inss = salariob * 0.085f;
		ir = salariob * 0.05f;
		salariol = (salariob-inss) - ir;
		
		JOptionPane.showMessageDialog(null,"\n valores: " +
									"\n 12 reais por hora" +
									"\n 40 reais por depedentes" +
									"\n----------------------------" +
		                             "\n horas trabalhadas: " + hora + 
									"\n Numero de dependentes: " + dep + 
									"\n Salario Bruto: " + salariob + 
									"\n desconto INSS: " + inss +
									"\n Desconto IR: " + ir +
									"\nSalario Liquido: " + salariol);
	}

}