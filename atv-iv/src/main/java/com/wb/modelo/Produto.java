package com.wb.modelo;

public class Produto {
	public String nome;
	public Integer qtd;
	public double valor;
	
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getQtd() {
		return qtd;
	}
	public void setQtd(Integer qtd) {
		this.qtd = qtd;
	}
	public Produto(String nome, Integer qtd) {
		super();
		this.nome = nome;
		this.qtd = qtd;
	}

	
	public Produto() {}
	
	public Produto(String nome, Integer qtd, double valor) {
		this.nome = nome;
		this.qtd = qtd;
		this.valor = valor;
	}
	
	@Override
	public boolean equals(Object obj) {
		Produto produto = (Produto) obj;
		return nome.equals(produto.getNome());
	}
	
	public boolean equals(String nome) {
		return this.nome.equals(nome);
	}
	
}