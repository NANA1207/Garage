/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestorGarage;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Ticket {
    int tiempo_entrada;
    int tiempo_salida;
    
    public static String fecha(){
        Date fecha= new Date();
        SimpleDateFormat formato = new SimpleDateFormat();
        
        return formato.format(fecha);
    }
    public static double totalPagar(int hora){
        double precio;
        precio = hora*1;
        return precio;
    }
    public static void main(String[] args) {
        System.out.print(fecha());
    }
}
