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
public class Atendimento {

    /**
     * @return the sala
     */
    public Sala getSala() {
        return sala;
    }

    /**
     * @param sala the sala to set
     */
    public void setSala(Sala sala) {
        this.sala = sala;
    }

    /**
     * @return the procedimentos
     */
    public ArrayList getProcedimentos() {
        return procedimentos;
    }

    /**
     * @param procedimentos the procedimentos to set
     */
    public void setProcedimentos(ArrayList procedimentos) {
        this.procedimentos = procedimentos;
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nomeAnimal
     */
    public String getNomeAnimal() {
        return nomeAnimal;
    }

    /**
     * @param nomeAnimal the nomeAnimal to set
     */
    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    /**
     * @return the especie
     */
    public String getEspecie() {
        return especie;
    }

    /**
     * @param especie the especie to set
     */
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    /**
     * @return the noemTutor
     */
    public String getNomeTutor() {
        return nomeTutor;
    }

    /**
     * @param noemTutor the noemTutor to set
     */
    public void setNomeTutor(String noemTutor) {
        this.nomeTutor = noemTutor;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * @return the horario
     */
    public String getHorario() {
        return horario;
    }

    /**
     * @param horario the horario to set
     */
    public void setHorario(String horario) {
        this.horario = horario;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    public Atendimento(int codigo, String nomeAnimal, String especie, String nomeTutor, String horario, String status) {
        this.codigo = codigo;
        this.nomeAnimal = nomeAnimal;
        this.especie = especie;
        this.nomeTutor = nomeTutor;
        this.horario = horario;
        this.status = status;
    }
    private int codigo;
    private String nomeAnimal;
    private String especie;
    private String nomeTutor;
    private String data;
    private String horario;
    private String status;
    private ArrayList<Procedimento> procedimentos;
    private Sala sala;
    
    public void atribuirSala(Sala sala){
        this.sala = sala;
    }
    
    public void exibirDetalhes(){
        System.out.println("NOME: " + nomeAnimal + ". ESPÉCIE: " +  especie + ". TUTOR: " + nomeTutor + ". DATA: " + data + ". HORÁRIO: " + horario + ". SALA: " + sala);
    }
    
}
