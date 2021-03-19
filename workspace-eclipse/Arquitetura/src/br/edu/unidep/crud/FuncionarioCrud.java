package br.edu.unidep.crud;
import br.edu.unidep.interfaces.Repository;

public class FuncionarioCrud implements Repository {

	@Override
	public void salvar() {
		System.out.println("Salvar Funcionario");
		
	}

	@Override
	public void alterar() {
		System.out.println("Alterar Funcionario");
		
	}

	@Override
	public void excluir() {
		System.out.println("Excluir Funcionario");
		
	}

	@Override
	public void ler() {
		System.out.println("Ler Funcionario");
		
	}

}
