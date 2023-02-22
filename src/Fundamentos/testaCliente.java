package Fundamentos;

public class testaCliente {
	public static void main(String[] args) {
		
		//instanciando um objeto da classe Cliente
		
		Cliente clt1 = new Cliente ("Jake Peralta","jkindomavel@gmail.com",123456789,"brooklyn 99 NY",160455789-90, "Detetive");
		clt1.visualizar();
		
		Cliente clt2 = new Cliente("Rosa Diaz","rosabraba@gmail.com", 987654321, "manhatan 99 NY", 134897867-10,"Policial");
		clt2.visualizar();

	
	}	

}
