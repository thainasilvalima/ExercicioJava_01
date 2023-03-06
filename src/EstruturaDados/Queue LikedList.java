public class Main {
    
    import java.util.Iterator;
    import java.util.Scanner;
    import java.util.LinkedList;

    public static void name(String []) args throws IOException {

        Scanner read = new Scanner(System.in);

        Queue<String> lista = new LinkedList<String>();

        int opc;
        String titulo;
        
        while(true){

        System.out.println("*****************************************************");
			System.out.println("                                                 ");
			System.out.println("            1 - Adicionar Cliente na Fila        ");
			System.out.println("            2 - Listar todos os Clientes         ");
			System.out.println("            3 - Retirar cliente da fila          ");
			System.out.println("            0 - Sair                             ");
			System.out.println("                                                 ");
			System.out.println("*************************************************");
			System.out.println("           Entre com a opção desejada:           ");
			System.out.println("                                                 ");

            opc = read.nextInt();

            if (opc == 0) {
                System.out.println("\n Programa Finalizado");
                read.close();
                System.exit(0);
            }
            switch (opc) {
            case 1: System.out.println("\n Adicionar cliente na fila");
            read.skip("\\R?");
            titulo = read.nextLine();
            lista.push(titulo);

            System.out.println("\n Cliente adicionado!");               
            break;

            case 2: System.out.println("\n Listar todos os Clientes" );
            Iterator <String> iter = lista.iterator();
            while (iter.hasNext()) {
                System.out.println(iter.next());
            }
            break;

            case 3: System.out.println("\n Retirar cliente da fila");
            if (lista.isEmpty())
            System.out.println("\n Nenhum cliente na fila");
            else lista.pop();
            System.out.println("\n Cliente retirado!");
            break;
            default: System.out.println("\n Opção inválida!");
            break;
            }            
        }   
    } 
}