
package com.mycompany.kabeta.classes;

public class Vendas {
    private int id;
    private String produto;
    private double preco;
    private String cliente;
    private String data;
    private int mes;
    
    public Vendas(){
    }   
    public Vendas(int id,String produtos, double preco, String cliente, String data, int mes){
        this.id= id;
        this.produto = produto;
        this.preco = preco;
        this.cliente = cliente;
        this.data = data;
        this.mes =mes;
    }
    public int getId(){
     return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getProduto(){
        return produto;
    }
    public void setProduto(String produto){
        this.produto = produto;
    }
    public double getPreco(){
        return preco;
    }
    public void setPreco(Double preco){
        this.preco=preco;
    }
    public String getCliente(){
        return cliente;
    }
    public void setCliente(String cliente){
        this.cliente = cliente;
    }
    public String getData(){
        return data;
    }
    public void setData(String data){
        this.data = data;
    }
    public int getMes(){
        return mes;
    }
    public void setMes(int mes){
        this.mes = mes;
    }
    
}

