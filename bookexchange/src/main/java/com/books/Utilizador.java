package com.books;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity 
public class Utilizador {

    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;

    public int getId(){
        return id;
    }

    public void setId(int id){ 
        this.id = id;
    }

    String userName;
    String nome;
    String email;
    String password;

public void utilizador(String userName, String nome, String email, String password){
    this.userName = userName;
    this.nome = nome;
    this.email = email;
    this.password = password;
}

public String getUserName() {
    return userName;
}

public void setUserName(String userName) {
    this.userName = userName;
}

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public String getEmail() {
    return email;
}

public void setEmail(String email) {
    this.email = email;
}

public String getPassword() {
    return password;
}

public void setPassword(String password) {
    this.password = password;
}

@Override
public String toString() {
    return "Utilizador [id=" + id + ", idUtilizador=" + ", userName=" + userName + ", nome=" + nome
            + ", email=" + email + ", password=" + password + "]";
}

}
