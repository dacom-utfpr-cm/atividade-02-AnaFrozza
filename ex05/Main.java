/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade02.ex05;

/**
 *
 * @author ana
 */
/**
 * Faça um programa multithreaded em Java que ordene um vetor usando o Merge Sort recursivo 
 * Faça com que a thread principal dispare duas threads para
 * classificar cada metade do vetor.
 */
public class Main {

    public static void main(String[] args) {
        int[] vetor = new int[100];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i + 1;
        }
        Threads t1 = new Threads(0, 49, vetor);
        Threads t2 = new Threads(50, 100, vetor);

        try {
            t1.start();
            t2.start();
            t1.join();
            t2.join();
        } catch (InterruptedException ex) {
            System.out.println("Erro: " + ex);
        }

        System.out.println("Vetor ordenado:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(" " + vetor[i]);
        }
    }

}
