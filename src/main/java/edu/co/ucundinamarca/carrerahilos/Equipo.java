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

public class Equipo{
    
    private String posicion;
    
    public Equipo(String posicion) {
        this.posicion = posicion;
    }
    
    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    } 

}
