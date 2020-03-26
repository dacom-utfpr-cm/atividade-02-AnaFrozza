/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade02.ex01;

/**
 *
 * @author ana
 */

/**
 * Faça um programa em Java que consulte periodicamente o estado de um conjunto de threads.
 */
public class Main {
    public static void main(String[] args) {
        Thread[] threads = new Thread[5];
        for(int i = 0; i < 5; i++){
            threads[i] = new Thread();
            threads[i].start();
        }        
        Thread consulta = new Consulta(threads);
        consulta.start();        
        System.out.println("Concluido!");
        
    }
}
