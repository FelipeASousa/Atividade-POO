package com.wb.modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
	public String nome;
	public String nomeSocial;
	private CPF cpf;
	public String genero;
	private List<RG> rgs;
	private LocalDate dataCadastro;
	private List<Telefone> telefones;
	private List<Produto> produtosConsumidos;
	private List<Servico> servicosConsumidos;
	private double qtdProdutos;
	private double qtdServicos;
	
	public double valorTotal;
	public Cliente(String nome, String nomeSocial, CPF cpf, List<RG> rgs, String genero) {
		this.nome = nome;
		this.nomeSocial = nomeSocial;
		this.cpf = cpf;
		this.rgs = new ArrayList<>();
		this.dataCadastro = LocalDate.now();
		this.telefones = new ArrayList<>();
		this.produtosConsumidos = new ArrayList<>();
		this.servicosConsumidos = new ArrayList<>();
		this.genero = genero;
		this.valorTotal = valorTotal;
		this.qtdProdutos = qtdProdutos;
		this.qtdServicos = qtdServicos;
	}
	public Cliente(String nome, String nomeSocial, CPF cpf, List<RG> rgs, List<Produto> produtosConsumidos, List<Servico> servicosConsumidos) {
		this.nome = nome;
		this.nomeSocial = nomeSocial;
		this.cpf = cpf;
		this.rgs = new ArrayList<>();
		this.dataCadastro = LocalDate.now();
		this.telefones = new ArrayList<>();
		this.produtosConsumidos = new ArrayList<Produto>();
		this.servicosConsumidos = new ArrayList<Servico>();
	}
	
	public Cliente() {
	}
	public CPF getCpf() {
		return cpf;
	}
	public List<RG> getRgs() {
		return rgs;
	}
	public LocalDate getDataCadastro() {
		return dataCadastro;
	}
	public List<Telefone> getTelefones() {
		return telefones;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeSocial() {
		return nomeSocial;
	}

	
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public void setNomeSocial(String nomeSocial) {
		this.nomeSocial = nomeSocial;
	}

	public void setCpf(CPF cpf) {
		this.cpf = cpf;
	}

	public void setRgs(List<RG> rgs) {
		this.rgs = rgs;
	}

	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}
	public List<Produto> getProdutosConsumidos() {
		return produtosConsumidos;
	}
	public void setProdutosConsumidos(List<Produto> produtosConsumidos) {
		this.produtosConsumidos = produtosConsumidos;
	}
	public List<Servico> getServicosConsumidos() {
		return servicosConsumidos;
	}
	public void setServicosConsumidos(List<Servico> servicosConsumidos) {
		this.servicosConsumidos = servicosConsumidos;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public double getQtdProdutos() {
		return qtdProdutos;
	}
	public void setQtdProdutos(double qtdProdutos) {
		this.qtdProdutos = qtdProdutos;
	}
	public double getQtdServicos() {
		return qtdServicos;
	}
	public void setQtdServicos(double qtdServicos) {
		this.qtdServicos = qtdServicos;
	}
	public Cliente(String nome, String nomeSocial, CPF cpf,  List<RG> rgs,String genero,
			List<Produto> produtosConsumidos, List<Servico> servicosConsumidos, double qtdProdutos, double qtdServicos,
			double valorTotal) {
		this.nome = nome;
		this.nomeSocial = nomeSocial;
		this.cpf = cpf;
		this.genero = genero;
		this.rgs = rgs;
		this.dataCadastro = LocalDate.now();
		this.produtosConsumidos = produtosConsumidos;
		this.servicosConsumidos = servicosConsumidos;
		this.qtdProdutos = qtdProdutos;
		this.qtdServicos = qtdServicos;
		this.valorTotal = valorTotal;
	}
	
	public Cliente(String nome, String nomeSocial, CPF cpf,  List<RG> rgs,
			List<Produto> produtosConsumidos, List<Servico> servicosConsumidos, double qtdProdutos, double qtdServicos,
			double valorTotal) {
		this.nome = nome;
		this.nomeSocial = nomeSocial;
		this.cpf = cpf;
		this.genero = genero;
		this.rgs = rgs;
		this.dataCadastro = LocalDate.now();
		this.produtosConsumidos = produtosConsumidos;
		this.servicosConsumidos = servicosConsumidos;
		this.qtdProdutos = qtdProdutos;
		this.qtdServicos = qtdServicos;
		this.valorTotal = valorTotal;
	}
	
	
	
}