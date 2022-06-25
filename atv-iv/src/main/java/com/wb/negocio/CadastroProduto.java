package com.wb.negocio;

import java.util.ArrayList;
import java.util.List;

import com.wb.io.Entrada;
import com.wb.modelo.Produto;

public class CadastroProduto extends Cadastro{
	private Entrada entrada;
	private List<Produto> produtos = new ArrayList<>();

	public CadastroProduto(List<Produto> produtos) {
		this.produtos = produtos;
		this.entrada = new Entrada();
	}
	
	@Override
	public void cadastrar() {
		System.out.println("Inicio do cadastro de produtos");
		System.out.println("Por favor informe o nome do produto: ");
		String nome = entrada.receberTexto();
		System.out.println("Por favor informe a quantidade de produtos: ");
		Integer quantidade = entrada.receberNumeroInteiro();
		System.out.println("Informe o valor do produto: ");
		double valor = entrada.receberNumeroDouble();
		Produto produto = new Produto(nome, quantidade, valor);
		this.produtos.add(produto);

	}

	@Override
	public void clientesCadastrados() {
		
	}

	Produto produto1 = new Produto("Shampoo",20, 15.00);
	Produto produto2 = new Produto("Condicionador",31, 15.00);
	Produto produto3 = new Produto("Sabonete",121, 4.00);
	Produto produto4 = new Produto("Esmalte",23, 4.00);
	Produto produto5 = new Produto("Lixa",6, 5.00);
	Produto produto6 = new Produto("Base",23, 30.00);
	Produto produto7 = new Produto("Batom",9, 23.00);
	Produto produto8 = new Produto("Tesoura",23, 15.00);
	Produto produto9 = new Produto("Alicate",54, 15.00);
	Produto produto10 = new Produto("Esponja",5, 15.00);
	Produto produto11 = new Produto("Creme de Pentear",15, 30.00);
	Produto produto12 = new Produto("Gel",13, 20.00);
	Produto produto13 = new Produto("Mousse",43, 34.00);
	Produto produto14 = new Produto("Lâmina",14, 5.00);
	Produto produto15 = new Produto("Creme de Barbear",31, 17.00);
	Produto produto16 = new Produto("Escova",1, 10.00);
	Produto produto17 = new Produto("Máquina de Cortar cabelo",11, 25.00);
	Produto produto18 = new Produto("Máscara",8, 43.00);
	Produto produto19 = new Produto("Hidratante",2, 30.00);
	Produto produto20 = new Produto("Protetor Solar",8, 30.00);
	
	public void produtosCadastrados() {
		this.produtos.add(produto1);
		this.produtos.add(produto2);
		this.produtos.add(produto3);
		this.produtos.add(produto4);
		this.produtos.add(produto5);
		this.produtos.add(produto6);
		this.produtos.add(produto7);
		this.produtos.add(produto8);
		this.produtos.add(produto9);
		this.produtos.add(produto10);
		this.produtos.add(produto11);
		this.produtos.add(produto12);
		this.produtos.add(produto13);
		this.produtos.add(produto14);
		this.produtos.add(produto15);
		this.produtos.add(produto16);
		this.produtos.add(produto17);
		this.produtos.add(produto18);
		this.produtos.add(produto19);
		this.produtos.add(produto20);

		
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
