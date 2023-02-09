package Lacos_Condicionais;

import java.util.Scanner;

/* Escreva um algoritmo em Java, que leia um número inteiro via teclado e mostre na tela uma mensagem
  indicando se este número é par ou ímpar e se o número é positivo ou negativo  Na construção do Algoritmo,
   utilize os seguintes conteúdos: Entrada e Saída de dados, Operadores, Laço Condicional IF.
*/

public class If_else2 {

	public static void main(String[] args) {
   Scanner read2 =  new Scanner(System.in);
   
   int it; 
   
   System.out.println("\nDigite um número inteiro:  ");
   it = read2.nextInt();
    
    
   
   if (it % 2 == 0) { 
    System.out.println("\n O Número par ");  
	}
   else {
	System.out.println("\nO número é impar ");
    }
    
   if(it > 0) {
    System.out.println("\nO número é positivo:  "); 
    }
	else { 
	System.out.println("\nO número é negativo:  ");
	}
   
	}

}
