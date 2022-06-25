package com.wb.negocio;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.wb.io.Entrada;
import com.wb.modelo.Cliente;
import com.wb.modelo.Produto;
import com.wb.modelo.Servico;

public class CadastroConsumo extends Cadastro{
	private Entrada entrada;
	private List<Cliente> clientes;
	private List<Produto> produtos;
	private List<Servico> servicos;

	public double valorFinal = 0;

	public CadastroConsumo(List<Cliente> clientes , List<Produto> produtos, List<Servico> servicos) {
		this.clientes = clientes;
		this.produtos = produtos;
		this.servicos = servicos;
	}

	@Override
	public void cadastrar() {
		System.out.println("Realizando cadastro de consumo");
		while(true) {
			entrada = new Entrada();
			System.out.println("Informe o cpf ou o nome do cliente: ");
			String nomeCpf = entrada.receberTexto();
			
			Cliente cliente = null;
			for(Cliente client: clientes) {
				if(client.nome.compareTo(nomeCpf) == 0 || client.getCpf().getValor().compareTo(nomeCpf) == 0) {
					cliente = client;
					}
			}
			if(Objects.isNull(cliente)) {
				System.out.println("Esse cliente não foi encontrado no sistema! Quer tentar novamente?");
				System.out.println("1 - Sim");
				System.out.println("0 - Não");
				int novamente = entrada.receberNumeroInteiro();
				
				if(novamente == 1)
					continue;
			}
			if(AdicionarConsumo(cliente,0) == 0)
				break;
		}
	}
	List<Produto> produtosUsados = new ArrayList<>();
	List<Servico> servicosUsados = new ArrayList<>();
	List<Integer> qtdProdutos = new ArrayList<>();
	List<Integer> qtdServicos = new ArrayList<>();

	double valorTotal = 0;
	private int AdicionarConsumo(Cliente cliente, int type) {

		String nome;
		int quantidade;
		Entrada entrada = new Entrada();
		if(type == 1) {
			System.out.println("Digite o nome do produto: ");
			nome = entrada.receberTexto();		
			System.out.println("Digite a quantidade de produto utilizado: ");
			quantidade = entrada.receberNumeroInteiro();
			qtdProdutos.add(quantidade);
			cliente.setQtdProdutos(quantidade);
			for(Produto produto: produtos) {
				if(produto.equals(nome)) {
					produtosUsados.add(produto);
					valorTotal += (quantidade*produto.getValor());
					break;
					}
			}
			
			System.out.println("Adicionado com sucesso! Gostaria de adicionar mais um produto?");
			System.out.println("1 - Sim");
			System.out.println("2 - Não");
			
			int novamente = entrada.receberNumeroInteiro();
			if(novamente == 1)
				return AdicionarConsumo(cliente,1);
			cliente.setProdutosConsumidos(produtosUsados);
			return AdicionarConsumo(cliente,0);
		}	
		else if(type == 2) {
			System.out.println("Informe o nome do serviço: ");
			nome = entrada.receberTexto();
			System.out.println(nome);
			System.out.println("Informe a quantidade de vez que esse produto foi utilizado: ");
			quantidade = entrada.receberNumeroInteiro();
			qtdServicos.add(quantidade);
			cliente.setQtdServicos(quantidade);

			for(Servico servico: servicos) {
				if(servico.equals(nome)) {
					valorTotal += (quantidade * servico.getValor());
					servicosUsados.add(servico);
					break;
				}

			}

			System.out.println("Adicionado com sucesso! Gostaria de adicionar mais um serviço?");
			System.out.println("1 - Sim");
			System.out.println("2 - Não");
			
			int novamente = entrada.receberNumeroInteiro();
			if(novamente == 1)
				return AdicionarConsumo(cliente,2);
			cliente.setServicosConsumidos(servicosUsados);
			return AdicionarConsumo(cliente,0);
		}
		
		System.out.println("Adicionar um produto/serviço a um cliente");
		System.out.println("(Cliente: " + cliente.nome + ")");
		
		System.out.println("1 - Adicionar um produto");
		System.out.println("2 - Adicionar um serviço");
		System.out.println("0 - Voltar ao início");
		
		cliente.setValorTotal(valorTotal);
		int acao = entrada.receberNumeroInteiro();
		int flag = 0;
		switch(acao) {
		case 0:
			System.out.println("__________ Nota Fiscal ________________");
			System.out.println("|Nome: " + cliente.nome);
			System.out.println("|CPF:" + cliente.getCpf().getValor());
			System.out.println("|======================================");
			System.out.println("|Consumos");
			if(!produtosUsados.isEmpty()) {
				for(Produto produto: cliente.getProdutosConsumidos()) {
					System.out.println("|"+qtdProdutos.get(0) +"x" +produto.getNome() +"------------ R$"+qtdProdutos.get(0) * produto.getValor()+"0");
					qtdProdutos.remove(0);
				}
			}
			if(!servicosUsados.isEmpty()) {
				for(Servico servico : cliente.getServicosConsumidos()) {
					System.out.println("|"+qtdServicos.get(0)+"x"+servico.getNome() +"------------ R$"+qtdServicos.get(0) * servico.getValor()+"0");
					qtdServicos.remove(0);
				}
			}
			System.out.println("|......................................");
			System.out.println("|VALOR TOTAL ------------------R$" + cliente.getValorTotal()+"0");
			System.out.println("|_______________________________________");
			break;
		case 1:
			flag = AdicionarConsumo(cliente,1);
			break;
		case 2:
			flag = AdicionarConsumo(cliente,2);
			
			break;
		default:
			System.out.println("Operação não entendida!");
		}
		return flag;
	}

	@Override
	public void clientesCadastrados() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void produtosCadastrados() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void servicosCadastrados() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void consumosCadastrados() {
		// TODO Auto-generated method stub
		
	}
	
	
}
