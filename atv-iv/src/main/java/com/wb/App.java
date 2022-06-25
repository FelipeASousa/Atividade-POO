package com.wb;

import java.util.Calendar;
import java.util.List;
import java.util.ArrayList;

import com.wb.io.Entrada;
import com.wb.modelo.*;
import com.wb.negocio.Cadastro;
import com.wb.negocio.CadastroCliente;
import com.wb.negocio.CadastroConsumo;
import com.wb.negocio.CadastroProduto;
import com.wb.negocio.CadastroServico;
import com.wb.negocio.Listagem;
import com.wb.negocio.ListarTodosClientes;
import com.wb.negocio.ListarTodosProdutos;
import com.wb.negocio.ListarTodosServicos;
import com.wb.negocio.listas.ListaTop10Consomem;
import com.wb.negocio.listas.ListarMaisConsumido;
import com.wb.negocio.listas.ListarMaisConsumidoGenero;
import com.wb.negocio.listas.ListarPorGenero;
import com.wb.negocio.listas.ListarTop5MaisGastam;
import com.wb.negocio.listas.ListasCliente;


public class App {
	public static void main(String[] args) {
		
		System.out.println("Bem-vindo ao cadastro de clientes do Grupo World Beauty");
		Empresa empresa = new Empresa();
		Cadastro cadastre = new CadastroCliente(empresa.getClientes());
		cadastre.clientesCadastrados();
		Cadastro cadastreProdutos = new CadastroProduto(empresa.getProdutos());
		cadastreProdutos.produtosCadastrados();
		Cadastro cadastreServicos = new CadastroServico(empresa.getServicos());
		cadastreServicos.servicosCadastrados();
		boolean execucao = true;
		while (execucao) {
			System.out.println("Que tipo de operação você deseja fazer:");
			System.out.println("1 - Cadastrar cliente");
			System.out.println("2 - Listar todos os clientes");
			System.out.println("3 - Cadastrar produto");
			System.out.println("4 - Listar todos os produtos");
			System.out.println("5 - Cadastrar serviço");
			System.out.println("6 - Listar todos os serviços disponíveis");
			System.out.println("7 - Registrar consumo do cliente:");
			System.out.println("8 - Estatisticas de Venda");
			System.out.println("0 - Sair");

			Entrada entrada = new Entrada();
			int operacao = entrada.receberNumeroInteiro();
			
			Listagem listagemProdutoServico;
			switch (operacao) {
			case 0:
				execucao = false;
				System.out.println("Até mais!\n");
				break;
			case 1:
				Cadastro cadastro = new CadastroCliente(empresa.getClientes());
				cadastro.cadastrar();
				break;
			case 2:
				Listagem listagem = new ListarTodosClientes(empresa.getClientes());
				listagem.listar();
				break;
			case 3:
				Cadastro cadastroProduto = new CadastroProduto(empresa.getProdutos());
				cadastroProduto.cadastrar();
			case 4:
				Listagem listagemProduto = new ListarTodosProdutos(empresa.getProdutos());
				listagemProduto.listar();
				break;
			case 5:
				Cadastro cadastroServico = new CadastroServico(empresa.getServicos());
				cadastroServico.cadastrar();
				break;
			case 6:
				Listagem listagemServico = new ListarTodosServicos(empresa.getServicos());
				listagemServico.listar();
				break;
			case 7:
				Cadastro cad = new CadastroConsumo(empresa.getClientes(), empresa.getProdutos(), empresa.getServicos());
				cad.cadastrar();
				break;
			case 8:
				System.out.println("---------- Estatísticas de Venda ----------");
				System.out.println("1 - Listar clientes por gênero");
				System.out.println("2 - Listar produtos e serviços que mais consumidos");
				System.out.println("3 - Listar produtos e serviços mais consumidos por gênero");
				System.out.println("4 - Listagem dos 10 clientes que menos consumiram produtos ou serviços");
				System.out.println("5 - Listagem dos 5 clientes que mais consumiram em valor, não em quantidade");
				System.out.println("6 - Listagem dos 10 clientes que mais consumiram produtos ou serviços");
				System.out.println("0 - Voltar");
				
				int acao = entrada.receberNumeroInteiro();
				Listagem lista;
				switch(acao) {
				case 0:
					break;
				case 1:
					//Genero
					lista = new ListarPorGenero(empresa.getClientes());
					lista.listar();
					break;
				case 2:
					listagemProdutoServico = new ListarMaisConsumido(empresa.getClientes(),empresa.getProdutos(),empresa.getServicos());
					listagemProdutoServico.listar();
					break;
				case 3:
					listagemProdutoServico = new ListarMaisConsumidoGenero(empresa.getClientes(),empresa.getProdutos(),empresa.getServicos());
					listagemProdutoServico.listar();
					break;
				case 4:
					lista = new ListaTop10Consomem(empresa.getClientes(),false);
					lista.listar();
					break;
				case 5:
					lista = new ListarTop5MaisGastam(empresa.getClientes());
					lista.listar();
					break;
				case 6:
					lista = new ListaTop10Consomem(empresa.getClientes(),true);
					lista.listar();
					break;
				default:
					break;
					
				}
				break;
			default:
				System.out.println("Operação não entendida");
			}
		}
	}
	
	
}