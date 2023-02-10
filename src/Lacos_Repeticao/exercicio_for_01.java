package Lacos_Repeticao;

/* Escreva um algoritmo em Java, que leia 2 números inteiros via teclado,
 *  onde o primeiro número deve ser menor do que o segundo número. Caso contrário,
 *   deve ser exibida uma mensagem na tela informando que o intervalo é inválido e sair do programa. 
    Dentro do intervalo informado, mostre na tela todes os números que são múltiplos de 3 e 5.*/

import java.util.Scanner;

public class exercicio_for_01 {

	public static void main(String[] args) {
 
		int num1,num2,x; 
		
		Scanner read = new Scanner(System.in);
		System.out.println("\n Digite um número: ");
		num1 = read.nextInt(); 
		System.out.println("\n Digite um número maior que o primeiro número: ");
		num2 = read.nextInt(); 	
		
		if (num1<num2) 
		{
		for (x=num1;x<=num2;x++) {
				
		if (x % 3==0 && x % 5==0) {
			System.out.println("\n" +x+" é multiplo de 3 e 5 " );
		} 
		} 
		} else {
			System.out.println("\n Intervalo Invalido ");
}
		

		
	}

}
