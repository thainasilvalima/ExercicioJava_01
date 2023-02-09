package Lacos_Condicionais;


/* Para doar sangue é necessário ter entre 18 e 69 anos de idade. Pessoas com idade entre 60 e 69 anos,
 *  só podem doar se não for a sua primeira doação. Escreva um Algoritmo em Java que obtenha via teclado 
 *  o nome do doador (String), a idade (inteiro) do doador e se já fez outras doações (boolean). De acordo 
 *  com as Regras para a doação, mostre na tela se o doador está Apto ou Não Apto para doar sangue.
*/

import java.util.Scanner;

public class If_else3 {

	public static void main(String[] args) {
	Scanner read3 = new Scanner(System.in);
	
	String nome; 
	int idade;
	boolean doadorAtivo;
	
	
	System.out.println("\n Qual nome do(a) doador(a)? ");
	nome = read3.next();
	System.out.println("\n Qual a idade do(a) doador(a) ");
	idade = read3.nextInt();
	
	
	if (idade>=18 && idade<=60) { System.out.println("\n Apto a doar sangue!! ");		
	}
	
	else { System.out.println("\n Não esta apto a doar sangue!!");
	}
	
	if  (idade>=60 && idade<=69) { System.out.println("\n É um(a) doador(a) ativo? ");
	doadorAtivo = read3.nextBoolean();
	}
	
	
	}

}
