/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.ucundinamarca.carrerahilos;

import java.util.List;

/**
 *
 * @author Camilo Preciado
 */
public class Corredor extends Thread{
    String nombre;
    List<Equipo> equipo;
    boolean estado;

    public Corredor(String nombre, List<Equipo> equipo, boolean estado) {
        this.nombre = nombre;
        this.equipo = equipo;
        this.estado = false;
    }
    
    
}
