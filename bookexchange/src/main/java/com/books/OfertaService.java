package com.books;

import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped 
public class OfertaService {
    
    @Inject 
    private OfertaRepository repository;

    @Transactional 
    public void createOferta (Oferta oferta){
        repository.createOferta(oferta);

    }
    public List<Oferta> getAllOfertas(){
        return repository.getAllOfertas();
    }

}
