package com.crud;

public class Utilizador {
    int idUtilizador;
    char userName;
    String nome;
    char email;
    char password;

public void utilzador(int idUtilizador, char userName, String nome, char email, char password){
    this.idUtilizador = idUtilizador;
    this.userName = userName;
    this.nome = nome;
    this.email = email;
    this.password = password;

}

public int getIdUtilizador() {
    return idUtilizador;
}

public void setIdUtilizador(int idUtilizador) {
    this.idUtilizador = idUtilizador;
}

public char getUserName() {
    return userName;
}

public void setUserName(char userName) {
    this.userName = userName;
}

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public char getEmail() {
    return email;
}

public void setEmail(char email) {
    this.email = email;
}

public char getPassword() {
    return password;
}

public void setPassword(char password) {
    this.password = password;
}

    
}
