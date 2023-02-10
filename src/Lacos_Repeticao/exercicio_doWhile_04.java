package Lacos_Repeticao;

/*Escreva um algoritmo em Java, que leia números inteiros via teclado,
 * até que o número zero seja digitado. Ao final, mostre na tela a soma 
 * de todos os números digitados, que sejam positivos.*/

import java.util.Scanner;

public class exercicio_doWhile_04 {

	public static void main(String[] args) {
    Scanner read = new Scanner(System.in);

    int num, soma =0;
    
    System.out.println("\n Digite números inteiro. Para encerrar, digite 0: ");
    num = read.nextInt();
    
    do {
    	if (num > 0 ) { soma += num;
    	
    	}
    	
    	 num = read.nextInt();
    	 
    } while (num != 0); 
       System.out.println("\nA Soma dos números positivos é:  " + soma);

    
    
    
	}

}
