package GestorGarage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Vértice{
	Object dato;//guarda la ponderación del vértice
	Lista arcos;//conjunto de arcos que sale de un vértice
        
        Vértice( Object dato ){ //cuando se crea el vértice, se crea con dato como ponderación y sin arcos
            this.dato = dato;
            arcos = new Lista();
        }
}
 
