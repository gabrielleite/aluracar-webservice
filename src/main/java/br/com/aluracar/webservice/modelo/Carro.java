package br.com.aluracar.webservice.modelo;

import java.util.List;

public class Carro {
	private String nome;
	private double preco;
	private List<String> fotos;
	
	public Carro() {}
	
	public Carro(String nome, double preco, List<String> fotos) {
		this.nome = nome;
		this.preco = preco;
		this.fotos = fotos;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public List<String> getFotos() {
		return fotos;
	}
	public void setFotos(List<String> fotos) {
		this.fotos = fotos;
	}
}
