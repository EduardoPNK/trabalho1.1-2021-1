package br.edu.unidep.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.edu.unidep.crud.ClienteCrud;
import br.edu.unidep.models.Cliente;

public class CadastroCliente {
	private static List<Cliente> clientes = new ArrayList<Cliente>();
	
	final ClienteCrud crud;
	
	public CadastroCliente(ClienteCrud crud) {
		this.crud = crud;
	}
	
	Scanner scanner = new Scanner(System.in);
	public void cadastrarCliente() {
		int opcao = 0;
		while(opcao == 0){
		Cliente cliente = new Cliente();
		System.out.println("Iniciando cadastro de clientes");
		System.out.println("Informe o nome:");
		cliente.setNome(scanner.next());
		System.out.println("Informe o Cpf");
		cliente.setCpf(scanner.next());
		System.out.println("Informe a idade");
		cliente.setIdade(scanner.nextInt());
		System.out.println("Informe o credito");
		cliente.setCredito(scanner.nextDouble());
		cliente.gerarId();
		System.out.println(cliente);
		crud.salvar();
		clientes.add(cliente);
		System.out.println("-------------------------");
		System.out.println("0 para recomeçar cadastro");
		System.out.println();
		System.out.println("1 para parar de cadastrar");
		opcao = scanner.nextInt();
		if(opcao == 0) {
			System.out.println("Cadastro recomeçando");}
			else {
			System.out.println("Cadastro finalizado");
			break;}
		}
		scanner.close();
	}
	public void alterarCliente() {
		crud.alterar();
	}
	public void excluirCliente() {
		crud.excluir();
	}
	public void lerCliente() {
		crud.ler();
	}
	
	public static List<Cliente> lerTodos() {
		return clientes;
	}
}