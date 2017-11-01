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
}
