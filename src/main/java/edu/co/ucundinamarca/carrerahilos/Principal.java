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
        Equipo e1 = new Equipo("Primer Corredor");
        Equipo e2 = new Equipo("Segundo Corredor");
        Equipo e3 = new Equipo("Tercer Corredor");
        
        List<Equipo> inicio = new ArrayList<>();
        inicio.add(e1);
        
        List<Equipo> intermedio = new ArrayList<>();
        intermedio.add(e2);
        
        List<Equipo> fin = new ArrayList<>();
        fin.add(e3);
        

        
        Corredor c1 = new Corredor("Corredor 1A", inicio);
        Corredor c2 = new Corredor("Corredor 1B", inicio);
        Corredor c3 = new Corredor("Corredor 1C", inicio);
        
        Corredor c4 = new Corredor("Corredor 2A", intermedio);
        Corredor c5 = new Corredor("Corredor 2B", intermedio);
        Corredor c6 = new Corredor("Corredor 2C", intermedio);
        
        Corredor c7 = new Corredor("Corredor 3A", fin);
        Corredor c8 = new Corredor("Corredor 3B", fin);
        Corredor c9 = new Corredor("Corredor 3C", fin);
        
        c1.start();
        c2.start();
        c3.start();
     /*   c4.start();
        c5.start();
        c6.start();
        c7.start();
        c8.start();
        c9.start();*/
        
        
        
        try {  
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        c1.interrupt();
        c2.interrupt();
        c3.interrupt();
      /*  c4.interrupt();
        c5.interrupt();
        c6.interrupt();
        c7.interrupt();
        c8.interrupt();
        c9.interrupt();*/
        
        //&& !c4.isAlive() && !c5.isAlive() && !c6.isAlive() && !c7.isAlive() && !c8.isAlive() && !c9.isAlive()
        while(true) {
            if(!c1.isAlive() && !c2.isAlive() && !c3.isAlive() ) {
                break;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }        
        
        System.out.println("Fin");
        
    }
    
    
    public static void main(String[] args) {
        new Principal();
    }
}
