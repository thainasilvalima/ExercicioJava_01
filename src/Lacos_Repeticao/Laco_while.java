package Lacos_Repeticao;

import java.util.Scanner;

public class Laco_while {

	public static void main(String[] args) {
   
		int num, somaPar=0;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\nDigite um número: ");
		num = leia.nextInt();
		
		while (num!=99) {
			if (num % 2==0) {
			somaPar += num;	
			}
			System.out.println("\n Digite um número: ");
			num = leia.nextInt();
		}
		System.out.println("\n A soma dos números pares é: " + somaPar);
	}

}
