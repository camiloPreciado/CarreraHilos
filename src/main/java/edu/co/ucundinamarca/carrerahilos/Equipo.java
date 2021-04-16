/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.ucundinamarca.carrerahilos;


/**
 *
 * @author Camilo Preciado
 * @since 1.0
 * @version 1.3.2
 */

public class Equipo{
    
    /**
     * Controla el Primer Relevo
     */
    private boolean relevo1;
    
    /**
     * Controla el Segundo Relevo
     */
    private boolean relevo2;
    
    /**
     * Almacena los pasos que avanza cada Corredor
     */
    private int pasos;
    
    /**
     * Constructor de la clase
     */
    public Equipo(){
        this.relevo1 = false;
        this.relevo2 = false;
    }
    
    /**
     * Metodo que calcula los pasos
     */
    public void pasos() {
       pasos = (int)(Math.random()*3+1);
    }
    
    /**
     * Metodo del primer corredor
     */
    public synchronized void corredor1(String nombre){
        for(int i = 0; i <= 9;) {
            pasos();
            i=i+pasos;   
            System.err.println("El corredor: "+nombre+" Avanza "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }     
        }
        System.out.println("Realiza relevo: "+nombre);
        this.relevo1 = true;
        notify();
    }
    
    
    /**
     * Metodo del Segundo corredor
     */
    public synchronized void corredor3(String nombre){
        try {
            if(this.relevo2){
                wait();
                System.out.println(nombre);
            }else{
                for(int i = 0; i <= 9;) {
                    pasos();
                    i=i+pasos;   
                    System.err.println("El corredor: "+nombre+" Avanza "+i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                    }     
                }
                System.out.println("Segundo Relevo: "+nombre);
            }
        } catch (InterruptedException ex) {
        }     
    }
    
    
    /**
     * Metodo del Tercer corredor
     */
    public synchronized void corredor2(String nombre){      
        try {
            if(!this.relevo1){
                wait();
                 System.out.println(nombre);

            }else{
                for(int i = 0; i <= 9;) {
                    pasos();
                    i=i+pasos;   
                    System.err.println("El corredor: "+nombre+" Avanza "+i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                    }     
                }
                this.relevo2 = true;
                System.out.println("Finaliza la carrera: "+nombre);
                System.exit(0);
            }
        } catch (InterruptedException ex) {
        }  
    }
    

    /**
     * Metodo set y get de las variables relevo1, relevo2, y pasos
     */
    public boolean isRelevo1() {
        return relevo1;
    }

    public void setRelevo1(boolean relevo1) {
        this.relevo1 = relevo1;
    }

    public boolean isRelevo2() {
        return relevo2;
    }

    public void setRelevo2(boolean relevo2) {
        this.relevo2 = relevo2;
    }

    public int getPasos() {
        return pasos;
    }

    public void setPasos(int pasos) {
        this.pasos = pasos;
    }
    
    
    
}
