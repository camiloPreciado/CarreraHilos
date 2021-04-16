/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.ucundinamarca.carrerahilos;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Camilo Preciado
 */

public class Equipo{
    
    
    private boolean relevo1;
    private boolean relevo2;
    int pasos;
    
    public Equipo(){
        this.relevo1 = false;
        this.relevo2 = false;
    }
    public void pasos() {
       pasos = (int)(Math.random()*3+1);
    }
    
    public synchronized void corredor1(String nombre){
        System.out.println("");
        for(int i = 0; i <= 9;) {
            pasos();
            i=i+pasos;   
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }     
        }
       // System.out.println("Realiza relevo: "+nombre);
        this.relevo1 = true;
        notify();
    }
    
    public synchronized void corredor2(String nombre){      
        try {
            if(!this.relevo1){
                wait();
                 System.out.println(nombre);

            }else{
                for(int i = 0; i <= 9;) {
                    pasos();
                    i=i+pasos;   
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                    }     
                }
                this.relevo2 = true;
              //  System.out.println("Finaliza la carrera: "+nombre);
            }
        } catch (InterruptedException ex) {
        }  
    }
    
    public synchronized void corredor3(String nombre){
        try {
            if(this.relevo2){
                wait();
                System.out.println(nombre);
            }else{
                for(int i = 0; i <= 9;) {
                    pasos();
                    i=i+pasos;   
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                    }     
                }
              //  System.out.println("Segundo Relevo: "+nombre);
            }
        } catch (InterruptedException ex) {
        }     
    }
}
