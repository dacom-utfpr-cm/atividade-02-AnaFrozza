/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade02.ex03;

/**
 *
 * @author ana
 */
/**
 * Faça um programa em Java com threads que exiba os números primos entre 0 e
 * 100000.
 */
public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 100000; i++) {
            ThreadPrimo thread = new ThreadPrimo(i);
            thread.start();
        }
        
        System.out.println("Concluido!");
    }

}
