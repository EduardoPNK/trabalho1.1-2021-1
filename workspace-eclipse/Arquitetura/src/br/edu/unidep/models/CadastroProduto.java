package br.edu.unidep.models;

import java.util.Scanner;

import br.edu.unidep.crud.ProdutoCrud;

public class CadastroProduto {
	final ProdutoCrud crud;
	
	public CadastroProduto(ProdutoCrud crud) {
		this.crud = crud;
	}
	
	public void cadastrarProduto() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		Produto produto = new Produto();
		System.out.println("Informe o nome do produto:");
		produto.setNome(scanner.nextLine());
		System.out.println("Informe a marca:");
		produto.setMarca(scanner.nextLine());
		System.out.println("Informe o preço:");
		produto.setPreco(scanner.nextInt());
		crud.salvar();
		System.out.println(produto);
	}
	public void alterarProduto() {
		crud.alterar();
	}
	public void excluirProduto() {
		crud.excluir();
	}
	public void lerProduto() {
		crud.ler();
	}
}
