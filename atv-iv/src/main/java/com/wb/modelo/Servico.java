package com.wb.modelo;

public class Servico {
	public String nome;
	public double valor;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Servico(String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
	}
	
	public Servico() {}
	
	
	@Override
	public boolean equals(Object obj) {
		Servico servico = (Servico) obj;
		return nome.equals(servico.getNome());
	}
	
	public boolean equals(String nome) {
		return this.nome.equals(nome);
	}

}