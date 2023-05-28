package curso_logica_java;

import java.util.Scanner;

//passando uma lista de parâmetros para um método - Cálculo do IMC

public class CalculoIMC {


		 public static float IMC(float peso, float altura){
		        float imc;
		        imc = peso/(altura*altura);
		        return imc;
		    }
		    
		    public static void main(String[] args) {
		        float peso, altura, imc;
		        Scanner teclado = new Scanner(System.in);
		        
		        System.out.print("Entre com seu peso, em kilos: ");
		        peso = teclado.nextFloat();
		        
		        System.out.print("Entre com sua altura, em metros: ");
		        altura = teclado.nextFloat();
		        
		        imc = IMC(peso, altura);
		        
		        System.out.printf("Seu IMC vale: %.2f",imc);
teclado.close();
		    }
		}

