package Exercicios_extras;

import java.util.Scanner;

public class ExerciciosExtras_02 {

	public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    
    float num, numPar =0,numImpar=0,y; 
    
    System.out.println("\n Digite um número: ");
    num = read.nextFloat();
    
    for (y= 0; y <10; y++) { System.out.println("\n Digite um número: ");
                             num = read.nextFloat();
    
         if (y %2==0) { numPar++;
        	 
         } else { numImpar++;
        	 
         }
    	
    } System.out.println("\n Números pares: " + numPar);
      System.out.println("\n Números impares: " + numImpar);
	} 

}
