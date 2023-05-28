package curso_logica_java;



import javax.swing.JOptionPane;


public class Exercicio_Salario1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub+
		
		String nome, cargo;
		int idade;
		float salarioBruto, salarioTotal, salarioLiquido;
		
		
		//Scanner teclado = new Scanner(System.in);
		nome = JOptionPane.showInputDialog("Digite o Nome do Funcionario: ");
		idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a Idade do funcionario: "));
		cargo = JOptionPane.showInputDialog("Digite o cargo do Funcionario");
		salarioBruto = Float.parseFloat(JOptionPane.showInputDialog("DIgite o salario do funcionario"));
		
		salarioTotal = salarioBruto+(0.38f * salarioBruto)+(0.20f * salarioBruto);
		
		salarioLiquido = salarioTotal-(0.15f * salarioTotal);
		
		JOptionPane.showMessageDialog(null,"Nome do Funcionario: " + nome +"\nIdade: " + idade + " Anos" + "\nCargo: " + cargo + "\nsalario bruto: " + salarioBruto + "\n Salario com Reajuste: " + salarioTotal + "\nSalario Liquido: " + salarioLiquido );
		

	}

}