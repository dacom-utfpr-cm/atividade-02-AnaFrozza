/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade02.ex02;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ana
 */
public class GroupThread extends Thread {

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
            System.out.println("Grupo Thread " + Thread.currentThread().getId());
        } catch (InterruptedException ex) {
            Logger.getLogger(GroupThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
