package br.com.aluracar.webservice.recurso;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.aluracar.webservice.modelo.Concessionaria;
import br.com.aluracar.webservice.modelo.geolocalizacao.LatLng;
import br.com.aluracar.webservice.modelo.geolocalizacao.LimitesExtremos;
import br.com.aluracar.webservice.recurso.dados.Concessionarias;

@Path("/concessionaria")
public class ConcessionariaResource {
	
	@GET
	@Path("/listaTodas")
	@Produces({MediaType.APPLICATION_JSON})
	public List<Concessionaria> listaTodas(LimitesExtremos limites, LatLng centro) {
		//TODO - Considerar fazer estáticamente as posições das
		// concessionárias para facilitar.
		
		//TODO - Não receber os parâmetros pela URL
		
		return Concessionarias.listaTodas(limites, centro);
	}
}
