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
public class Grafo{
	Lista vértices;//conjunto de vértices de un grafo

	Grafo(){
	   vértices = new Lista();
	}
        
        boolean insertarVértice( Object dato ){
            return this.vértices.insertar( new Vértice( dato ) );
        }
       
        
        boolean insertarArco( Object ponderación, Vértice origen, Vértice destino ){
            if ( origen == null || !this.buscarVértice( origen ) )
                return false;
            return origen.arcos.insertar( new Arco( ponderación, destino ) );
        }

    private boolean buscarVértice(Vértice vértice) {
        Nodo aux = this.vértices.primero;
        while ( aux != null ){
            if ( (Vértice) aux.dato == vértice )
                return true;
            aux = aux.siguiente;
        }
        return false;
    }
     Vértice buscar( Object dato ){
        Nodo aux = this.vértices.primero;
        while(aux != null){
             if(aux.dato.equals(dato) ){
                return (Vértice)(aux.dato);
        }
            aux = aux.siguiente;
        }
       
        //este método deberá devolver el nodo con ponderación 'dato'
        return null;
    }
     /* Vértice buscar( Object dato ){
        Nodo aux = this.vértices.primero;
        while(aux != null){
             if(((Vértice)(aux.dato)).dato.equals(dato) ){
                return (Vértice)(aux.dato);
        }
            aux = aux.siguiente;
        }
       
        //este método deberá devolver el nodo con ponderación 'dato'
        return null;
    }*/
      void imprimirAdyacentes( Object datoOrigen ){
          Vértice aux = buscar(datoOrigen);
          Nodo aux2= aux.arcos.primero;
          while(aux2 != null ){
          System.out.println(((Vértice)(((Arco)(aux2.dato)).destino)).dato);
          aux2 = aux2.siguiente;
          }
     //implementar la impresión de la ponderación de los vértices destino de los arcos que salen del vértice con ponderación 'datoOrigen'
    }
    
}
