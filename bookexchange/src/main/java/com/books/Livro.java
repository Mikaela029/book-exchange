package com.books;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity 
public class Livro {

    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;

    public String toDString(){
        return "Título: " + titulo + ", Autor: " + autor + "Edição: " + edicao + "Id do Livro: " + idLivro + "Tipo de Capa: " + tipoCapa + "Língua: " + lingua;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){ 
        this.id = id;
    }

    //private so é acessivel dentro da classe (Livro), qualquer codigo fora da public class livro nao consegue aceder
    //protected coisas fora do package conseguem aceder, ou que herdem 

    //o public, private e protected são modificadores de visibilidade/acesso (visibility modifiers)
    //o static é um modificador que não é de visibilidade

    //o valor default das classes é null, do int é 0

    private String titulo;
    private String autor;
    private int edicao;
    private int idLivro;
    private String tipoCapa;
    private String lingua;
    
    public void livro (String titulo, String autor, int edicao, int idLivro, String tipoCapa, String lingua) {
        this.titulo = titulo;
        this.autor = autor;
        this.edicao = edicao;
        this.idLivro = idLivro;
        this.tipoCapa = tipoCapa;
        this.lingua = lingua;
        
    }
    
    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo; //usamos o atributo da classe
    }

    public String getAutor(){
        return autor;
    }

    public void setAutor (String autor){
        this.autor = autor;
    }

    public int getEdicao(){
        return edicao;
    }
   
    public void setEdicao(int edicao){
        this.edicao = edicao;
    }

    public int getIdLivro(){
        return idLivro;
    }

    public void setIdLivro(int idLivro){
        this.idLivro = idLivro;
    }

    public String getTipoCapa(){
        return tipoCapa;
    }

    public void setTipoCapa(String tipoCapa){
        this.tipoCapa = tipoCapa;  
    }
      
    public String getLingua(){
        return lingua;
    }

    public void setLingua(String lingua){
        this.lingua = lingua;
    }

    }

    
