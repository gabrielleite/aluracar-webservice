package br.com.aluracar.webservice.modelo;

import java.util.List;

import br.com.aluracar.webservice.modelo.geolocalizacao.LatLng;

public class Concessionaria {
	private LatLng posicao;
	private String nome;
	private List<Carro> carros;
	
	public Concessionaria(String nome) {
		this.nome = nome;
	}
	
	public Concessionaria(String nome, List<Carro> carros) {
		this.nome = nome;
		this.carros = carros;
	}

	public LatLng getPosicao() {
		return posicao;
	}

	public void setPosicao(LatLng posicao) {
		this.posicao = posicao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Carro> getCarros() {
		return carros;
	}

	public void setCarros(List<Carro> carros) {
		this.carros = carros;
	}
}
