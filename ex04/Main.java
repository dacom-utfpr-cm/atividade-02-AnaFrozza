/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade02.ex04;

/**
 *
 * @author ana
 */
/**
 * Faça um programa em Java que realize uma busca paralela em um vetor de
 * inteiros Informe para o método: valor procurado, vetor de inteiros e o número
 * de threads.
 */

public class Main {

    public static void main(String[] args) {
        int[] vetor_int = null;
        int valor = 20;
        int num_threads = 5;

        for (int i = 0; i < 50; i++) {
            vetor_int[i] = i;
        }

        for (int i = 0; i < num_threads; i++) {
            ThreadBusca buscar = new ThreadBusca(valor, vetor_int, num_threads);
            buscar.start();
        }

        System.out.println("Concluido!");
    }
}
