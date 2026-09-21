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

    public Utilizador login(String email, String password){

       try{
            return em.createQuery(
                "SELECT u FROM Utilizador u " + 
                "WHERE u.email = :email AND u.password = :password", //procura por um user com 2 valores (mail e passe)
                Utilizador.class)
                .setParameter("email", email) //parametros preenchidos pelo mail e pass
                .setParameter("password", password)
                .getSingleResult(); //se encontrar o user com o mail e passe certos devolve-o

        } catch (jakarta.persistence.NoResultException e){
            return null; //não encontra devolve null
        }
    } 

}