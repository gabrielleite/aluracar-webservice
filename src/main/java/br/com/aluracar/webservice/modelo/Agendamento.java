package br.com.aluracar.webservice.modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Agendamento {
	
	private String nomeCliente;
	
	private String enderecoCliente;
	
	private String emailCliente;
	
	private String data;
	
	private String modeloCarro;
	
	private String precoTotal;
	
	public Agendamento() {}
	
	public Agendamento(String nomeCliente, String enderecoCliente, String emailCliente, String data, String modeloCarro,
			String precoTotal) {
		this.nomeCliente = nomeCliente;
		this.enderecoCliente = enderecoCliente;
		this.emailCliente = emailCliente;
		this.data = data;
		this.modeloCarro = modeloCarro;
		this.precoTotal = precoTotal;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getEnderecoCliente() {
		return enderecoCliente;
	}
	public void setEnderecoCliente(String enderecoCliente) {
		this.enderecoCliente = enderecoCliente;
	}
	public String getEmailCliente() {
		return emailCliente;
	}
	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getModeloCarro() {
		return modeloCarro;
	}
	public void setModeloCarro(String modeloCarro) {
		this.modeloCarro = modeloCarro;
	}
	public String getPrecoTotal() {
		return precoTotal;
	}
	public void setPrecoTotal(String precoTotal) {
		this.precoTotal = precoTotal;
	}

	@Override
	public String toString() {
		return "[\n  nomeCliente = " + nomeCliente
				+ ",\n  enderecoCliente = " + enderecoCliente
				+ ",\n  emailCliente = " + emailCliente
				+ ",\n  data = " + data
				+ ",\n  modeloCarro = " + modeloCarro
				+ ",\n  precoTotal = "
				+ precoTotal + "\n]";
	}
}
