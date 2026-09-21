//chama o utilizadorService

package com.books;

import jakarta.ws.rs.Produces;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/utilizador")
public class UtilizadorController {

    @Inject
    private UtilizadorService service;

    @POST
    public Response createUser(Utilizador utilizador) {
        service.createUser(utilizador);
        return Response.ok(utilizador).build();
    }

    @GET
    public Response getAllUsers() {
        return Response.ok(service.getAllUsers()).build();
    }

@GET 
@Path ("/login") //endereço completo para aceder e /api/utilizador/login
@Produces (MediaType.APPLICATION_JSON) //Indica que o método devolve dados no formato JSON.
public Response login(
    @QueryParam("email") String email, //Obtém o email enviado no URL:
    @QueryParam ("password") String password) { //Obtém a pass enviada no URL:

    Utilizador utilizador = service.login(email, password);

    if (utilizador == null){ //Se o repository não encontrar nenhum utilizador com esse email e password, devolve null.
        return Response
        .status(Response.Status.UNAUTHORIZED)
        .entity("Email ou Password incorretos")
        .build();
    }
    
    return Response.ok(utilizador).build(); //resposta do login valido
}

}