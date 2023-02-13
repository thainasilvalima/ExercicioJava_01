package Exercicios_extras;

/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. 
Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99.*/
import java.util.Scanner;

public class ExerciciosExtras_03 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		
		int i, maior=0, menor=0;
		
		System.out.println("\n Digite uma idade, para interromper digite -99: ");
	    i = read.nextInt();
		
		while(i!=-99) {
			if (i <21 ) { menor++;
		} if(i>50) {maior++;
		
		} 	System.out.println("\n Digite uma idade, para interromper digite -99: ");
		    i = read.nextInt();
	
		}System.out.println("\n O total de pessoas com mais de 50 anos: " + maior); 
		 System.out.println("\n O total de pessoas com menos de 21 anos: " + menor);
	}

}
