package com.books;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path ("/proposta")
public class PropostaController {

@Inject 
private PropostaService service;

    @POST 
    public Response createProposta(Proposta proposta){
        service.createProposta(proposta);

        Response.ResponseBuilder responseBuilder = Response.ok();
        
        Response resposta = responseBuilder.entity(proposta).build();
        return resposta;
    }

    @GET 
    public Response getAllPropostas(){
        return Response.ok(service.getAllPropostas()).build();
    }
}
