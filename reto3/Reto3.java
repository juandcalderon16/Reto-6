package com.mycompany.reto3;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author juand.calderon
 */
public class Reto3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Automovil carrito;
        try {
            carrito = new Automovil("123plc","chevrolet", 2020, -1, "morado", 60000000, "lindo", "vendedor");
            System.out.println(carrito.calcularModelo());
        } catch (KilometrajeExcepcion ex) {
            System.out.println(ex.getMessage());
        }
        Vendedor vendedor1;
        try {
            vendedor1 = new Vendedor("1000378849", "Juan", "Bolibar", 19, 2020, 1560000000);
            System.out.println(vendedor1.calcularCalidad());
        } catch (EdadExcepcion | IngresoExcepcion ex) {
            System.out.println(ex.getMessage());
        }
        
        Motor motor1;
        try {
            motor1 = new Motor("yamaha","1200",-2);
            System.out.println(motor1.getPeso());
        } catch (PesoExecpcion ex) {
            System.out.println(ex.getMessage());
        }      
        
        Llanta llanta1;
        try {
            llanta1 = new Llanta("yamaha","1200",-1);
            System.out.println(llanta1.getPeso());
        } catch (PesoExecpcion ex) {
            System.out.println(ex.getMessage());
        }

    } 
}

