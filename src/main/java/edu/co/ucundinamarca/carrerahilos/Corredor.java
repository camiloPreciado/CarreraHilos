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
public class Corredor extends Thread{
    
    private String nombre;
    
    private int pasos;
    
    private boolean bandera;
    
    //Listado de corredores en equipo
    private List<Equipo> posicion;

    public Corredor(String nombre, List<Equipo> equipo) {
        this.nombre = nombre;
        this.posicion = equipo;
        this.bandera = false;
    }
    
    public void pasos() {
       pasos = (int)(Math.random()*3+1);
    }
    
    @Override
    public void run(){
        for (Equipo c : posicion) { 
            for(int i = 0; i <= 9;) {
                pasos();
               System.out.println("Valor de paso: "+ nombre +" " + pasos);
                i=i+pasos;   
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                }     
            }
            System.out.println(nombre + " Finaliza pasos: ");
        }
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Equipo> getPosicion() {
        return posicion;
    }

    public void setPosicion(List<Equipo> posicion) {
        this.posicion = posicion;
    }

    public int getPasos() {
        return pasos;
    }

    public void setPasos(int pasos) {
        this.pasos = pasos;
    }

    public boolean isBandera() {
        return bandera;
    }

    public void setBandera(boolean bandera) {
        this.bandera = bandera;
    }

    



     
    
}
