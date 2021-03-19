//O sistema deve ser simples, onde o usuário possa cadastrar, excluir e alterar( em memória apenas)
//clientes, funcionários e produtos, e também seja possível realizar as mesmas operações com as vendas


package br.edu.unidep.main;
import java.util.List;
import java.util.Scanner;

import br.edu.unidep.crud.ClienteCrud;
import br.edu.unidep.crud.FuncionarioCrud;
import br.edu.unidep.crud.ProdutoCrud;
import br.edu.unidep.crud.VendaCrud;
import br.edu.unidep.models.CadastroCliente;
import br.edu.unidep.models.CadastroFuncionario;
import br.edu.unidep.models.CadastroProduto;
import br.edu.unidep.models.CadastroVenda;
import br.edu.unidep.models.Cliente;

@SuppressWarnings("unused")
public class Main {	
	public static void main(String[] args) {
		int opcao = 0;
		Scanner menuScan = new Scanner(System.in);
		while(opcao == 0) {
			System.out.println("------------------------------");
			System.out.println("MENU:");
			System.out.println("Selecione uma opção: \n"
					+ "0 - Cadastrar\n"
					+ "1 - Alterar\n"
					+ "2 - Excluir\n"
					+ "3 - Ler\n"
					+ "4 - Sair");
			int opcaoMenu;
			opcaoMenu = menuScan.nextInt();
			if(opcaoMenu == 0) {
				System.out.println("");
				System.out.println("Cadastrar quem? \n 0 - Cliente \n 1 - Funcionario \n 2 - Produto \n 3 - Venda");
				opcaoMenu = menuScan.nextInt();
				if(opcaoMenu == 0) {
					CadastroCliente cadastroCliente = new CadastroCliente(new ClienteCrud());
					cadastroCliente.cadastrarCliente();
				}
				else if(opcaoMenu == 1) {
					CadastroFuncionario cadastroFuncionario = new CadastroFuncionario(new FuncionarioCrud());
					cadastroFuncionario.cadastrarFuncionario();
					}
				else if(opcaoMenu == 2) {
					CadastroProduto cadastroProduto = new CadastroProduto(new ProdutoCrud());
					cadastroProduto.cadastrarProduto();
				}
				else if(opcaoMenu == 3){
					CadastroVenda cadastroVenda = new CadastroVenda(new VendaCrud());
					cadastroVenda.CadastrarVenda();
				}}
			else if(opcaoMenu == 1) {
				System.out.println("");
				System.out.println("Alterar quem? \n 0 - Cliente \n 1 - Funcionario \n 2 - Produto \n 3 - Venda");
				opcaoMenu = menuScan.nextInt();
				if(opcaoMenu == 0) {
					CadastroCliente cadastroCliente = new CadastroCliente(new ClienteCrud());
					cadastroCliente.alterarCliente();
				}
				else if(opcaoMenu == 1) {
					CadastroFuncionario cadastroFuncionario = new CadastroFuncionario(new FuncionarioCrud());
					cadastroFuncionario.alterarFuncionario();
					}
				else if(opcaoMenu == 2) {
					CadastroProduto cadastroProduto = new CadastroProduto(new ProdutoCrud());
					cadastroProduto.alterarProduto();
				}
				else if(opcaoMenu == 3){
					CadastroVenda cadastroVenda = new CadastroVenda(new VendaCrud());
					cadastroVenda.alterarVenda();
				}}
			else if(opcaoMenu == 2) {
				System.out.println("");
				System.out.println("Excluir quem? \n 0 - Cliente \n 1 - Funcionario \n 2 - Produto \n 3 - Venda");
				opcaoMenu = menuScan.nextInt();
				if(opcaoMenu == 0) {
					CadastroCliente cadastroCliente = new CadastroCliente(new ClienteCrud());
					cadastroCliente.excluirCliente();
				}
				else if(opcaoMenu == 1) {
					CadastroFuncionario cadastroFuncionario = new CadastroFuncionario(new FuncionarioCrud());
					cadastroFuncionario.excluirFuncionario();
					}
				else if(opcaoMenu == 2) {
					CadastroProduto cadastroProduto = new CadastroProduto(new ProdutoCrud());
					cadastroProduto.excluirProduto();
				}
				else if(opcaoMenu == 3){
					CadastroVenda cadastroVenda = new CadastroVenda(new VendaCrud());
					cadastroVenda.excluirVenda();
				}}
			else if(opcaoMenu == 3) {
				System.out.println("");
				System.out.println("Ler quem? \n 0 - Cliente \n 1 - Funcionario \n 2 - Produto \n 3 - Venda");
				opcaoMenu = menuScan.nextInt();
				if(opcaoMenu == 0) {
					CadastroCliente cadastroCliente = new CadastroCliente(new ClienteCrud());
					cadastroCliente.lerCliente();;
				}
				else if(opcaoMenu == 1) {
					CadastroFuncionario cadastroFuncionario = new CadastroFuncionario(new FuncionarioCrud());
					cadastroFuncionario.lerFuncionario();
					}
				else if(opcaoMenu == 2) {
					CadastroProduto cadastroProduto = new CadastroProduto(new ProdutoCrud());
					cadastroProduto.lerProduto();
				}
				else if(opcaoMenu == 3){
					CadastroVenda cadastroVenda = new CadastroVenda(new VendaCrud());
					cadastroVenda.lerVenda();
				}}
			else if(opcaoMenu == 4) {
				menuScan.close();
				break;
			}
		}
	}
}
