package br.edu.unidep.models;

import java.util.Scanner;

import br.edu.unidep.crud.FuncionarioCrud;

public class CadastroFuncionario {
	final FuncionarioCrud crud;
	
	public CadastroFuncionario(FuncionarioCrud crud) {
		this.crud = crud;
	}
	public void cadastrarFuncionario() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		Funcionario funcionario = new Funcionario();
		funcionario.gerarId();
		System.out.println("Informe o nome do funcionario:");
		funcionario.setNome(scanner.nextLine());
		System.out.println("Informe o cpf:");
		funcionario.setCpf(scanner.nextLine());
		System.out.println("Informe a idade");
		funcionario.setIdade(scanner.nextInt());
		System.out.println("Informe o salario");
		funcionario.setSalario(scanner.nextInt());
		crud.salvar();
		System.out.println(funcionario);
	}
	public void alterarFuncionario() {
		crud.alterar();
	}
	public void excluirFuncionario() {
		crud.excluir();
	}
	public void lerFuncionario() {
		crud.ler();
	}

}
