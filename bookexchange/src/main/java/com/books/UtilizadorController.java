//chama o utilizadorService

package com.books;

import jakarta.ws.rs.Produces;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/utilizador")
public class UtilizadorController {

    @Inject
    private UtilizadorService service;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response createUser(Utilizador utilizador) {
        service.createUser(utilizador);
        return Response.ok(utilizador).build();
    }

    @GET
    public Response getAllUsers() {
        return Response.ok(service.getAllUsers()).build();
    }

@POST
@Path("/login")
@Consumes(MediaType.APPLICATION_JSON)
public Response login(Utilizador credenciais) {
    if (credenciais == null 
        || credenciais.getEmail() == null 
        || credenciais.getPassword() == null) {
        return Response.status(Response.Status.BAD_REQUEST).build();
    }

    Utilizador utilizador = service.login(credenciais.getEmail(), credenciais.getPassword());

    if (utilizador == null) {
        return Response.status(Response.Status.UNAUTHORIZED)
            .entity("Email ou Password incorretos")
            .build();
    }
    
    return Response.ok().build();
}

}