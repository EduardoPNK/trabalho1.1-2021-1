package br.edu.unidep.crud;

import br.edu.unidep.interfaces.Repository;

public class ClienteCrud implements Repository {
	

	@Override
	public void salvar() {
		System.out.println("Salvar Cliente");
		
	}

	@Override
	public void alterar() {
		System.out.println("Alterar Cliente");
		
	}

	@Override
	public void excluir() {
		System.out.println("Excluir Cliente");
		
	}

	@Override
	public void ler() {
		System.out.println("Lendo Cliente");
		
	}


}


