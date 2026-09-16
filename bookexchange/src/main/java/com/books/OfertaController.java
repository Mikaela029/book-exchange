package com.books;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;


@Path("/oferta")

public class OfertaController {

@Inject 
private OfertaService service;    

    @POST 
    public Response createOferta(Oferta oferta){
        service.createOferta(oferta);

        Response.ResponseBuilder responseBuilder = Response.ok();

        Response resposta = responseBuilder.entity(oferta).build();
        return resposta;
    }

    @GET 
    public Response getAlOfertas(){
        return Response.ok(service.getAllOfertas()).build();
    }
}
