package com.ambev.projetopratico4.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Produto {

    @Id
    private String  id;
    private String nome;
    private String descricao;
    private double preco;
    private boolean aguaComGas;
    private boolean refrigeranteComAcucar;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean isAguaComGas() {
        return aguaComGas;
    }

    public void setAguaComGas(boolean aguaComGas) {
        this.aguaComGas = aguaComGas;
    }

    public boolean isRefrigeranteComAcucar() {
        return refrigeranteComAcucar;
    }

    public void setRefrigeranteComAcucar(boolean refrigeranteComAcucar) {
        this.refrigeranteComAcucar = refrigeranteComAcucar;
    }
}