package com.wb.negocio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import com.wb.io.Entrada;
import com.wb.modelo.CPF;
import com.wb.modelo.Cliente;
import com.wb.modelo.Produto;
import com.wb.modelo.RG;
import com.wb.modelo.Servico;

public class CadastroCliente extends Cadastro {
	private List<Cliente> clientes;
	private Entrada entrada;
	List<RG> rgs = new ArrayList<>();

	public CadastroCliente(List<Cliente> clientes) {
		this.clientes = clientes;
		this.entrada = new Entrada();
		
	}


	@Override
	public void cadastrar() {
		System.out.println("Início do cadastro do cliente");
		System.out.println("Por favor informe o nome do cliente:");
		String nome = entrada.receberTexto();
		System.out.println("Por favor informe o nome social do cliente:");
		String nomeSocial = entrada.receberTexto();
		System.out.println("Informe o gênero do cliente:");
		System.out.println("M - Masculino");
		System.out.println("F - Feminino");
		String genero = entrada.receberTexto();
		
		System.out.println("Por favor informe o número do cpf:");
		String valor = entrada.receberTexto();
		System.out.println("Por favor informe a data de emissão do cpf, no padrão dd/mm/yyyy:");
		String data = entrada.receberTexto();
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataEmissao = LocalDate.parse(data, formato);
		CPF cpf = new CPF(dataEmissao, valor);
		
		System.out.println("Por favor informe o número do rg:");
		String valorRg =  entrada.receberTexto();
		System.out.println("Por favor informe a data de emissão do rg:");
		String dataRg = entrada.receberTexto();
		DateTimeFormatter formatoRg = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataEmissaoRg = LocalDate.parse(dataRg, formatoRg);
		RG rg = new RG(dataEmissaoRg, valorRg);
		List<Produto> produtos = new ArrayList<>();
		Produto produto1 = new Produto("Colágeno", 3, 35.00);
		produtos.add(produto1);
		List<Servico> servicos =  new ArrayList<>();
		Servico servico1 = new Servico("Massagem", 46.00);
		servicos.add(servico1);
		rgs.add(rg);
		Cliente cliente = new Cliente(nome, nomeSocial, cpf,rgs, genero, produtos, servicos,3,1, 81.00);
		this.clientes.add(cliente);
		
	}
	

