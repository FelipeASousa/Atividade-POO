package com.wb.negocio.listas;

import java.util.List;

import com.wb.modelo.Cliente;
import com.wb.modelo.RG;
import com.wb.negocio.Listagem;

public class ListarPorGenero extends Listagem{
	private List<Cliente> clientes;
	
	public ListarPorGenero(List<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	@Override
	public void listar() {
		System.out.println("Lista de todos os clientes");
		//Masculino
		System.out.println("Clientes do sexo masculino:");
		for(Cliente cliente: clientes) {
			if(cliente.getGenero().equals("M")) {
				DadosDoCliente(cliente);
			}
		}
		System.out.println("==============================");
		//Feminino
		System.out.println("Clientes do sexo feminino:");
		for(Cliente cliente: clientes) {
			if(cliente.getGenero().equals("F")) {
				DadosDoCliente(cliente);
			}
		}
	}
	
	private void DadosDoCliente(Cliente cliente) {
		System.out.println("Nome: " + cliente.nome);
		System.out.println("Nome Social: " + cliente.nomeSocial);
		System.out.println("CPF: "+ cliente.getCpf().getValor());
		System.out.println("Rgs: ");
		
		if(!cliente.getRgs().isEmpty()) {
			for(RG rg : cliente.getRgs()) {
				System.out.println(rg.getValor());
			}
		}
		System.out.println("Telefones: ");
		System.out.println("==============================");
	}
}
