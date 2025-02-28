package com.mycompany.kabeta.classes;
public class Usuario {
    private String nome;
    private String senha;
    private String nomeVelho;
    public Usuario(String nome, String senha,String nomeVelho) {
        this.nome = nome;
        this.senha = senha;
        this.nomeVelho= nomeVelho;
    }
    public Usuario(){
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
     public String getNomeVelho() {
        return nomeVelho;
    }
    public void setNomeVelho(String nomeVelho) {
        this.nomeVelho = nomeVelho;
    }
}
