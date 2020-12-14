/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestorGarage;

/**
 *
 * @author Usuario
 */
public class Vehiculos extends Grafo {
    
 

   @Override
    public boolean insertarVértice(Object vehiculo) {
        if (vehiculo instanceof Vehiculo) {
            return super.vértices.insertarPorPrimero(vehiculo);
            }
        return false;
        

            
    }

    Vehiculo buscarVehiculo(String placa) {
        Nodo aux = this.vértices.primero;
        while (aux != null) {
            if (((Vehiculo)(((Vértice) (aux.dato)).dato)).placa.equals(placa)) {
                return (Vehiculo)((Vértice) (aux.dato)).dato;
            }
            aux = aux.siguiente;
        }
        return null;

    }
    

    
    

    
    
    

  /* @Override
    public boolean insertarVértice(Object vehiculo) {
        if (vehiculo instanceof Vehiculo) {
            return super.vértices.insertarPorPrimero(vehiculo);
            }
        return false;
        

            
    }

    Vehiculo buscarVehiculo(String placa) {
        Nodo aux = this.vértices.primero;
        while (aux != null) {
            if (((Vehiculo)(((Vértice) (aux.dato)).dato)).placa.equals(placa)) {
                return (Vehiculo)((Vértice) (aux.dato)).dato;
            }
            aux = aux.siguiente;
        }
        return null;

    }
    */
   
   
}
