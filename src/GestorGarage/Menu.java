/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestorGarage;

public class Menu {

    public static void Menu(Garage g) {

        int op;
        do {
            System.out.println(Mensajes.MENU.ENCABEZADO_MENU.tx());
            System.out.println(Mensajes.MENU.OPCION1.tx());
            System.out.println(Mensajes.MENU.OPCION2.tx());
            System.out.println(Mensajes.MENU.OPCION3.tx());
            System.out.println(Mensajes.MENU.OPCION4.tx());
            System.out.println(Mensajes.MENU.OPCION5.tx());
            op = Integer.parseInt(Consola.ingresarDato(Mensajes.ENTRADA.OPCION.tx(),
                    Mensajes.ERROR.OPCION.tx(),
                    Validar.MENU));
            switch (op) {
                case 1:
                    ingresarVehiculos(g);
                    break;
                case 2:
                    borrarVehiculo(g);
                    break;
                case 3:
                    modificarEstancia(g);
                    break;

                case 4:
                    mostrarDatos(g);
                    break;
                case 5:
                    System.out.println(Mensajes.NOTIF.DESPEDIDA.tx());
                    break;
            }
        } while (op != 5);

    }

    public static void ingresarVehiculo(Garage g) {
        String placa = Consola.ingresarDato(Mensajes.ENTRADA.PLACA.tx(), Mensajes.ERROR.PLACA.tx(), Validar.PLACA).toUpperCase();
        String color = Consola.ingresarDato(Mensajes.ENTRADA.COLOR.tx(), Mensajes.ERROR.COLOR.tx(), Validar.SOLO_LETRAS);
        int tiempo = Integer.parseInt(Consola.ingresarDato(Mensajes.ENTRADA.TIEMPO.tx(), Mensajes.ERROR.TIEMPO.tx(), Validar.TIEMPO));
        String ci = Consola.ingresarDato(Mensajes.ENTRADA.CEDULA.tx(), Mensajes.ERROR.CEDULA.tx(), Validar.CEDULA);
        if (!g.ingresarVehiculo(new Vehiculo(placa, color, ci, tiempo))) {
            System.out.println(Mensajes.ERROR.VEHICULO.tx());
        } else {
            System.out.println(Mensajes.NOTIF.NUEVO_VEHICULO.tx());
        }

    }

    private static void ingresarVehiculos(Garage g) {
        String ope;
        do {
            System.out.println(Mensajes.NOTIF.DATOS_VEHICULO.tx());
            ingresarVehiculo(g);
            System.out.println(Mensajes.ENTRADA.OTRO_VEHICULO.tx());
            ope = Consola.get_().entrada.nextLine();
        } while ("s".equals(ope.toLowerCase()));

    }

    public static void modificarEstancia(Garage g) {
        String placa = Consola.ingresarDato(Mensajes.ENTRADA.PLACA.tx(), Mensajes.ERROR.PLACA.tx(), Validar.PLACA);
        Vehiculo v = g.buscarVehiculo(placa);
        if (v != null) {
            System.out.println(Mensajes.NOTIF.DATOS_VEHICULO.tx());
            v.vehiculoDatos();
            int tiempo = Integer.parseInt(Consola.ingresarDato(Mensajes.ENTRADA.NUEVO_TIEMPO.tx(), Mensajes.ERROR.TIEMPO.tx(), Validar.TIEMPO));
            System.out.println(Mensajes.NOTIF.DATOS_MOD.tx());
            v.tiempo = tiempo;
            v.vehiculoDatos();
        } else {
            System.out.println(Mensajes.ERROR.VEHICULO_NO_EXISTE.tx());
        }
    }

    /* public static void borrar1(Garage g) {
        String placa = Consola.ingresarDato(Mensajes.ENTRADA.PLACA.tx(), Mensajes.ERROR.PLACA.tx(), Validar.PLACA);

        if (g.eliminar(placa)) {
            System.out.println(Mensajes.NOTIF.ELIMINADO.tx());
        } else {
            System.out.println(Mensajes.ERROR.VEHICULO_NO_EXISTE.tx());
        }

    } */
    private static void borrarVehiculo(Garage g) {
        String ope, ope2;
        do {
            if (g.verificarVehiculos() == true) {
                String placa = Consola.ingresarDato(Mensajes.ENTRADA.PLACA.tx(), Mensajes.ERROR.PLACA.tx(), Validar.PLACA);
                if (g.buscarVehiculo(placa) != null) {
                    System.out.println(Mensajes.ENTRADA.CONFIRMACION.tx());
                    ope = Consola.get_().entrada.nextLine();
                    if ("s".equals(ope.toLowerCase())) {
                        g.eliminarVehiculo(placa);
                        System.out.println(Mensajes.NOTIF.ELIMINADO.tx());
                    }
                } else {
                    System.out.println(Mensajes.ERROR.VEHICULO_NO_EXISTE.tx());

                }

            }
            System.out.println(Mensajes.ENTRADA.ELIMINAR_OTRO_VEHICULO.tx());
            ope2 = Consola.get_().entrada.nextLine();

        } while ("s".equals(ope2.toLowerCase()) && g.verificarVehiculos() == true);
    }

    public static void mostrarDatos(Garage g) {
        g.mostrarDatos();
    }

}
