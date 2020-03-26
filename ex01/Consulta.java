/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade02.ex01;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ana
 */
public class Consulta extends Thread {

    Thread[] list;

    public Consulta(Thread[] list) {
        this.list = list;
    }

    @Override
    public void run() {
        try {
            while (true) {
                for (int i = 0; i < 5; i++) {
                    Thread.sleep(5000);
                    System.out.println("Thread: " + list[i].getName());
                }
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Consulta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
