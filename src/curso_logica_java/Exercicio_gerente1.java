package curso_logica_java;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercicio_gerente1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner teclado = new Scanner(System.in);
        
        String nomeProduto;
        Float valorProduto, entrada, parcelas, resto;
        
        nomeProduto = JOptionPane.showInputDialog("Digite o Produto: ");
        
        valorProduto = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do produto: "));
       
        resto = valorProduto % 3;
              
        parcelas = (valorProduto - resto) / 3;
        
        entrada = parcelas + resto;
        
          JOptionPane.showMessageDialog(null, " Produto: "+ nomeProduto + "\n Valor do Produto: " + valorProduto + "\n Entrada: " + entrada + "\n Valor das parcelas : " + parcelas );      
        teclado.close();
    }

}