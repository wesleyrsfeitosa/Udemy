package curso_logica_java;

public class vetores15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun",
					"Jul", "Ago", "Set", "Out", "Nov", "Dez"};
		int dias[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		for(int i=0; i<mes.length; i++) {
		System.out.println(" O mês de " + mes[i] + " tem " + dias[i] + " ao todo");	
		}
				
		}
		
	}


