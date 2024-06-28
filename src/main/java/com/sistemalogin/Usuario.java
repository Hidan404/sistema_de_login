package com.sistemalogin;

public class Usuario {
    private String username;
    private String password;
    
    public Usuario(String nome, String senha) {
        this.username = nome;
        this.password = senha;
    }

    public String getNome() {
        return username;
    }

    public void setNome(String nome) {
        this.username = nome;
    }

    public String getSenha() {
        return password;
    }

    public void setSenha(String senha) {
        this.password = senha;
    }

    
}
