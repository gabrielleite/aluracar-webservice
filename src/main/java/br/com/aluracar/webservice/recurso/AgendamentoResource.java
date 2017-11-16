package br.com.aluracar.webservice.recurso;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.aluracar.webservice.modelo.Agendamento;

@Path("/agendamento")
public class AgendamentoResource {

	@POST
	@Path("/agenda")
	@Consumes({MediaType.APPLICATION_JSON})
	public Response agenda(Agendamento agendamento) {
		
		System.out.println("agendamento/agenda");
		
		System.out.println(agendamento.getNomeCliente());
		System.out.println(agendamento.getEnderecoCliente());
		System.out.println(agendamento.getEmailCliente());
		System.out.println(agendamento.getData());
		System.out.println(agendamento.getModeloCarro());
		System.out.println(agendamento.getPrecoTotal());
		
		return Response.ok().build();
	}
}
