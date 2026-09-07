package com.crud;

public class Livro {
    public String titulo;
    public String autor;
    public int edicao;
    public int idLivro;
    public String tipoCapa;
    public String lingua;

    
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

    
