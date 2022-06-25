package com.wb.negocio.listas;

import java.util.ArrayList;
import java.util.List;

import com.wb.modelo.Cliente;
import com.wb.negocio.Listagem;

public class ListasCliente extends Listagem{
	private List<Cliente> clientes;
	private Cliente maiorConsumidor;
	private List<Cliente> maioresConsumidores = new ArrayList<>();
	private double qtdMax = 0;
	
	public ListasCliente(List<Cliente> clientes) {
		this.clientes = clientes;
	}
	@Override
	public void listar() {
		for (int i = 0; i < 10; i++) {
			for(Cliente cliente : clientes) {
				//Pegar o Maior Consumidor
				if(qtdMax < cliente.getQtdProdutos()) {
					maiorConsumidor = cliente;
					qtdMax = cliente.getQtdProdutos();
					
				}
				maioresConsumidores.add(maiorConsumidor);
				//Deletar o maior consumidor da lista para nao ser contado novamente
				for(Cliente clienteMaior: clientes) {
					if(clienteMaior.nome == maiorConsumidor.nome) {
						clientes.remove(cliente);
					}
				}
			}	
	}
		
	for(Cliente cliente10 : maioresConsumidores) {
		System.out.println("Nome do Cliente"+ cliente10.nome);
	}
}
	
}
