package EstruturaDados;

import java.util.Scanner;
import java.util.Stack;
import java.util.Iterator;


public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        Stack<String> pilha = new Stack<String>();

        int opc;
        String titulo;

        while (true); {

            System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Adicionar Livro na pilha             ");
			System.out.println("            2 - Listar todos os Livros               ");
			System.out.println("            3 - Retirar Livro da pilha               ");
			System.out.println("            0 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("            Entre com a opção desejada:              ");
            System.out.println("                                                     ");

            opc = reader.nextInt();

            if (opc ==0) {
                System.out.println("\nPrograma Finalizado");
                reader.close();
                System.exit(0);
            }

            switch (opc) {
            case 1: System.out.println("\nAdicionar Livro");
                 System.out.println("\nDigite o nome do livro ");
                 leia.skip("\\R?");
                 pilha.push("titulo");
                 System.out.println("\nLivro adicionado ");
                    
                break;
            case 2: System.out.println("\nListar todos os livros");
                
                    System.out.println("\nLivros: ");
                    Iterator<String> iter = pilha.iterator();

                    while (iter.hasNext()) {
                        System.out.println(iter.next());
                    }
                break;
                    
            case 3: System.out.println("\nRetirar Livro da pilha");
                if (pilha.isEmpty())
                System.out.println("\nA pilha está vazia");
                else pilha.pop();
                System.out.println("\nLivro removido da pilha");
                break;

                default: 
                System.out.println("\nOpção inválida");
                    break;
            }


        }


    }
    
}
