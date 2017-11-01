package br.com.aluracar.webservice.resource.data;

import java.util.Arrays;
import java.util.List;

import br.com.aluracar.webservice.model.Carro;

public class Carros {
	public static List<Carro> listAll() {
		return Arrays.asList(
			new Carro("Azera V6", 85000, "http://localhost:8080/images/azera-v6.jpg"),
			new Carro("Onix 1.6", 35000, "http://localhost:8080/images/onix-16.jpg"),
			new Carro("Fiesta 2.0", 52000, "http://localhost:8080/images/fiesta-20.jpg"),
			new Carro("C3 1.0", 22000, "http://localhost:8080/images/c3-10.jpg"),
			new Carro("Uno Fire", 11000, "http://localhost:8080/images/uno-fire.jpg"),
	        new Carro("Sentra 2.0", 53000, "http://localhost:8080/images/sentra-20.jpg"),
	        new Carro("Astra Sedan", 39000, "http://localhost:8080/images/astra-sedan.jpg"),
	        new Carro("Vectra 2.0 Turbo", 37000, "http://localhost:8080/images/vectra-turbo-20.jpg"),
	        new Carro("Hilux 4x4", 90000, "http://localhost:8080/images/hilux-4x4.jpg"),
	        new Carro("Montana Cabine Dupla", 57000, "http://localhost:8080/images/montana-cabine-dupla.jpg"),
	        new Carro("Outlander 2.4", 99000, "http://localhost:8080/images/outlander-24.jpg"),
	        new Carro("Brasilia Amarela", 9500, "http://localhost:8080/images/brasilia-amarela.jpg"),
	        new Carro("Omega Sedan", 80000, "http://localhost:8080/images/omega-sedan.jpg")
		);
	}
}
