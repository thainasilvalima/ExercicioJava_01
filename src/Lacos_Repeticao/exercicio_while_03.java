package Lacos_Repeticao;

import java.util.Scanner;

public class exercicio_while_03 {

	public static void main(String[] args) {
 Scanner read = new Scanner(System.in);
 
 int numero, somaIdMenor=0, somaIdMaior=0; 
 System.out.println("\n Digite a idade");
 numero = read.nextInt(); 
 
 while (numero>=0) {
	 if (numero<21) { somaIdMenor++;
	 } if (numero>50) {somaIdMaior++; 
	 } 
	 System.out.println("\n Digite a idade: ");
	 numero = read.nextInt();
	 
 } System.out.println("\n Total de pessoa maiores de 50 anos: " + somaIdMaior);
   System.out.println("\n Total de pessoa maiores de 21 anos: " + somaIdMenor);
      

}

}
