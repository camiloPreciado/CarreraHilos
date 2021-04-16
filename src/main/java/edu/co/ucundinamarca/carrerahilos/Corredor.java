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
public class Corredor extends Thread{
    /**
     * Almacena el nombre del Corredor
     */
    private String nombre;
    
    /**
     * Almacena En que equipo se encuentra
     */
    private Equipo equipo;
    
    /**
     * Almacena la ubicacion al inicio de la carrera
     */
    private int posicion;
    
    /**
     *Constructor de la clase
     */
    public Corredor(String nombre, Equipo equipo, int posicion) {
        this.nombre = nombre;
        this.equipo = equipo;
        this.posicion = posicion;
    }

    /**
     * Ejecuta el Hilo
     */
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

    
    /**
     * Metodos set y get de las variables Nombre, Equipo y Posicion
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

   
}
