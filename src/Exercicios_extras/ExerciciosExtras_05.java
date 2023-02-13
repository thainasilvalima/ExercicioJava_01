package Exercicios_extras;
/*Crie um programa que leia um número do teclado até que encontre um número igual a zero. 
 No final, mostre a soma dos números digitados.(DO...WHILE)
*/
import java.util.Scanner;

public class ExerciciosExtras_05 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		
		int x, soma=0;
		
		System.out.println("\nDigite um número, para encerrar digite 0: ");
		x = read.nextInt();
		
		do { soma += x;
		
			x = read.nextInt();
			
		} while (x !=0);
		System.out.println("\n A soma dos número é: "+ soma );

		
		
	}

}
