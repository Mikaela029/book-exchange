//trata das regras da aplicação

package com.books;

import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;


@ApplicationScoped
public class UtilizadorService {

    @Inject
    private UtilizadorRepository repository;

    @Transactional
    public void createUser(Utilizador utilizador) {
        repository.createUser(utilizador);
    }

    public List<Utilizador> getAllUsers() {
        return repository.getAllUsers();
    }

    public Utilizador login(String email, String password){
        return repository.login(email, password);
    }

}