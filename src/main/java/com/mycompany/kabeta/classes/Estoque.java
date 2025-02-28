package com.mycompany.kabeta.classes;
public class Estoque{
    private int id;
    private String nome;
    private String tipo;
    private int numero;
    private int quantidade;   
    private int mes;
    public Estoque(){
    }
    public Estoque(int id, String nome, String tipo, int numero, int quantidade, int mes){
        this.id= id;
        this.nome = nome;
        this.tipo = tipo;
        this.numero = numero;
        this.quantidade = quantidade;
        this.mes = mes;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id= id;
    }
    public String getNome(){
    return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public int getNumero(){
        return numero;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
    public int getQuantidade(){
        return quantidade;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
}
