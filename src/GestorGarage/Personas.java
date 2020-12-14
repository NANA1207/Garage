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
public class Personas extends Grafo {




    @Override
    public boolean insertarVértice(Object dato) {
        if (dato instanceof Persona) {
            return super.vértices.insertarPorPrimero(dato);
        }
        return false;
    }

    Persona buscarPersona(String cedula) {
        Nodo aux = this.vértices.primero;
        while (aux != null) {
            if (((Persona)(((Vértice) (aux.dato)).dato)).cedula.equals(cedula)) {
                return (Persona)((Vértice) (aux.dato)).dato;
            }
            aux = aux.siguiente;
        }
        return null;

    }
    
      public static void main(String[] args) {
          Persona p= new Persona("gf","dw","ee","323");
          Personas g= new Personas ();
          Persona r = new Persona("gf","fr","rr","333") ;    
                  
        g.insertarVértice(p);
        g.insertarVértice(r);
        System.out.println(g.buscarPersona("rr").telefono);
        g.modificarTelefono("rr", "3444");
         System.out.println(g.buscarPersona("rr").telefono);
    }

      boolean modificarTelefono(String cedula, String nuevo_numero){
          Persona encontrado = buscarPersona(cedula);
           if(encontrado != null){
               encontrado.telefono= nuevo_numero;
               return true;
           }
               return false;
      }
   
}
