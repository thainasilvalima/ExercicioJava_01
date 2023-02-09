package Lacos_Condicionais;

import java.util.Scanner;

public class switch5 {

	public static void main(String[] args) {
     Scanner read5 = new Scanner(System.in); 
     
		int cod,quant,valor; 
		System.out.println("\n Lanchonete Generation");
		System.out.println("\n  Codigo 1 - Cachorro-quente - R$10,00");
		System.out.println("\n  Codigo 2 - X Salada - R$15,00");
		System.out.println("\n  Codigo 3 - x Bacon - R$18,00");
		System.out.println("\n  Codigo 4 - Bauru - R$ 12,00 ");
		System.out.println("\n  Codigo 5 - Refrigerante - R$ 8,00");
		System.out.println("\n  Codigo 6 - Suco de Laranja - R$13,00");
		System.out.println("\nDigite o código do produto");
		cod = read5.nextInt(); 
		System.out.println("\nDigite a quantidade do produto");
		quant = read5.nextInt(); 
		
		switch(cod) {
		case 1: valor = quant*10; System.out.println("\n Cachorro-quente valor a pagar R$"+ valor);
		break;
		case 2: valor = quant*15; System.out.println("\n X Salada valor a pagar R$" +valor);
		break;
		case 3: valor = quant*18; System.out.println("\n X Bacon  valor a pagar R$"+valor);
		break;
		case 4: valor = quant*12; System.out.println("\n Bauru valor a pagar R$"+valor);
		break;
		case 5: valor = quant*8; System.out.println("\n Refrigerante valor a pagar R$" +valor);
		break;
		case 6: valor = quant*13; System.out.println("\n Suco de Laranja  valor a pagar R$" +valor);
		break;
		default: System.out.println("\nCódigo Invalido");
		
		}
        }
        }