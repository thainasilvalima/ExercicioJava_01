package EstruturaDados;

import java.util.LinkedList;
import java.util.Queue;

/*Escreva um programa Java contendo uma Collection Queue (Fila) de Objetos da Classe String,
 *para organizar a ordem de chegada dos Clientes de um Banco. O programa deverá ter um Menu que aceitará as opções 0, 1, 2 e 3:
1: Adicionar um novo Cliente na fila. Deve solicitar o nome do Cliente.
2: Listar todos os Clientes na fila
3: Chamar (retirar) uma pessoa da fila 
0: O programa deve ser finalizado. 
Caso a fila esteja vazia, o programa deverá informar que a fila está vazia ao tentar retirar (chamar) um cliente da fila..
*/

public class ArrayList01 {

	public static void main(String[] args) {

		 Queue<String> fila = new LinkedList<String>();
		 int i;
		 
		 for ( i =0 ;i<=10;i++) {
			 
		 } fila.addAll(i);
	}

}
