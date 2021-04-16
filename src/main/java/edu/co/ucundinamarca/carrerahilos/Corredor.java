/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.ucundinamarca.carrerahilos;

/**
 *
 * @author Camilo Preciado
 */
public class Corredor extends Thread{
    String nombre;
    Equipo equipo;
    int posicion;

    public Corredor(String nombre, Equipo equipo, int posicion) {
        this.nombre = nombre;
        this.equipo = equipo;
        this.posicion = posicion;
    }

    
    @Override
    public void run() {
        //System.out.println("LLego al corredor "+nombre);
        
        if(posicion == 1){
            equipo.corredor1(nombre);
        }if(posicion == 2){
            equipo.corredor2(nombre);
        }if(posicion == 3){
            equipo.corredor3(nombre);
        }     
    }

   
}
