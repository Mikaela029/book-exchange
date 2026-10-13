package com.books; 

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity 
public class Oferta {
    
    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private String localizacao;

    @Override 
    public String toString(){
        return "Localização" + localizacao;
    }

    @ManyToOne//oferta associada a um livro
    @JoinColumn (name = "idLivro", nullable = false) //na tabela da oferta o JPA cria/usa uma coluna chamada idLivro para guardar a FK do livro
    private Livro livro; //a classe Oferta guarda uma referencia ao objeto Livro, e nao repete a info (titulo autor...)

    @ManyToOne
    @JoinColumn (name = "idUtilizador", nullable = false) //nullable = false indica que a coluna da chave estrangeira não pode ficar a NULL na base de dados.
    private Utilizador utilizador; 

    //getters setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public Livro getLivro(){
        return livro;
    }

    public void setLivro(Livro livro){ //recebe o objeto (Livro) e guarda dentro do atributo livro da classe
        this.livro = livro; //atribui este livro a oferta
    }
    public Utilizador getUtilizador() {
        return utilizador;
        }

    public void setUtilizador(Utilizador utilizador) {
        this.utilizador = utilizador;
        }
    }
    

