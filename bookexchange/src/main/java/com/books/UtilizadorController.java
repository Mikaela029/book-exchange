//chama o utilizadorService

package com.books;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
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
}