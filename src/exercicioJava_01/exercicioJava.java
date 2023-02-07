package exercicioJava_01;

import java.util.Scanner;

public class exercicioJava {
	
                  //exercicio01
	public static void main(String[] args) {
    Scanner s= new Scanner (System.in);
    
  float salario,abono,novoSalario;
    
    System.out.println("Digite o salário: ");
    salario = s.nextFloat();
   System.out.println("Digite o abono: ");
    abono = s.nextFloat();
    
    novoSalario = salario + abono; 
    System.out.printf("Valor do novo salário: %.2f",novoSalario);
    
                       //exercicio02
    double nota1,nota2,nota3,nota4,media; 
    
    System.out.println("Digite a primeira nota ");
    nota1 = s.nextFloat();
    System.out.println("Digite a segunda nota ");
    nota2 = s.nextFloat();
    System.out.println("Digite a terceira nota ");
    nota3 = s.nextFloat();
    System.out.println("Digite a quarta nota ");
    nota4 = s.nextFloat();
    
    media = (nota1+nota2+nota3+nota4) /4;
    System.out.printf("Media do aluno: %.1f",media);
    
    
    
    
	}

}
