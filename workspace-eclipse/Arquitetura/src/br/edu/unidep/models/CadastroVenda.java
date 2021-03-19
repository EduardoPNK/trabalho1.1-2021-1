package br.edu.unidep.models;

import java.util.Scanner;

import br.edu.unidep.crud.VendaCrud;

public class CadastroVenda {
	final VendaCrud crud;

	public CadastroVenda(VendaCrud crud) {
		this.crud = crud;
	}
	
	public void CadastrarVenda() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		Venda venda = new Venda();
		System.out.println("Informe a data da venda:");
		venda.setData(scanner.nextLine());
		System.out.println("Informe o id da venda:");
		venda.setId(scanner.nextInt());
		System.out.println(venda);
		crud.salvar();
	}
	public void alterarVenda() {
		crud.alterar();
	}
	public void excluirVenda() {
		crud.excluir();
	}
	public void lerVenda() {
		crud.ler();
	}
}
