//comunica com a base de dados

package com.books;
import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@ApplicationScoped
public class UtilizadorRepository {

    @PersistenceContext
    private EntityManager em;

    public void createUser(Utilizador utilizador) {
        em.persist(utilizador);
    }

    public List<Utilizador> getAllUsers() {
        return em.createQuery("SELECT u FROM Utilizador u",Utilizador.class).getResultList();
    }
}