package br.edu.unidep.models;

public abstract class Pessoa {
	protected int id;
	protected String nome;
	protected String cpf;
	protected int idade;
	
	public int getId() {
		return id;
	}
	public int setId(int id) {
		return this.id = id;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String mudarCpf(String cpf) {
		return this.cpf = cpf;
	}
	
	public String mudarNome(String nome) {
		return this.nome = nome;
	}

	public abstract int gerarId();

	
}
