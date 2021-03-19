package br.edu.unidep.crud;

import br.edu.unidep.interfaces.Repository;

public class VendaCrud implements Repository{

	@Override
	public void salvar() {
		System.out.println("Salvar Venda");
		
	}

	@Override
	public void alterar() {
		System.out.println("Alterar Venda");
		
	}

	@Override
	public void excluir() {
		System.out.println("Excluir Venda");
		
	}

	@Override
	public void ler() {
		System.out.println("Ler Venda");
		
	}

}
