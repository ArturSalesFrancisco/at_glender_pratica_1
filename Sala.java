/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.at_pratica1;

import java.util.ArrayList;

/**
 *
 * @author 1648052
 */
public final class Sala {

    /**
     * @return the atenFinalizado
     */
    public ArrayList<Atendimento> getAtenFinalizado() {
        return atenFinalizado;
    }

    /**
     * @param atenFinalizado the atenFinalizado to set
     */
    public void setAtenFinalizado(ArrayList<Atendimento> atenFinalizado) {
        this.atenFinalizado = atenFinalizado;
    }

    /**
     * @return the atenAgendado
     */
    public ArrayList<Atendimento> getAtenAgendado() {
        return atenAgendado;
    }

    /**
     * @param atenAgendado the atenAgendado to set
     */
    public void setAtenAgendado(ArrayList<Atendimento> atenAgendado) {
        this.atenAgendado = atenAgendado;
    }

    /**
     * @return the atenAndamento
     */
    public ArrayList<Atendimento> getAtenAndamento() {
        return atenAndamento;
    }

    /**
     * @param atenAndamento the atenAndamento to set
     */
    public void setAtenAndamento(ArrayList<Atendimento> atenAndamento) {
        this.atenAndamento = atenAndamento;
    }

    /**
     * @return the atendimentos
     */
    public ArrayList getAtendimentos() {
        return atendimentos;
    }

    /**
     * @param atendimentos the atendimentos to set
     */
    public void setAtendimentos(ArrayList atendimentos) {
        this.atendimentos = atendimentos;
    }
    /**
     * @return the veterinario
     */
    public Veterinario getVeterinario() {
        return veterinario;
    }

    /**
     * @param veterinario the veterinario to set
     */
    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the bloco
     */
    public int getBloco() {
        return bloco;
    }

    /**
     * @param bloco the bloco to set
     */
    public void setBloco(int bloco) {
        this.bloco = bloco;
    }

    /**
     * @return the capacidadeMax
     */
    public int getCapacidadeMax() {
        return capacidadeMax;
    }

    /**
     * @param capacidadeMax the capacidadeMax to set
     */
    public void setCapacidadeMax(int capacidadeMax) {
        this.capacidadeMax = capacidadeMax;
    }

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

    public Sala(int numero, int bloco, int capacidadeMax, String tipo) {
        this.numero = numero;
        this.bloco = bloco;
        this.capacidadeMax = capacidadeMax;
        this.tipo = tipo;
    }
    private int numero;
    private int bloco;
    private int capacidadeMax;
    private String tipo;
    private Veterinario veterinario;
    private ArrayList<Atendimento> atendimentos;
    private ArrayList<Atendimento> atenFinalizado;
    private ArrayList<Atendimento> atenAgendado;
    private ArrayList<Atendimento> atenAndamento;
    
    public void associarVet(Veterinario veterinario){
        this.veterinario = veterinario;
    }
    
    public ArrayList adicionarAtendimento(Atendimento atendimento){
        this.atendimentos.add(atendimento);
        return this.atendimentos;
    }
    
    public int quantidadeAtendimentos(){
        return this.atendimentos.size();
    }
    
    public int atendimentosFinalizados(){
        int cont = 0;
        for(int i = 0; i < this.atendimentos.size(); i++){
            if("finalizado".equals(this.atendimentos.get(i).getStatus())){
                cont++;
            }
        }
        return cont;
    }
    
    public ArrayList buscarAtendimento(String status){
        if("finalizado".equals(status)){
            for(int i = 0; i < this.atendimentos.size(); i++){
                if("finalizado".equals(this.atendimentos.get(i).getStatus())){
                    this.atenFinalizado.add(this.atendimentos.get(i));
            }
        }
    }
       return this.atenFinalizado;
    }

    public void exibirAtendimentos(){
        for (Atendimento atendimento : this.atendimentos) {
            atendimento.exibirDetalhes();
        }
    }
    

    

