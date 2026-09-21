package com.books;

import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@ApplicationScoped
public class PropostaRepository {
    
    @PersistenceContext 
    private EntityManager em;

   public void createProposta(Proposta proposta) {

    em.persist(proposta); //guarda a resposta
}

    public List<Proposta> getAllPropostas(){
        return em.createQuery("SELECT p FROM Proposta p", Proposta.class).getResultList();
    }

}
