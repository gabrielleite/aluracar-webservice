package br.com.aluracar.webservice.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.aluracar.webservice.model.Carro;
import br.com.aluracar.webservice.resource.data.Carros;

@Path("/carro")
public class CarroResource {
	
	@GET
	@Path("/listaTodos")
	@Produces({MediaType.APPLICATION_JSON})
	public List<Carro> listAll() {
		return Carros.listAll();
	}

}
