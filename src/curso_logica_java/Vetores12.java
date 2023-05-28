package curso_logica_java;

import java.util.Arrays;


public class Vetores12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vet[] = {5,7,9,11,13};
		
		for(int valor: vet) {
		System.out.printf( valor + " ");	
		}
		
		System.out.println("");
		
		// essa classe localiza a posição do numero que solicitei
		int p0 = Arrays.binarySearch(vet, 5);
		int p1 = Arrays.binarySearch(vet, 7);
		int p2 = Arrays.binarySearch(vet, 9);
		int p3 = Arrays.binarySearch(vet, 11);
		int p4 = Arrays.binarySearch(vet, 13);
		
	
		System.out.println("Encontrei o valor 5 na posição " + p0);
		System.out.println("Encontrei o valor 7 na posição " + p1);
		System.out.println("Encontrei o valor 9 na posição " + p2);
		System.out.println("Encontrei o valor 11 na posição " + p3);
		System.out.println("Encontrei o valor 13 na posição " + p4);
	
		
	}
}