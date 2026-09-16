package com.books;

import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@ApplicationScoped 
public class OfertaRepository {

    @PersistenceContext 
    private EntityManager em;

    public void createOferta(Oferta oferta) {
        em.persist(oferta);
    }
    
    public List<Oferta> getAllOfertas(){
        return em.createQuery("SELECT o FROM Oferta o", Oferta.class).getResultList();
    }

}
