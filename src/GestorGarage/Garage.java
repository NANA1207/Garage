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
public class Garage {

    Vehiculo[] vehiculos;
    //constantes
    final int TAMAÑO = 30;
    int tiempo;

    Garage() {
        vehiculos = new Vehiculo[TAMAÑO];

    }

    // ingresarVehiculo
    public boolean ingresarVehiculo(Vehiculo vehiculo) {
        int pos = 0;
        while (pos < vehiculos.length && vehiculos[pos] != null) {
            pos++;
        }
        if (pos < vehiculos.length) {
            vehiculos[pos] = vehiculo;            
            System.out.println(Ticket.fecha());
            return true;
        }
        return false;

    }

    //buscar
    Vehiculo buscarVehiculo(String placa) {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo != null && vehiculo.placa.equals(placa)) {
                return vehiculo;
            }
        }
        return null;
    }

    /*boolean eliminar(String placa) {
        int k = vehiculos.length;
        for (int pos = 0; pos < k - 1; pos++) {
            if (vehiculos[pos] != null) {
                if (vehiculos[pos].placa.equals(placa)) {
                    vaciar(pos);
                    return true;
                }
            } else {
                return false;
            }
        }
        return false;
    }

    private void vaciar(int x) {
        int k = vehiculos.length;
        for (int pos = x; pos < k - 1; pos++) {
            vehiculos[pos] = vehiculos[pos + 1];
        }
        k--;
    }
   */
    //cerificar si hay carros

    public boolean verificarVehiculos() {
        int pos = 0;
        if (vehiculos[pos] == null) {
            System.out.println("no existen vehiculos registrados");
            return false;
        }
        return true;
    }

    // eliminar
    public boolean eliminarVehiculo(String placa, int hora) {
        int pos = 0;
        if (verificarVehiculos() == true) {
            while (pos < vehiculos.length) {

                if (vehiculos[pos] != null && vehiculos[pos].placa.equals(placa)) {
                    vehiculos[pos] = null;
                }
                pos++;
            }
            pos = 0;
            while (pos < vehiculos.length) {

                if (vehiculos[pos] == null) {
                    while (pos + 1 < vehiculos.length) {
                        vehiculos[pos] = vehiculos[pos + 1];
                        System.out.println(Ticket.fecha());
                        System.out.println(Ticket.totalPagar(hora));
                        pos++; 
                    }
                }
                pos++;
            }
        }

        return false;
    }
        

    public void mostrarDatos() {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo != null) {
                System.out.println(Mensajes.NOTIF.DATOS_VEHICULO.tx());
                System.out.println(Mensajes.NOTIF.PLACA.tx() + vehiculo.placa);
                System.out.println(Mensajes.NOTIF.COLOR.tx() + vehiculo.color);
                System.out.println(Mensajes.NOTIF.TIEMPO.tx() + vehiculo.tiempo);
                System.out.println(Mensajes.NOTIF.CEDULA.tx() + vehiculo.Ci_propietario);
                System.out.println("-----------------------------------");
            }
        }

    }
}
