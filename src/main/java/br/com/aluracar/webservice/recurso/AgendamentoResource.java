package br.com.aluracar.webservice.recurso;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.aluracar.webservice.modelo.Agendamento;

@Path("/carro")
public class AgendamentoResource {

	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	public Response agenda(Agendamento agendamento) {
		
		return Response.ok().build();
	}
}
