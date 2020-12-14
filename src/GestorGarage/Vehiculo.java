/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestorGarage;



/**
 *
 * @author Intel
 */
public class Vehiculo {

    String placa;
    String color;
    Personas propietario = new Personas() ;
    Vértice vehiculo;

    public Vehiculo(String placa, String color, Persona persona) {
        this.placa = placa;
        this.color = color;
        this.propietario.insertarVértice(persona);
        vehiculo.arcos.insertar(propietario);
    }
    
  
    void insertarPropietario(Persona persona){
        
        
    }
     
    

    public void vehiculoDatos() {
        System.out.println(Mensajes.NOTIF.PLACA.tx() + this.placa);
        System.out.println(Mensajes.NOTIF.COLOR.tx() + this.color);    
       // System.out.println(Mensajes.NOTIF.CEDULA.tx() + this.propietario.cedula);

    }
     /*  public static void main(String[] args) {
           Persona per=new Persona("noms","ap","ced","tel");
           
           Vehiculo v=new Vehiculo("oli", "lo",per);
           VehiculoV vs= new VehiculoV(v);
        //Vehiculo_Propietario m = new Vehiculo_Propietario(g);
        System.out.println(((Persona)(((PersonaV)(vs.propietario.destino)).dato)).apellido);
       
    }*/

}
