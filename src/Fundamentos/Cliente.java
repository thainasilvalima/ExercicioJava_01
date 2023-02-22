package Fundamentos;

public class Cliente {

	//declaração de atributos da classe Cliente
	
	private String NomeCliente;
	private String email;
	private int telefone;
	private String endereco; 
	private int cpf;
	private String profissao;
	
	public Cliente(String nomeCliente, String email, int telefone, String endereco, int cpf, String profissao) {
		NomeCliente = nomeCliente;
		this.email = email;
		this.telefone = telefone;
		this.endereco = endereco;
		this.cpf = cpf;
		this.profissao = profissao;
	}
	

	public String getNomeCliente() {
		return NomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		NomeCliente = nomeCliente;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	public String getProfissao() {
		return profissao;
	}
	
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	public void visualizar() {
		System.out.println("\ncliente: " + NomeCliente + "\n\nemail: " + email + "\n\ntelefone: " + telefone + "\n\nendereço: " + endereco + "\n\ncpf: " + cpf + "\n\nprofissão: " + profissao + "\n\n");
	}
	
	
	
}
