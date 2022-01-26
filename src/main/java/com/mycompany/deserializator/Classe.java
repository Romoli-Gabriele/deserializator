/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.deserializator;


import java.util.Vector;

/**
 *
 * @author maccasa
 */
public class Classe {
    public int annoDiInizio;
    public aula aula;
    public String classe;
    public int numeroFinestre;
    public String specializzazione;
    public Vector<studente> studenti;

    public void stampa(){
        System.out.println("La classe "+this.classe+" si trova nell'aula "+this.aula.nome+" ed è composta dai seguenti studenti:\n");
        for (studente studente : studenti) {
            System.out.println("- "+studente.cognome+"\n");
        }{}
        
    }
}
