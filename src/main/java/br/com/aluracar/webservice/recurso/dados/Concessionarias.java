package br.com.aluracar.webservice.recurso.dados;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import br.com.aluracar.webservice.modelo.Carro;
import br.com.aluracar.webservice.modelo.Concessionaria;
import br.com.aluracar.webservice.modelo.geolocalizacao.LatLng;
import br.com.aluracar.webservice.modelo.geolocalizacao.LimitesExtremos;

public class Concessionarias {
	
	private static final Concessionaria[] CONCESSIONARIAS = {
			//TODO - melhorar os nomes das unidades
			geraConcessionaria("Aluracar Central", 1),
			geraConcessionaria("Aluracar 1", 2),
			geraConcessionaria("Aluracar 2", 3),
			geraConcessionaria("Aluracar 3", 4)
	};
	
	private static Concessionaria geraConcessionaria(String nome, int quantidadeDescarte) {
		List<Carro> carros = Carros.listaTodos()
									.stream()
									.skip(quantidadeDescarte)
									.collect(Collectors.toList());
		
		return new Concessionaria(nome, carros);
	}
	
	public static List<Concessionaria> listaTodas(LimitesExtremos limites, LatLng centro) {
		
		for (Concessionaria c : CONCESSIONARIAS) {
			LatLng posicao = geraPosicao(limites, centro);
			c.setPosicao(posicao);
		}
		
		return Arrays.asList(CONCESSIONARIAS);
	}
	
	private static LatLng geraPosicao(LimitesExtremos limites, LatLng centro) {
		//TODO - gerar os pontos (não repetidos) de acordo com
		// o centro e com os limites. 
		return null;
	}
}
