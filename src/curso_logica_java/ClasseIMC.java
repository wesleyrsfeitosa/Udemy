package curso_logica_java;

import java.util.Scanner;

//chamando um método dentro do outro - Cálculo do IMC

public class ClasseIMC {
	public static void main(String[] args) {
        float peso, altura;
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Entre com seu peso, em kilos: ");
        peso = teclado.nextFloat();
        
        System.out.print("Entre com sua altura, em metros: ");
        altura = teclado.nextFloat();
        
        System.out.printf("Seu IMC vale: %.2f", IMC(peso, altura));
        teclado.close();
    }
    
    public static float IMC(float peso, float altura){
        return peso/quadrado(altura);
    }
    
    public static float quadrado(float num){
        return num*num;
        
   
    }
    
}
