package br.edu.unidep.models;

public class Produto {
	
	private double preco;
	private String nome;
	private String marca;
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	@Override
	public String toString() {
		return "Produto [preco=" + preco + ", nome=" + nome + ", marca=" + marca + "]";
	}

}
