package curso_logica_java;

import javax.swing.JOptionPane;

public class Exercicio_Dias_Vida1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int anos, diasvida, meses, dias;

		anos = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos anos você tem: "));
		meses = Integer.parseInt(JOptionPane.showInputDialog("DIgite os meses"));
		dias = Integer.parseInt(JOptionPane.showInputDialog("Digites os dias"));
		
		anos = anos*365;
		meses = meses*30;
		
		diasvida = anos + meses + dias;
		
		JOptionPane.showInputDialog(" Você ja viveu " + diasvida + " dias");
	}

}