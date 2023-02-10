package Lacos_Repeticao;

import java.util.Scanner;

public class Aula_lacos_for {

	public static void main(String[] args) {
        float n1,n2,n3,media,somaMedia=0,mg;
		int x; 
		
		Scanner leia = new Scanner(System.in);
		
		for(x=1;x<=4;x++) //é o mesmo que: x = x+1 
		{ 
		 System.out.println("\nDigite a primeira nota: ");
		 n1 = leia.nextFloat();
		 System.out.println("\nDigite a segunda nota: ");
		 n2 = leia.nextFloat();
		 System.out.println("\nDigite a terceira nota: ");
		 n3 = leia.nextFloat();
		 media = (n1+n2+n3)/3; 
		 System.out.println("\nMédia do aluno " + x + " foi de: "+media);
			
		somaMedia += media; // é o mesmo que: somaMedia = somaMedia+media	
		} 
		mg = somaMedia/4; 
		System.out.printf("\nMédia geral: %.2f ",mg);
	}

}
