package com.books;

import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.BadRequestException;
import jakarta.ws.rs.NotFoundException;

@ApplicationScoped 
public class OfertaService {
    
    @Inject 
    private OfertaRepository repository;

    @PersistenceContext 
    private EntityManager em;

    @Transactional 
    public void createOferta (Oferta oferta){
        if (oferta.getLivro() == null || oferta.getLivro().getId() <=0){
            throw new BadRequestException("Indique um livro existente.");
        }

        if (oferta.getUtilizador() == null || oferta.getUtilizador().getId() <=0){
            throw new BadRequestException("Indique um utilizador existente.");
        }

        Livro livro = em.find(Livro.class, oferta.getLivro().getId());
        if(livro == null){
            throw new NotFoundException("Livro não encontrado.");
        }

        Utilizador utilizador =
                em.find(Utilizador.class, oferta.getUtilizador().getId());
                
        oferta.setLivro(livro);
        oferta.setUtilizador(utilizador);

        repository.createOferta(oferta);

    }
    public List<Oferta> getAllOfertas(){
        return repository.getAllOfertas();
    }

}
