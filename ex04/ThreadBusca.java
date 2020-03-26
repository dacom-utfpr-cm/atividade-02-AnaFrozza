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
public class ThreadBusca extends Thread{
    int valor;
    int[] vetor;
    int num_threads;

    public ThreadBusca(int valor, int[] vetor, int num_threads) {
        this.valor = valor;
        this.vetor = vetor;
        this.num_threads = num_threads;

    }

    @Override
    public void run() {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valor) {
                System.out.println("Valor encontrado: " + valor);
                return;
            }
        }
    }

}
