package com.books;

import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class BookService {

    @Inject
    private BookRepository repository; //o 1 repositório é a classe, o repositorio a branco é o objeto criado na classe

    @Transactional
    public void createBook(Livro livro) { //referente ao POST
       
     repository.createBook(livro);
    }
    
    public List<Livro> getAllBooks() { //REFERENTE AO GET
        return repository.getAllBooks(); // o objeto repository tem as propriedades (funçoes) da classe Repository
    }
        
}
