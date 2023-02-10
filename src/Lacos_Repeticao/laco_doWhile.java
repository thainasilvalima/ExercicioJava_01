package Lacos_Repeticao;

import java.util.Scanner;

public class laco_doWhile {

	public static void main(String[] args) {
 
		int tabuada, x=1, res; 
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n Entre com a tabuada: ");
		tabuada = leia.nextInt();
		
		do {
			res = tabuada * x;
			System.out.println("\n" + tabuada + "x" + x + " = " + res);
			x++;
		} while (x<=10);
	}    
}
