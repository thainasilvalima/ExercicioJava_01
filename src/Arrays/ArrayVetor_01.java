package Arrays;
/*Dado um vetor contendo 10 números inteiros não ordenados e não repetidos, construa um algoritmo que consiga pesquisar dados no vetor,
 * onde o usuário irá digitar um número e o programa deve exibir na tela a posição deste número no vetor. Caso o número não seja encontrado,
 * a mensagem: “Não foi encontrado!” deve ser exibida na tela. */
import java.util.Scanner;

public class ArrayVetor_01 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		
		int num [] = new int [10];
		int x;
		
		for (  x = 0; x < 10; x ++) {
		System.out.println("\n Digite o número");
		num [x] = read.nextInt();
		}
		System.out.println("\n Digite o número para saber sua posição ");
		int i = read.nextInt();  
	
		for (x=0; x < 10; x ++) {
			if (i == num[x]) {
				int posicao = x +1;
				System.out.println("\n O número " + i + " está na posição " +x);
				 
			}
		}
		
	}

}
