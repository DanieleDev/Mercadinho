package Compra;

public class Pessoa {
	
	private String nome;
	private int idade;
	private int cpf;
	
	@Override
	public String toString() {
		return " Nome: " + nome + ", idade: " + idade + ", cpf:" + cpf;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	
}
