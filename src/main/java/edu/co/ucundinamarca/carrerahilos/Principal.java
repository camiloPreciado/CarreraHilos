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
public class Principal {
    
    /**
     * Costructor encargado de ejecutar el metodo iniciar
     */
    public Principal(){
        iniciar();
    }
    
    /**
     * Crea los objetos de las clases incluyendo la ejecucion de los hilos
     */
    public void iniciar(){
        Equipo r = new Equipo();
        Equipo a = new Equipo();
        Equipo v = new Equipo();

        //Hilos del Equipo Rojo
        Corredor c1 = new Corredor("1R", r, 1);
        Corredor c2 = new Corredor("3R", r, 2);
        Corredor c3 = new Corredor("2R", r, 3);
        
        //Hilos del Equipo Azul
        Corredor c4 = new Corredor("1A", a, 1);
        Corredor c5 = new Corredor("3A", a, 2);
        Corredor c6 = new Corredor("2A", a, 3);
        
        //Hilos del Equipo Verde
        Corredor c7 = new Corredor("1V", v, 1);
        Corredor c8 = new Corredor("3V", v, 2);
        Corredor c9 = new Corredor("2V", v, 3);

        
        c1.start();
        c2.start();
        c3.start();
        
        c4.start();
        c5.start();
        c6.start();
        
        c7.start();
        c8.start();
        c9.start();
        
        try {
            c2.sleep(2000);
            c3.sleep(2000);
            
            c5.sleep(3000);
            c6.sleep(3000);
            
            c8.sleep(4000);
            c9.sleep(4000);
        } catch (InterruptedException ex) {
        }

        c1.interrupt();
        c2.interrupt();
        c3.interrupt();
        
        c4.interrupt();
        c5.interrupt();
        c6.interrupt();
        
        c7.interrupt();
        c8.interrupt();
        c9.interrupt();
        
    }
    
    /**
     * Crea un objeto de la clase Principal
     */
    public static void main(String[] args) {
        new Principal();
    }
}
