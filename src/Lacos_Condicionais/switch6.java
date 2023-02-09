package Lacos_Condicionais;

import java.util.Scanner;

public class switch6 {

	public static void main(String[] args) {
  Scanner read6 = new Scanner(System.in); 
  
  String nome;
  int cod;
  double salario,novoSalario;
  
  System.out.println("\n Codigo 1 - Gerente ");
  System.out.println("\n Codigo 2 - Vendedor ");
  System.out.println("\n Codigo 3 - Supervisor ");
  System.out.println("\n Codigo 4 - Motorista ");
  System.out.println("\n Codigo 5 - Estoquista ");
  System.out.println("\n Codigo 6 - Tecnico de TI ");
  System.out.println("\n Qual o nome do Colaborador ");
  nome = read6.next(); 
  System.out.println("\n Qual o código do Cargo? ");
  cod = read6.nextInt(); 
  System.out.println("\n Qual o salário? ");
  salario = read6.nextDouble();
	

	
	switch(cod) { 
	case 1:novoSalario = salario + (0.10 * salario); System.out.printf("\n o Novo Salario é: R$ %.2f",novoSalario);
	break;
	case 2:novoSalario = salario + (0.7 * salario); System.out.printf("\n o Novo Salario é: R$%.2f",novoSalario);
	break;
	case 3:novoSalario = salario + (0.9 * salario); System.out.printf("\n o Novo Salario é: R$%.2f",novoSalario);
	break;
	case 4:novoSalario = salario + (0.6 * salario); System.out.printf("\n o Novo Salario é: R$%.2f",novoSalario);
	break;
	case 5:novoSalario = salario + (0.5 * salario); System.out.printf("\n o Novo Salario é: R$%.2f",novoSalario);
	break;
	case 6:novoSalario = salario + (0.8 * salario); System.out.printf("\n o Novo Salario é: R$%.2f",novoSalario);
	break;
	default: System.out.printf("\n Cargo Inexistente");
	}
	} 

}
