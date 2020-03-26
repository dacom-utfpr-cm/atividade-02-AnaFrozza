/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade02.ex02;

/**
 *
 * @author ana
 */
/**
 * Faça um programa em Java para testar um conjunto de operações sobre um grupo
 * de threads Use o ThreadGroup.
 */
public class Main {

    public static void main(String[] args) {

        ThreadGroup group = new ThreadGroup("Thread");

        for (int i = 0; i < 5; i++) {
            Thread t = new Thread(group, new GroupThread());
            t.start();
        }

        System.out.println("Concluido!");
    }
}
