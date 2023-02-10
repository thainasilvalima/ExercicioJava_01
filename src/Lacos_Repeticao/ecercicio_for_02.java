package Lacos_Repeticao;
/*Escreva um algoritmo em Java, que leia 10 números inteiros via teclado
 *  e mostre na tela quantos números são pares e quantos número são ímpares.*/

import java.util.Scanner;

public class ecercicio_for_02 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		int num, numPar = 0, numImpar = 0, i;

		for (i = 0; i < 10; i++) {
			System.out.println("\n Digite um numero inteiro: ");
			num = read.nextInt();

			if (num % 2 == 0) {
				numPar++;
			} else {
				numImpar++;
			}
		} 
		System.out.println("\n Numeros pares: " + numPar);
		System.out.println("\n Numeros impares: " + numImpar);


	} 

}
