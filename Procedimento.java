/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.at_pratica1;

/**
 *
 * @author 1648052
 */
public class Procedimento {

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the duracao
     */
    public int getDuracao() {
        return duracao;
    }

    /**
     * @param duracao the duracao to set
     */
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * @return the complexidade
     */
    public int getComplexidade() {
        return complexidade;
    }

    /**
     * @param complexidade the complexidade to set
     */
    public void setComplexidade(int complexidade) {
        this.complexidade = complexidade;
    }

    public Procedimento(String nome, String tipo, int duracao, double valor, int complexidade) {
        this.nome = nome;
        this.tipo = tipo;
        this.duracao = duracao;
        this.valor = valor;
        this.complexidade = complexidade;
    }
    private String nome;
    private String tipo;
    private int duracao;
    private double valor;
    private int complexidade;
    
}
