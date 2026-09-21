package com.books;

import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped 
public class PropostaService {
    
    @Inject
    private PropostaRepository repository;

    @Transactional 
    public void createProposta(Proposta proposta){
       
        repository.createProposta(proposta);
    }

    public List<Proposta> getAllPropostas(){
        return repository.getAllPropostas();
    }

}
