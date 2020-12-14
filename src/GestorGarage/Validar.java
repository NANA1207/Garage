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
public class Validar {

    public static final int MENU = 0;
    public static final int SOLO_LETRAS = 1;
    public static final int PLACA = 2;
    public static final int TIEMPO = 3;
    public static final int CEDULA = 4;

    public static boolean esMenu(String opcion) {
        String regex = "-?[1-5]+";
        if (opcion.matches(regex)) {
            int valorOpcion = Integer.parseInt(opcion);
            return ((valorOpcion > 0 && valorOpcion < 6));
        }
        return false;
    }

    public static boolean vaColor(String cadena) {
        String regex = "[ñÑáéíóúÁÉÍÓÚA-Za-z].+";
        return (cadena.matches(regex));
    }

    public static boolean vaPlaca(String placa) {
        String regex = "[A-Z0-9-].+";
        return (placa.matches(regex));
    }

    public static boolean vaTiempo(String lugar) {
        String regex = "[0-8]";
        if (lugar.matches(regex)) {
            int valorOpcion = Integer.parseInt(lugar);
            return ((valorOpcion > 0 && valorOpcion < 30));
        }
        return false;
    }

    public static boolean vaCedula(String cedula) {
        boolean cedulaCorrecta;
        try {
            if (cedula.length() == 10) {
                // Coeficientes de validación cédula
                // El decimo digito se lo considera dígito verificador
                int[] coefValCedula = {2, 1, 2, 1, 2, 1, 2, 1, 2};
                int verificador = Integer.parseInt(cedula.substring(9, 10));
                int suma = 0;
                int digito;
                for (int i = 0; i < (cedula.length() - 1); i++) {
                    digito = Integer.parseInt(cedula.substring(i, i + 1)) * coefValCedula[i];
                    suma += ((digito % 10) + (digito / 10));
                }

                cedulaCorrecta = ((suma % 10 == 0 && verificador == 0) || (10 - suma % 10 == verificador));
            } else {
                cedulaCorrecta = false;
            }
        } catch (Exception e) {
            cedulaCorrecta = false;
        }
        return cedulaCorrecta;
    }

    public static boolean validar(String dato, int tipoValidador) {
        boolean esValido;
        switch (tipoValidador) {
            case MENU:
                esValido = esMenu(dato);
                break;
            case SOLO_LETRAS:
                esValido = vaColor(dato);
                break;
            case PLACA:
                esValido = vaPlaca(dato);
                break;
            case TIEMPO:
                esValido = vaTiempo(dato);
                break;
            case CEDULA:
                esValido = vaCedula(dato);
                break;
            default:
                throw new AssertionError();
        }
        return esValido;
    }
}
