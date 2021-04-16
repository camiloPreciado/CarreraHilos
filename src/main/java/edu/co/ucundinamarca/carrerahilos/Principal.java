/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.ucundinamarca.carrerahilos;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Camilo Preciado
 */
public class Principal {
    
    public Principal(){
        Equipo r = new Equipo();
        Equipo a = new Equipo();
        Equipo v = new Equipo();

        
        Corredor c1 = new Corredor("1R", r, 1);
        Corredor c2 = new Corredor("3R", r, 2);
        Corredor c3 = new Corredor("2R", r, 3);
        
        Corredor c4 = new Corredor("1A", a, 1);
        Corredor c5 = new Corredor("3A", a, 2);
        Corredor c6 = new Corredor("2A", a, 3);
        
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
        
        

          
        c1.interrupt();
        c2.interrupt();
        c3.interrupt();
        
        c4.interrupt();
        c5.interrupt();
        c6.interrupt();
        
        c7.interrupt();
        c8.interrupt();
        c9.interrupt();


       /*
        while(true) {
            if(!c1.isAlive() && !c2.isAlive()) {
                break;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }        
        
        System.out.println("Fin");*/


    }
    
    
    public static void main(String[] args) {
        new Principal();
    }
}