	public void clientesCadastrados() {
		DateTimeFormatter formatoDoc = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		//Nome
		String nome1 = "Felipe";
		String nomeSocial1 = "Lipe";		
		//CPF
		String valorCpf1 = "111.222.333-44";
		String dataCpf1 = "01/01/2022";
		LocalDate dataEmissaoCpf1 = LocalDate.parse(dataCpf1,formatoDoc);
		CPF cpf1 = new CPF(dataEmissaoCpf1, valorCpf1);
		//RG
		String valorRg1 = "11.222.333-4";
		String dataRg1 = "01/01/2022";
		LocalDate dataEmissaoRg1 = LocalDate.parse(dataRg1,formatoDoc);
		List<RG> rgs1 = new ArrayList<>();
		
		rgs1.add(new RG(dataEmissaoRg1, valorRg1));
		rgs1.add(new RG(dataEmissaoRg1, "3213245"));
		Cliente cliente1 = new Cliente();
		cliente1.setNome(nome1);
		cliente1.setNomeSocial(nomeSocial1);
		cliente1.setCpf(cpf1);
		cliente1.setRgs(rgs1);
		cliente1.setGenero("M");
		this.clientes.add(cliente1);
		
		//Nome
		String nome2 = "Walace";
		String nomeSocial2 = "Wal";		
		//CPF
		String valorCpf2 = "111.222.333-44";
		String dataCpf2 = "01/01/2022";
		LocalDate dataEmissaoCpf2 = LocalDate.parse(dataCpf2,formatoDoc);
		CPF cpf2 = new CPF(dataEmissaoCpf2, valorCpf2);
		//RG
		String valorRg2 = "11.222.333-4";
		String dataRg2 = "01/01/2022";
		LocalDate dataEmissaoRg2 = LocalDate.parse(dataRg2,formatoDoc);
		List<RG> rgs2 = new ArrayList<>();
		
		rgs2.add(new RG(dataEmissaoRg2, valorRg2));
		rgs2.add(new RG(dataEmissaoRg2, "344543"));
		Cliente cliente2 = new Cliente();
		cliente2.setNome(nome2);
		cliente2.setNomeSocial(nomeSocial2);
		cliente2.setCpf(cpf2);
		cliente2.setRgs(rgs2);
		cliente2.setGenero("M");
		this.clientes.add(cliente2);
		
		//Nome
		String nome3 = "Guilherme";
		String nomeSocial3 = "Gui";		
		//CPF
		String valorCpf3 = "333.222.333-44";
		String dataCpf3 = "01/01/2022";
		LocalDate dataEmissaoCpf3 = LocalDate.parse(dataCpf3,formatoDoc);
		CPF cpf3 = new CPF(dataEmissaoCpf3, valorCpf3);
		//RG
		String valorRg3 = "33.222.333-4";
		String dataRg3 = "01/01/2022";
		LocalDate dataEmissaoRg3 = LocalDate.parse(dataRg3,formatoDoc);
		RG rg3 = new RG(dataEmissaoRg3, valorRg3);
		List<RG> rgs3 = new ArrayList<>();
		
		rgs3.add(rg3);
		Cliente cliente3 = new Cliente();
		cliente3.setNome(nome3);
		cliente3.setNomeSocial(nomeSocial3);
		cliente3.setCpf(cpf3);
		cliente3.setRgs(rgs3);
		cliente3.setGenero("M");
		this.clientes.add(cliente3);
		
		//Nome
		String nome4 = "Gabriel";
		String nomeSocial4 = "Biel";		
		//CPF
		String valorCpf4 = "444.222.333-44";
		String dataCpf4 = "01/01/2022";
		LocalDate dataEmissaoCpf4 = LocalDate.parse(dataCpf4,formatoDoc);
		CPF cpf4 = new CPF(dataEmissaoCpf4, valorCpf4);
		//RG
		String valorRg4 = "44.222.333-4";
		String dataRg4 = "01/01/2022";
		LocalDate dataEmissaoRg4 = LocalDate.parse(dataRg4,formatoDoc);
		RG rg4 = new RG(dataEmissaoRg4, valorRg4);
		List<RG> rgs4 = new ArrayList<>();
		
		rgs4.add(rg4);
		Cliente cliente4 = new Cliente();
		cliente4.setNome(nome4);
		cliente4.setNomeSocial(nomeSocial4);
		cliente4.setCpf(cpf4);
		cliente4.setRgs(rgs4);
		cliente4.setGenero("M");
		this.clientes.add(cliente4);
		
		//Nome
		String nome5 = "Ana";
		String nomeSocial5 = "Ana";		
		//CPF
		String valorCpf5 = "555.222.333-44";
		String dataCpf5 = "01/01/2022";
		LocalDate dataEmissaoCpf5 = LocalDate.parse(dataCpf5,formatoDoc);
		CPF cpf5 = new CPF(dataEmissaoCpf5, valorCpf5);
		//RG
		String valorRg5 = "55.222.333-4";
		String dataRg5 = "01/01/2022";
		LocalDate dataEmissaoRg5 = LocalDate.parse(dataRg5,formatoDoc);
		RG rg5 = new RG(dataEmissaoRg5, valorRg5);
		List<RG> rgs5 = new ArrayList<>();
		
		rgs5.add(rg5);
		Cliente cliente5 = new Cliente();
		cliente5.setNome(nome5);
		cliente5.setNomeSocial(nomeSocial5);
		cliente5.setCpf(cpf5);
		cliente5.setRgs(rgs5);
		cliente5.setGenero("F");
		this.clientes.add(cliente5);
		
		//Nome
		String nome6 = "Andre";
		String nomeSocial6 = "Dede";		
		//CPF
		String valorCpf6 = "666.222.333-44";
		String dataCpf6 = "01/01/2022";
		LocalDate dataEmissaoCpf6 = LocalDate.parse(dataCpf6,formatoDoc);
		CPF cpf6 = new CPF(dataEmissaoCpf6, valorCpf6);
		//RG
		String valorRg6 = "66.222.333-4";
		String dataRg6 = "01/01/2022";
		LocalDate dataEmissaoRg6 = LocalDate.parse(dataRg6,formatoDoc);
		RG rg6 = new RG(dataEmissaoRg6, valorRg6);
		List<RG> rgs6 = new ArrayList<>();
		
		rgs6.add(rg6);
		Cliente cliente6 = new Cliente();
		cliente6.setNome(nome6);
		cliente6.setNomeSocial(nomeSocial6);
		cliente6.setCpf(cpf6);
		cliente6.setRgs(rgs6);
		cliente6.setGenero("M");
		this.clientes.add(cliente6);
		
		//Nome
		String nome7 = "Bruna";
		String nomeSocial7 = "Bubs";		
		//CPF
		String valorCpf7 = "777.222.333-44";
		String dataCpf7 = "01/01/2022";
		LocalDate dataEmissaoCpf7 = LocalDate.parse(dataCpf7,formatoDoc);
		CPF cpf7 = new CPF(dataEmissaoCpf7, valorCpf7);
		//RG
		String valorRg7 = "77.222.333-4";
		String dataRg7 = "01/01/2022";
		LocalDate dataEmissaoRg7 = LocalDate.parse(dataRg7,formatoDoc);
		RG rg7 = new RG(dataEmissaoRg7, valorRg7);
		List<RG> rgs7 = new ArrayList<>();
		
		rgs7.add(rg7);
		Cliente cliente7 = new Cliente();
		cliente7.setNome(nome7);
		cliente7.setNomeSocial(nomeSocial7);
		cliente7.setCpf(cpf7);
		cliente7.setRgs(rgs7);
		cliente7.setGenero("F");
		this.clientes.add(cliente7);
		
		String nome8 = "Carlos";
		String nomeSocial8 = "Car";		
		//CPF
		String valorCpf8 = "888.222.333-44";
		String dataCpf8 = "01/01/2022";
		LocalDate dataEmissaoCpf8 = LocalDate.parse(dataCpf8,formatoDoc);
		CPF cpf8 = new CPF(dataEmissaoCpf8, valorCpf8);
		//RG
		String valorRg8 = "88.222.333-4";
		String dataRg8 = "01/01/2022";
		LocalDate dataEmissaoRg8 = LocalDate.parse(dataRg8,formatoDoc);
		RG rg8 = new RG(dataEmissaoRg8, valorRg8);
		List<RG> rgs8 = new ArrayList<>();
		
		rgs8.add(rg8);
		Cliente cliente8 = new Cliente();
		cliente8.setNome(nome8);
		cliente8.setNomeSocial(nomeSocial8);
		cliente8.setCpf(cpf8);
		cliente8.setRgs(rgs8);
		cliente8.setGenero("M");
		this.clientes.add(cliente8);
		
		String nome9 = "Luiz";
		String nomeSocial9 = "Lulu";		
		//CPF
		String valorCpf9 = "999.222.333-44";
		String dataCpf9 = "01/01/2022";
		LocalDate dataEmissaoCpf9 = LocalDate.parse(dataCpf9,formatoDoc);
		CPF cpf9 = new CPF(dataEmissaoCpf9, valorCpf9);
		//RG
		String valorRg9 = "99.222.333-4";
		String dataRg9 = "01/01/2022";
		LocalDate dataEmissaoRg9 = LocalDate.parse(dataRg9,formatoDoc);
		RG rg9 = new RG(dataEmissaoRg9, valorRg9);
		List<RG> rgs9 = new ArrayList<>();
		
		rgs9.add(rg9);
		Cliente cliente9 = new Cliente();
		cliente9.setNome(nome9);
		cliente9.setNomeSocial(nomeSocial9);
		cliente9.setCpf(cpf9);
		cliente9.setRgs(rgs9);
		cliente9.setGenero("M");
		this.clientes.add(cliente9);
		
		String nome10 = "Gustavo";
		String nomeSocial10 = "Gu";		
		//CPF
		String valorCpf10 = "121.222.333-44";
		String dataCpf10 = "01/01/2022";
		LocalDate dataEmissaoCpf10 = LocalDate.parse(dataCpf10,formatoDoc);
		CPF cpf10 = new CPF(dataEmissaoCpf10, valorCpf10);
		//RG
		String valorRg10 = "12.222.333-4";
		String dataRg10 = "01/01/2022";
		LocalDate dataEmissaoRg10 = LocalDate.parse(dataRg10,formatoDoc);
		RG rg10 = new RG(dataEmissaoRg10, valorRg10);
		List<RG> rgs10 = new ArrayList<>();
		
		rgs10.add(rg10);
		Cliente cliente10 = new Cliente();
		cliente10.setNome(nome10);
		cliente10.setNomeSocial(nomeSocial10);
		cliente10.setCpf(cpf10);
		cliente10.setRgs(rgs10);
		cliente10.setGenero("M");
		this.clientes.add(cliente10);
		
		String nome11 = "Renan";
		String nomeSocial11 = "Re";		
		//CPF
		String valorCpf11 = "372.480.910-73";
		String dataCpf11 = "01/01/2022";
		LocalDate dataEmissaoCpf11 = LocalDate.parse(dataCpf11,formatoDoc);
		CPF cpf11 = new CPF(dataEmissaoCpf11, valorCpf11);
		//RG
		String valorRg11 = "12.222.333-4";
		String dataRg11 = "01/01/2022";
		LocalDate dataEmissaoRg11 = LocalDate.parse(dataRg11,formatoDoc);
		RG rg11 = new RG(dataEmissaoRg11, valorRg11);
		List<RG> rgs11 = new ArrayList<>();
		
		rgs11.add(rg11);
		Cliente cliente11 = new Cliente();
		cliente11.setNome(nome11);
		cliente11.setNomeSocial(nomeSocial11);
		cliente11.setCpf(cpf11);
		cliente11.setRgs(rgs11);
		cliente11.setGenero("M");
		this.clientes.add(cliente11);
		
		String nome12 = "Shawn";
		String nomeSocial12 = "Shawn";		
		//CPF
		String valorCpf12 = "227.188.240-00";
		String dataCpf12 = "02/01/2022";
		LocalDate dataEmissaoCpf12 = LocalDate.parse(dataCpf12,formatoDoc);
		CPF cpf12 = new CPF(dataEmissaoCpf12, valorCpf12);
		//RG
		String valorRg12 = "39.595.126-4";
		String dataRg12 = "02/01/2022";
		LocalDate dataEmissaoRg12 = LocalDate.parse(dataRg12,formatoDoc);
		RG rg12 = new RG(dataEmissaoRg12, valorRg12);
		List<RG> rgs12 = new ArrayList<>();
		
		rgs12.add(rg12);
		Cliente cliente12 = new Cliente();
		cliente12.setNome(nome12);
		cliente12.setNomeSocial(nomeSocial12);
		cliente12.setCpf(cpf12);
		cliente12.setRgs(rgs12);
		cliente12.setGenero("M");
		this.clientes.add(cliente12);

		String nome13 = "Elizabeth";
		String nomeSocial13 = "Elizabeth";		
		//CPF
		String valorCpf13 = "784.913.900-30";
		String dataCpf13 = "03/01/2022";
		LocalDate dataEmissaoCpf13 = LocalDate.parse(dataCpf13,formatoDoc);
		CPF cpf13 = new CPF(dataEmissaoCpf13, valorCpf13);
		//RG
		String valorRg13 = "10.650.743-6";
		String dataRg13 = "03/01/2022";
		LocalDate dataEmissaoRg13 = LocalDate.parse(dataRg13,formatoDoc);
		RG rg13 = new RG(dataEmissaoRg13, valorRg13);
		List<RG> rgs13 = new ArrayList<>();
		
		rgs13.add(rg13);
		Cliente cliente13 = new Cliente();
		cliente13.setNome(nome13);
		cliente13.setNomeSocial(nomeSocial13);
		cliente13.setCpf(cpf13);
		cliente13.setRgs(rgs13);
		cliente13.setGenero("F");
		this.clientes.add(cliente13);
		
		String nome14 = "Veronica";
		String nomeSocial14 = "Veronica";		
		//CPF
		String valorCpf14 = "475.409.460-32";
		String dataCpf14 = "04/01/2022";
		LocalDate dataEmissaoCpf14 = LocalDate.parse(dataCpf14,formatoDoc);
		CPF cpf14 = new CPF(dataEmissaoCpf14, valorCpf14);
		//RG
		String valorRg14 = "32.824.033-3";
		String dataRg14 = "04/01/2022";
		LocalDate dataEmissaoRg14 = LocalDate.parse(dataRg14,formatoDoc);
		RG rg14 = new RG(dataEmissaoRg14, valorRg14);
		List<RG> rgs14 = new ArrayList<>();
		
		rgs14.add(rg14);
		Cliente cliente14 = new Cliente();
		cliente14.setNome(nome14);
		cliente14.setNomeSocial(nomeSocial14);
		cliente14.setCpf(cpf14);
		cliente14.setRgs(rgs14);
		cliente14.setGenero("F");
		this.clientes.add(cliente14);
		
		String nome15 = "Spencer";
		String nomeSocial15 = "Spencer";		
		//CPF
		String valorCpf15 = "903.776.750-83";
		String dataCpf15 = "05/01/2022";
		LocalDate dataEmissaoCpf15 = LocalDate.parse(dataCpf15,formatoDoc);
		CPF cpf15 = new CPF(dataEmissaoCpf15, valorCpf15);
		//RG
		String valorRg15 = "21.156.138-1";
		String dataRg15 = "05/01/2022";
		LocalDate dataEmissaoRg15 = LocalDate.parse(dataRg15,formatoDoc);
		RG rg15 = new RG(dataEmissaoRg15, valorRg15);
		List<RG> rgs15 = new ArrayList<>();
		
		rgs15.add(rg15);
		Cliente cliente15 = new Cliente();
		cliente15.setNome(nome15);
		cliente15.setNomeSocial(nomeSocial15);
		cliente15.setCpf(cpf15);
		cliente15.setRgs(rgs15);
		cliente15.setGenero("M");
		this.clientes.add(cliente15);
		
		String nome16 = "Frost";
		String nomeSocial16 = "Frost";		
		//CPF
		String valorCpf16 = "948.188.000-15";
		String dataCpf16 = "06/01/2022";
		LocalDate dataEmissaoCpf16 = LocalDate.parse(dataCpf16,formatoDoc);
		CPF cpf16 = new CPF(dataEmissaoCpf16, valorCpf16);
		//RG
		String valorRg16 = "30.788.604-9";
		String dataRg16 = "06/01/2022";
		LocalDate dataEmissaoRg16 = LocalDate.parse(dataRg16,formatoDoc);
		RG rg16 = new RG(dataEmissaoRg16, valorRg16);
		List<RG> rgs16 = new ArrayList<>();
		
		rgs11.add(rg16);
		Cliente cliente16 = new Cliente();
		cliente16.setNome(nome16);
		cliente16.setNomeSocial(nomeSocial16);
		cliente16.setCpf(cpf16);
		cliente16.setRgs(rgs16);
		cliente16.setGenero("M");
		this.clientes.add(cliente16);
		
		String nome17 = "Brown";
		String nomeSocial17 = "Brown";		
		//CPF
		String valorCpf17 = "099.076.840-66";
		String dataCpf17 = "07/01/2022";
		LocalDate dataEmissaoCpf17 = LocalDate.parse(dataCpf17,formatoDoc);
		CPF cpf17 = new CPF(dataEmissaoCpf17, valorCpf17);
		//RG
		String valorRg17 = "29.303.887-9";
		String dataRg17 = "07/01/2022";
		LocalDate dataEmissaoRg17 = LocalDate.parse(dataRg17,formatoDoc);
		RG rg17 = new RG(dataEmissaoRg17, valorRg17);
		List<RG> rgs17 = new ArrayList<>();
		
		rgs17.add(rg17);
		Cliente cliente17 = new Cliente();
		cliente17.setNome(nome17);
		cliente17.setNomeSocial(nomeSocial17);
		cliente17.setCpf(cpf17);
		cliente17.setRgs(rgs17);
		cliente17.setGenero("M");
		this.clientes.add(cliente17);
		
		String nome18 = "Anderson";
		String nomeSocial18 = "Anderson";		
		//CPF
		String valorCpf18 = "688.893.350-41";
		String dataCpf18 = "08/01/2022";
		LocalDate dataEmissaoCpf18 = LocalDate.parse(dataCpf18,formatoDoc);
		CPF cpf18 = new CPF(dataEmissaoCpf18, valorCpf18);
		//RG
		String valorRg18 = "29.650.763-5";
		String dataRg18 = "09/01/2022";
		LocalDate dataEmissaoRg18 = LocalDate.parse(dataRg18,formatoDoc);
		RG rg18 = new RG(dataEmissaoRg18, valorRg18);
		List<RG> rgs18 = new ArrayList<>();
		
		rgs18.add(rg18);
		Cliente cliente18 = new Cliente();
		cliente18.setNome(nome18);
		cliente18.setNomeSocial(nomeSocial18);
		cliente18.setCpf(cpf18);
		cliente18.setRgs(rgs18);
		cliente18.setGenero("M");
		this.clientes.add(cliente18);
		
		String nome19 = "Reed";
		String nomeSocial19 = "Reed";		
		//CPF
		String valorCpf19 = "174.735.200-40";
		String dataCpf19 = "10/01/2022";
		LocalDate dataEmissaoCpf19 = LocalDate.parse(dataCpf19,formatoDoc);
		CPF cpf19 = new CPF(dataEmissaoCpf19, valorCpf19);
		//RG
		String valorRg19 = "14.436.549-2";
		String dataRg19 = "11/01/2022";
		LocalDate dataEmissaoRg19 = LocalDate.parse(dataRg19,formatoDoc);
		RG rg19 = new RG(dataEmissaoRg19, valorRg19);
		List<RG> rgs19 = new ArrayList<>();
		
		rgs19.add(rg19);
		Cliente cliente19 = new Cliente();
		cliente19.setNome(nome19);
		cliente19.setNomeSocial(nomeSocial19);
		cliente19.setCpf(cpf19);
		cliente19.setRgs(rgs19);
		cliente19.setGenero("F");
		this.clientes.add(cliente19);
		
		String nome20 = "Nelson";
		String nomeSocial20 = "Nelson";		
		//CPF
		String valorCpf20 = "951.684.860-53";
		String dataCpf20 = "12/01/2022";
		LocalDate dataEmissaoCpf20 = LocalDate.parse(dataCpf20,formatoDoc);
		CPF cpf20 = new CPF(dataEmissaoCpf20, valorCpf20);
		//RG
		String valorRg20 = "41.677.014-9";
		String dataRg20 = "12/01/2022";
		LocalDate dataEmissaoRg20 = LocalDate.parse(dataRg20,formatoDoc);
		RG rg20 = new RG(dataEmissaoRg20, valorRg20);
		List<RG> rgs20 = new ArrayList<>();
		
		rgs20.add(rg20);
		Cliente cliente20 = new Cliente();
		cliente20.setNome(nome20);
		cliente20.setNomeSocial(nomeSocial20);
		cliente20.setCpf(cpf20);
		cliente20.setRgs(rgs20);
		cliente20.setGenero("M");
		this.clientes.add(cliente20);
		
		String nome21 = "Taylor";
		String nomeSocial21 = "Taylor";		
		//CPF
		String valorCpf21 = "183.063.770-36";
		String dataCpf21 = "13/01/2022";
		LocalDate dataEmissaoCpf21 = LocalDate.parse(dataCpf21,formatoDoc);
		CPF cpf21 = new CPF(dataEmissaoCpf21, valorCpf21);
		//RG
		String valorRg21 = "13.881.360-7";
		String dataRg21 = "13/01/2022";
		LocalDate dataEmissaoRg21 = LocalDate.parse(dataRg21,formatoDoc);
		RG rg21 = new RG(dataEmissaoRg21, valorRg21);
		List<RG> rgs21 = new ArrayList<>();
		
		rgs21.add(rg21);
		Cliente cliente21 = new Cliente();
		cliente21.setNome(nome21);
		cliente21.setNomeSocial(nomeSocial21);
		cliente21.setCpf(cpf21);
		cliente21.setRgs(rgs21);
		cliente21.setGenero("F");
		this.clientes.add(cliente21);
		
		String nome22 = "Maicon";
		String nomeSocial22 = "Maicon";		
		//CPF
		String valorCpf22 = "505.963.570-87";
		String dataCpf22 = "14/01/2022";
		LocalDate dataEmissaoCpf22 = LocalDate.parse(dataCpf22,formatoDoc);
		CPF cpf22 = new CPF(dataEmissaoCpf22, valorCpf22);
		//RG
		String valorRg22 = "47.955.879-6";
		String dataRg22 = "14/01/2022";
		LocalDate dataEmissaoRg22 = LocalDate.parse(dataRg22,formatoDoc);
		RG rg22 = new RG(dataEmissaoRg22, valorRg22);
		List<RG> rgs22 = new ArrayList<>();
		
		rgs22.add(rg22);
		Cliente cliente22 = new Cliente();
		cliente22.setNome(nome22);
		cliente22.setNomeSocial(nomeSocial22);
		cliente22.setCpf(cpf22);
		cliente22.setRgs(rgs22);
		cliente22.setGenero("M");
		this.clientes.add(cliente22);
		
		String nome23 = "Pamela";
		String nomeSocial23 = "Pamela";		
		//CPF
		String valorCpf23 = "893.933.090-00";
		String dataCpf23 = "15/01/2022";
		LocalDate dataEmissaoCpf23 = LocalDate.parse(dataCpf23,formatoDoc);
		CPF cpf23 = new CPF(dataEmissaoCpf23, valorCpf23);
		//RG
		String valorRg23 = "32.330.996-3";
		String dataRg23 = "15/01/2022";
		LocalDate dataEmissaoRg23 = LocalDate.parse(dataRg23,formatoDoc);
		RG rg23 = new RG(dataEmissaoRg23, valorRg23);
		List<RG> rgs23 = new ArrayList<>();
		
		rgs23.add(rg23);
		Cliente cliente23 = new Cliente();
		cliente23.setNome(nome23);
		cliente23.setNomeSocial(nomeSocial23);
		cliente23.setCpf(cpf23);
		cliente23.setRgs(rgs23);
		cliente23.setGenero("F");
		this.clientes.add(cliente23);
		
		String nome24 = "Amanda";
		String nomeSocial24 = "Amanda";		
		//CPF
		String valorCpf24 = "054.334.730-31";
		String dataCpf24 = "16/01/2022";
		LocalDate dataEmissaoCpf24 = LocalDate.parse(dataCpf24,formatoDoc);
		CPF cpf24 = new CPF(dataEmissaoCpf24, valorCpf24);
		//RG
		String valorRg24 = "28.881.023-5";
		String dataRg24 = "16/01/2022";
		LocalDate dataEmissaoRg24 = LocalDate.parse(dataRg24,formatoDoc);
		RG rg24 = new RG(dataEmissaoRg24, valorRg24);
		List<RG> rgs24 = new ArrayList<>();
		
		rgs24.add(rg24);
		Cliente cliente24 = new Cliente();
		cliente24.setNome(nome24);
		cliente24.setNomeSocial(nomeSocial24);
		cliente24.setCpf(cpf24);
		cliente24.setRgs(rgs24);
		cliente24.setGenero("F");
		this.clientes.add(cliente24);
		
		String nome25 = "Gina";
		String nomeSocial25 = "Gina";		
		//CPF
		String valorCpf25 = "601.529.970-32";
		String dataCpf25 = "22/01/2022";
		LocalDate dataEmissaoCpf25 = LocalDate.parse(dataCpf25,formatoDoc);
		CPF cpf25 = new CPF(dataEmissaoCpf25, valorCpf25);
		//RG
		String valorRg25 = "45.253.532-3";
		String dataRg25 = "22/01/2022";
		LocalDate dataEmissaoRg25 = LocalDate.parse(dataRg25,formatoDoc);
		RG rg25 = new RG(dataEmissaoRg25, valorRg25);
		List<RG> rgs25 = new ArrayList<>();
		
		rgs25.add(rg25);
		Cliente cliente25 = new Cliente();
		cliente25.setNome(nome25);
		cliente25.setNomeSocial(nomeSocial25);
		cliente25.setCpf(cpf25);
		cliente25.setRgs(rgs25);
		cliente25.setGenero("F");
		this.clientes.add(cliente25);
		
		String nome26 = "Abigail";
		String nomeSocial26 = "Abigail ";		
		//CPF
		String valorCpf26 = "710.268.180-10";
		String dataCpf26 = "21/01/2022";
		LocalDate dataEmissaoCpf26 = LocalDate.parse(dataCpf26,formatoDoc);
		CPF cpf26 = new CPF(dataEmissaoCpf26, valorCpf26);
		//RG
		String valorRg26 = "36.369.954-5";
		String dataRg26 = "21/01/2022";
		LocalDate dataEmissaoRg26 = LocalDate.parse(dataRg26,formatoDoc);
		RG rg26 = new RG(dataEmissaoRg26, valorRg26);
		List<RG> rgs26 = new ArrayList<>();
		
		rgs26.add(rg26);
		Cliente cliente26 = new Cliente();
		cliente26.setNome(nome26);
		cliente26.setNomeSocial(nomeSocial26);
		cliente26.setCpf(cpf26);
		cliente26.setRgs(rgs26);
		cliente26.setGenero("F");
		this.clientes.add(cliente26);
		
		String nome27 = "Rebecca";
		String nomeSocial27 = "Rebecca";		
		//CPF
		String valorCpf27 = "120.731.060-30";
		String dataCpf27 = "24/01/2022";
		LocalDate dataEmissaoCpf27 = LocalDate.parse(dataCpf27,formatoDoc);
		CPF cpf27 = new CPF(dataEmissaoCpf27, valorCpf27);
		//RG
		String valorRg27 = "28.881.201-3";
		String dataRg27 = "24/01/2022";
		LocalDate dataEmissaoRg27 = LocalDate.parse(dataRg27,formatoDoc);
		RG rg27 = new RG(dataEmissaoRg27, valorRg27);
		List<RG> rgs27= new ArrayList<>();
		
		rgs27.add(rg27);
		Cliente cliente27 = new Cliente();
		cliente27.setNome(nome27);
		cliente27.setNomeSocial(nomeSocial27);
		cliente27.setCpf(cpf27);
		cliente27.setRgs(rgs27);
		cliente27.setGenero("F");
		this.clientes.add(cliente27);
		
		String nome28 = "Yang";
		String nomeSocial28 = "Yang";		
		//CPF
		String valorCpf28 = "121.222.333-44";
		String dataCpf28 = "25/01/2022";
		LocalDate dataEmissaoCpf28 = LocalDate.parse(dataCpf28,formatoDoc);
		CPF cpf28 = new CPF(dataEmissaoCpf28, valorCpf28);
		//RG
		String valorRg28 = "23.087.125-2";
		String dataRg28 = "25/01/2022";
		LocalDate dataEmissaoRg28 = LocalDate.parse(dataRg28,formatoDoc);
		RG rg28 = new RG(dataEmissaoRg28, valorRg28);
		List<RG> rgs28 = new ArrayList<>();
		
		rgs28.add(rg28);
		Cliente cliente28 = new Cliente();
		cliente28.setNome(nome28);
		cliente28.setNomeSocial(nomeSocial28);
		cliente28.setCpf(cpf28);
		cliente28.setRgs(rgs28);
		cliente28.setGenero("F");
		this.clientes.add(cliente28);
		
		String nome29 = "Jennifer";
		String nomeSocial29 = "Jennifer";		
		//CPF
		String valorCpf29 = "264.598.590-43";
		String dataCpf29 = "26/01/2022";
		LocalDate dataEmissaoCpf29= LocalDate.parse(dataCpf29,formatoDoc);
		CPF cpf29 = new CPF(dataEmissaoCpf29, valorCpf29);
		//RG
		String valorRg29 = "22.998.713-8";
		String dataRg29 = "26/01/2022";
		LocalDate dataEmissaoRg29 = LocalDate.parse(dataRg29,formatoDoc);
		RG rg29 = new RG(dataEmissaoRg29, valorRg29);
		List<RG> rgs29= new ArrayList<>();
		
		rgs29.add(rg29);
		Cliente cliente29 = new Cliente();
		cliente29.setNome(nome29);
		cliente29.setNomeSocial(nomeSocial29);
		cliente29.setCpf(cpf29);
		cliente29.setRgs(rgs29);
		cliente29.setGenero("F");
		this.clientes.add(cliente29);
		
		String nome30 = "Nancy";
		String nomeSocial30 = "Nancy";		
		//CPF
		String valorCpf30 = "398.854.470-16";
		String dataCpf30 = "01/01/2022";
		LocalDate dataEmissaoCpf30 = LocalDate.parse(dataCpf30,formatoDoc);
		CPF cpf30 = new CPF(dataEmissaoCpf30, valorCpf30);
		//RG
		String valorRg30 = "22.296.142-9";
		String dataRg30 = "01/01/2022";
		LocalDate dataEmissaoRg30 = LocalDate.parse(dataRg30,formatoDoc);
		RG rg30 = new RG(dataEmissaoRg30, valorRg30);
		List<RG> rgs30 = new ArrayList<>();
		
		rgs30.add(rg30);
		Cliente cliente30 = new Cliente();
		cliente30.setNome(nome30);
		cliente30.setNomeSocial(nomeSocial30);
		cliente30.setCpf(cpf30);
		cliente30.setRgs(rgs30);
		cliente30.setGenero("F");
		this.clientes.add(cliente30);
		
	}

	public void produtosCadastrados() {
			
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
