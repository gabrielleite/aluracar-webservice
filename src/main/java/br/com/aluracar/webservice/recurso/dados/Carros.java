package br.com.aluracar.webservice.recurso.dados;

import java.util.Arrays;
import java.util.stream.Stream;

import br.com.aluracar.webservice.main.MainServer;
import br.com.aluracar.webservice.modelo.Carro;

public class Carros {
	public static Stream<Carro> listaTodos() {
		return Stream.of(
			new Carro("Azera V6", 85000,
				Arrays.asList(
					MainServer.getAppUri() + "/images/azera-v6-1.jpg",
					MainServer.getAppUri() + "/images/azera-v6-2.jpg",
					MainServer.getAppUri() + "/images/azera-v6-3.jpg"
				)),
			new Carro("Onix 1.6", 35000,
				Arrays.asList(
					MainServer.getAppUri() + "/images/onix-16-1.jpg",
					MainServer.getAppUri() + "/images/onix-16-2.jpg",
					MainServer.getAppUri() + "/images/onix-16-3.jpg"
				)),
			new Carro("Fiesta 2.0", 52000,
				Arrays.asList(
					MainServer.getAppUri() + "/images/fiesta-20-1.jpg",
					MainServer.getAppUri() + "/images/fiesta-20-2.jpg",
					MainServer.getAppUri() + "/images/fiesta-20-3.jpg"
				)),
			new Carro("C3 1.0", 22000,
				Arrays.asList(
					MainServer.getAppUri() + "/images/c3-10-1.jpg",
					MainServer.getAppUri() + "/images/c3-10-2.jpg",
					MainServer.getAppUri() + "/images/c3-10-3.jpg"
				)),
			new Carro("Uno Fire", 11000,
				Arrays.asList(
					MainServer.getAppUri() + "/images/uno-fire-1.jpg",
					MainServer.getAppUri() + "/images/uno-fire-2.jpg",
					MainServer.getAppUri() + "/images/uno-fire-3.jpg"
				)),
			new Carro("Sentra 2.0", 53000,
				Arrays.asList(
					MainServer.getAppUri() + "/images/sentra-20-1.jpg",
					MainServer.getAppUri() + "/images/sentra-20-2.jpg",
					MainServer.getAppUri() + "/images/sentra-20-3.jpg"
				)),
			new Carro("Astra Sedan", 39000,
				Arrays.asList(
					MainServer.getAppUri() + "/images/astra-sedan-1.jpg",
					MainServer.getAppUri() + "/images/astra-sedan-2.jpg"
				)),
			new Carro("Audi A3 Sedan",115000,
				Arrays.asList(
					MainServer.getAppUri() + "/images/audi-a3-sedan-1.jpg",
					MainServer.getAppUri() + "/images/audi-a3-sedan-2.jpg",
					MainServer.getAppUri() + "/images/audi-a3-sedan-3.jpg"
				)),
			new Carro("Hilux 4x4", 90000,
				Arrays.asList(
					MainServer.getAppUri() + "/images/hilux-4x4-1.jpg",
					MainServer.getAppUri() + "/images/hilux-4x4-2.jpg",
					MainServer.getAppUri() + "/images/hilux-4x4-3.jpg"
				)),
			new Carro("Montana", 57000,
				Arrays.asList(
					MainServer.getAppUri() + "/images/montana-1.jpg",
					MainServer.getAppUri() + "/images/montana-2.jpg",
					MainServer.getAppUri() + "/images/montana-3.jpg"
				)),
			new Carro("Outlander 2.4", 99000,
				Arrays.asList(
					MainServer.getAppUri() + "/images/outlander-24-1.jpg",
					MainServer.getAppUri() + "/images/outlander-24-2.jpg",
					MainServer.getAppUri() + "/images/outlander-24-3.jpg"
				)),
			new Carro("Brasilia Amarela", 9500,
				Arrays.asList(
					MainServer.getAppUri() + "/images/brasilia-amarela-1.jpg",
					MainServer.getAppUri() + "/images/brasilia-amarela-2.jpg",
					MainServer.getAppUri() + "/images/brasilia-amarela-3.jpg"
				)),
			new Carro("Porsche 911 Carrera", 100000,
				Arrays.asList(
					MainServer.getAppUri() + "/images/porsche-911-carrera-1.jpg",
					MainServer.getAppUri() + "/images/porsche-911-carrera-2.jpg"
				)),
			new Carro("Hyundai HB20", 60000,
				Arrays.asList(
					MainServer.getAppUri() + "/images/hyundai-hb20-1.jpg",
					MainServer.getAppUri() + "/images/hyundai-hb20-2.jpg"
				)),
			new Carro("Camaro SS", 120000,
				Arrays.asList(
					MainServer.getAppUri() + "/images/camaro-ss-1.jpg",
					MainServer.getAppUri() + "/images/camaro-ss-2.jpg",
					MainServer.getAppUri() + "/images/camaro-ss-3.jpg"
				)),
			new Carro("BMW Cabrio", 110000,
				Arrays.asList(
					MainServer.getAppUri() + "/images/bmw-cabrio-1.jpg",
					MainServer.getAppUri() + "/images/bmw-cabrio-2.jpg"
				))
		);
	}
}
