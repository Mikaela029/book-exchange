package com.books;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

/*CRUD

Criar um endpoint (“/) que permita fazer operações CRUD:
        Usar o método POST para criar um novo livro.
        Usar o método GET para ler todos os livro.
*/

//os parenteses são para o metodo, se não tiver nao necessita

@Path("/livro")
public class Controller {

@Inject
private Service service; 

        @POST //so posso utilizar os metodos como o responseBuiler.entity porque estabeleci que o tipo a usar seria o Response
        public Response createBook(Livro livro) { //o tipo definido é Response. nesta linha é para o metodo saber que tipos de dados os netodos vai devolver
                service.createBook(livro); 

                Response.ResponseBuilder responseBuilder = Response.ok();
                
                Response resposta = responseBuilder.entity(livro).build(); //livro é a variável
                return resposta;
        }

        /*
        @GET
        public Response getAllBooks() {
                
                Response.ResponseBuilder responseBuilder = Response.ok();
                
                Response resposta = responseBuilder.entity(new Livro()).build(); //Livro é o método da classe livro para criar um novo, ()é o construtor vazio. este comando cria um livro vazio para o json ler, ainda é de teste
                return resposta;
        }       */
       @GET
        public Response getAllBooks() {
                return Response.ok(service.getAllBooks()).build();
        }        
                
}