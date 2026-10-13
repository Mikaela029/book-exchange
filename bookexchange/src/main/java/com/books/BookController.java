package com.books;

import java.util.ArrayList;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;


//os parenteses são para o metodo, se não tiver nao necessita

@Path("/livro")
public class BookController {

@Inject
private BookService service; 

        @POST //so posso utilizar os metodos como o responseBuiler.entity porque estabeleci que o tipo a usar seria o Response
        public Response createBook(Livro livro) { //o tipo definido é Response. nesta linha é para o metodo saber que tipos de dados os netodos vai devolver
                service.createBook(livro); 

                Response.ResponseBuilder responseBuilder = Response.ok();
                
                Response resposta = responseBuilder.entity(livro).build(); //livro é a variável
                return resposta;
        }


       @GET
        public Response getAllBooks() {
                return Response.ok(service.getAllBooks()).build();
        }        
        
}