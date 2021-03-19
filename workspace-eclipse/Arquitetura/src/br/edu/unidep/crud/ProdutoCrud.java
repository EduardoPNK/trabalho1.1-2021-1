package br.edu.unidep.crud;

import br.edu.unidep.interfaces.Repository;

public class ProdutoCrud implements Repository {

	@Override
	public void salvar() {
		System.out.println("Salvar Produto");
		
	}

	@Override
	public void alterar() {
		System.out.println("Alterar Produto");
		
	}

	@Override
	public void excluir() {
		System.out.println("Excluir Produto");
		
	}

	@Override
	public void ler() {
		System.out.println("Ler Produto");
		
	}

}
