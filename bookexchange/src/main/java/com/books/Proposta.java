package com.books;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity 
public class Proposta {

    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private String localizacao;

    @Override 
    public String toString(){
        return "Localização" + localizacao;
    }
    
    @ManyToOne
    @JoinColumn(name = "idOferta", referencedColumnName = "idOferta")
    private Oferta oferta;

    @ManyToOne
    @JoinColumn(name = "idLivro", referencedColumnName = "idLivro")
    private Livro livro;

    @ManyToOne
    @JoinColumn(name = "idUtilizador")
    private Utilizador utilizador;
    


    //getters setters
    
    public Proposta() {
        }
 
    
    public Utilizador getUtilizador() {
        return utilizador;
    }

    public void setUtilizador(Utilizador utilizador) {
        this.utilizador = utilizador;
    }


    public Livro getLivro() {
        return livro;
    }


    public void setLivro(Livro livro) {
        this.livro = livro;
    }


    public Oferta getOferta() {
        return oferta;
    }


    public void setOferta(Oferta oferta) {
        this.oferta = oferta;
    }


    public String getLocalizacao(){
        return localizacao;
    }
        

    public void setLocalizacao(String localizacao){
        this.localizacao = localizacao;
    }


    public int getId() {
         return id;
        }

    public void setId(int id) {
        this.id = id;
        }
}
