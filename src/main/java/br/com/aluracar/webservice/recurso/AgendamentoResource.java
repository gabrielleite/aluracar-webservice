package br.com.aluracar.webservice.recurso;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.aluracar.webservice.modelo.Agendamento;

@Path("/agendamento")
public class AgendamentoResource {
	
	private static int contador = 0;

	@POST
	@Path("/agenda")
	@Produces({MediaType.APPLICATION_JSON})
	public Response agenda(Agendamento agendamento) {
		contador++;
		
		if (contador % 3 == 0) {
			contador = 0;
			
			System.out.println("Falha no processamento do agendamento...");
			
			return Response.serverError().build();
		} else {
			System.out.println("Agendamento sendo processado: " + agendamento);
		}
		return Response
				.ok()
				.entity(agendamento)
				.build();
	}
}
