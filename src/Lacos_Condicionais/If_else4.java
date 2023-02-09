package Lacos_Condicionais;

/* Escreva um algoritmo em Java, que leia 3 palavras (String), que definem as características 
 * de um tipo de animal possível segundo o diagrama abaixo, que deve ser lido da esquerda para a direita.
 * Em seguida, mostre na tela qual dos animais foi escolhido.*/

import java.util.Scanner;

public class If_else4 {

	public static void main(String[] args) {
	Scanner read4 = new Scanner(System.in);
		
	String tipo1, tipo2, tipo3; 
		
	System.out.println("\n Digite a primeira palavra:  ");
	tipo1 = read4.next();
	System.out.println("\n Digite a segunda palavra: ");
	tipo2 = read4.next();
	System.out.println("\n Digite a terceira palavra: ");
	tipo3 = read4.next();
		
	//if da 1 caracteristica
	if( tipo1.equalsIgnoreCase("vertebrado")) {
		if( tipo2.equalsIgnoreCase("ave")) {
			if (tipo3.equalsIgnoreCase("carnivoro")) {
				System.out.println("\n é uma aguia");	
 
	} 
	 else {
		 System.out.println("\n é um pombo");
		 }
	}	
		else { 
			if (tipo3.equalsIgnoreCase("onivoro")) {
			System.out.println("\n é um ser humano");
		} 
			else { 
			System.out.println("\n é uma vaca");
			}
		}
	}
		else { 
			if  (tipo2.equalsIgnoreCase("inseto")) {
			if	(tipo3.equalsIgnoreCase("\n hematografo")){
					System.out.println("\n é uma pulga");
         } else {
        	 System.out.println("\n é uma lagarta");
         }
         } else {
        	 if (tipo3.equalsIgnoreCase("hematofago")) {
        		 System.out.println("\n é uma sanguessuga");
        	 } else {
        		 System.out.println("\né uma minhoca ");
        	 }
         }
       }
		
    } 
 }
		
		
		
	

    
