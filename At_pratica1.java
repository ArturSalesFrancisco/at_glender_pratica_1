/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.at_pratica1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 1648052
 */
public class At_pratica1 {

    public static void main(String[] args) {
        ArrayList<Veterinario> listaVeterinarios = new ArrayList<Veterinario>();
        
        Scanner entrada = new Scanner(System.in);
        for(int i = 0; i < 3; i++){
            String nome = entrada.next();
            String cpf = entrada.next();
            String especialidade = entrada.next();
            String telefone = entrada.next();
            Veterinario vet = new Veterinario(nome, cpf, especialidade, telefone);
            listaVeterinarios.add(vet);
        }
        
        ArrayList<Sala> listaSalas = new ArrayList<Sala>();
       
        for(int i = 0; i < 3; i++){
            int numero = entrada.nextInt();
            int bloco = entrada.nextInt();
            int capacidadeMax = entrada.nextInt();
            String tipo = entrada.next();
            Sala sala = new Sala(numero, bloco, capacidadeMax, tipo);
            listaSalas.add(sala);
        }
        
        
        
        
    }
}
