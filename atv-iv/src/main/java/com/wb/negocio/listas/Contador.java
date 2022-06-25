package com.wb.negocio.listas;

import com.wb.modelo.Produto;
import com.wb.modelo.Servico;

public class Contador {
	public Object item;
	public int size;
	public Contador(Object item, int size) {
		this.item = item;
		this.size = size;
	}
	
	public boolean equals(Produto produto) {
		return ((Produto) item).getNome().equals(produto.nome);
	}
	
	public boolean equals(Servico servico) {
		return ((Servico) item).getNome().equals(servico.nome);
	}
}