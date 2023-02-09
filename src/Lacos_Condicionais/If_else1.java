/*Faça um algoritmo em Java que leia 3 valores inteiros A, B e C e imprima na tela se a soma de A + B é maior, 
 * menor ou igual a C.Na construção do Algoritmo, utilize os seguintes conteúdos:Entrada e Saída de dados, 
 *  Operadores, Laço Condicional IF.*/

package Lacos_Condicionais;

import java.util.Scanner;

public class If_else1 {
public static void main(String[] args) {
Scanner read =  new Scanner(System.in);

double a,b,c,soma;

 System.out.println("\nDigite o primeiro número:  ");
 a = read.nextDouble();
 System.out.println("\nDigite segundo número:  ");
 b = read.nextDouble();
 System.out.println("\nDigite o terceiro número:  ");
 c = read.nextDouble();
 
 soma = a+b; System.out.printf("\n Valor é: %.1f",soma); 
  
  if (soma==c) {
  System.out.printf("\n O valor é igual");
  }
  else if (soma>c) {
  System.out.printf("\n Valor maior");   
  }
  else {
  System.out.printf("\n Valor é menor"); 
  }
	  
  }
 
		 
	}


