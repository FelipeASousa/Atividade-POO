package com.wb.negocio;

import java.util.List;

import com.wb.modelo.Cliente;

public class ListarTodosClientes extends Listagem {
	private List<Cliente> clientes;

	public ListarTodosClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	@Override
	public void listar() {
		System.out.println("Lista de todos os clientes:");
		clientes.get(0).getRgs().get(0).getValor();
		for (Cliente cliente : clientes) {
			System.out.println("Nome: " + cliente.nome);
			System.out.println("Nome social: " + cliente.nomeSocial);
			System.out.println("CPF: " + cliente.getCpf().getValor());
			System.out.println("RGs: ");
			for (int i = 0; i < cliente.getRgs().size(); i++) {
				System.out.println(cliente.getRgs().get(i).getValor());
			}
			if (cliente.getGenero() == "M") {
				System.out.println("Gênero: Masculino");
			}
			else {
				System.out.println("Gênero: Feminino");
			}
			System.out.println("--------------------------------------");
		}
	}
}

