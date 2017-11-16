package br.com.aluracar.webservice.modelo;

public class Agendamento {
	
	private String nomeCliente;
	
	private String enderecoCliente;
	
	private String emailCliente;
	
	private String data;
	
	private String modeloCarro;
	
	private double precoTotal;
	
	public Agendamento() {}
	
	public Agendamento(String nomeCliente, String enderecoCliente, String emailCliente, String data, String modeloCarro,
			double precoTotal) {
		super();
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
	public double getPrecoTotal() {
		return precoTotal;
	}
	public void setPrecoTotal(double precoTotal) {
		this.precoTotal = precoTotal;
	}
}
