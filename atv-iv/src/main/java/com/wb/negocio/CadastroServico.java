package com.wb.negocio;

import java.util.ArrayList;
import java.util.List;

import com.wb.io.Entrada;
import com.wb.modelo.Servico;

public class CadastroServico extends Cadastro {
	private Entrada entrada;
	private List<Servico> servicos = new ArrayList<>();
	
	public CadastroServico(List<Servico> servicos) {
		this.servicos = servicos;
		this.entrada = new Entrada();
	}
	@Override
	public void cadastrar() {
		System.out.println("Cadastro de serviço: ");
		System.out.println("Informe o nome do serviço: ");
		String nome = entrada.receberTexto();
		System.out.println("Informe o valor do serviço(Ex: 10,00): ");
		double valor = entrada.receberNumeroDouble();
		Servico servico = new Servico(nome, valor);
		this.servicos.add(servico);
	}
	
	Servico servico1 = new Servico("Corte de cabelo", 25.00);
	Servico servico2 = new Servico("Manicure", 50.00);
	Servico servico3 = new Servico("Pedicure", 50.00);
	Servico servico4 = new Servico("Progressiva", 100.00);
	Servico servico5 = new Servico("Maquiagem", 150.00);
	Servico servico6 = new Servico("Hidradatação", 45.00);
	Servico servico7 = new Servico("Descoloração", 100.00);
	Servico servico8 = new Servico("Tintura", 50.00);
	Servico servico9 = new Servico("Botox", 80.00);
	Servico servico10 = new Servico("Depilacao", 100.00);
	
	@Override
	public void clientesCadastrados() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void produtosCadastrados() {
		// TODO Auto-generated method stub
		
	}

	public void servicosCadastrados() {
		this.servicos.add(servico1);
		this.servicos.add(servico2);
		this.servicos.add(servico3);
		this.servicos.add(servico4);
		this.servicos.add(servico5);
		this.servicos.add(servico6);
		this.servicos.add(servico7);
		this.servicos.add(servico8);
		this.servicos.add(servico9);
		this.servicos.add(servico10);	
	}
	@Override
	public void consumosCadastrados() {
		// TODO Auto-generated method stub
		
	}

}
