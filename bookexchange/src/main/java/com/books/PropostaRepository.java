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
    if (proposta.getUtilizador() != null) { //verifica se existe user associado a proposta
        Utilizador utilizador = em.find(Utilizador.class, proposta.getUtilizador().getId()); //em.find procura o user na base de dados
        proposta.setUtilizador(utilizador); //setUtilizador() associa esse user a proposta

    if (utilizador == null){
        throw new IllegalArgumentException("Utilizador não encontrado"); // se o id nao existir, o find() devolve null e a proposta pode falhar por nao ter user valido
        }    

    }

    em.persist(proposta); //guarda a resposta
}

    public List<Proposta> getAllPropostas(){
        return em.createQuery("SELECT p FROM Proposta p", Proposta.class).getResultList();
    }

}
