package com.books;

import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;


@ApplicationScoped
public class BookRepository {

    @PersistenceContext
    private EntityManager em; // o entity manager é o que fala com a base de dados, faz a comunicaçao entre as bases de dados (persistence)

    public void createBook(Livro livro) {
        em.persist(livro);
    
    }

    public List<Livro> getAllBooks() {
        return em.createQuery("SELECT l FROM Livro l", Livro.class).getResultList(); //o l é uma variavel que criamos, criamos so uma letra para simplificar
    }

}
