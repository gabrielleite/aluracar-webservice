package br.com.aluracar.webservice.recurso;

import java.util.List;
import java.util.stream.Collectors;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.aluracar.webservice.modelo.Carro;
import br.com.aluracar.webservice.recurso.dados.Carros;

@Path("/carro")
public class CarroResource {
	
	@GET
	@Path("/listaTodos")
	@Produces({MediaType.APPLICATION_JSON})
	public List<Carro> listaTodos() {
		return Carros.listaTodos()
						.collect(Collectors.toList());
	}

}
