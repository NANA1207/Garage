package GestorGarage;

public class Mensajes {

    public enum ENTRADA {
        OPCION("Opción: "),
        PLACA("Placa del vehiculo (Ej: XXX-000): "),
        COLOR("Color del vehiculo: "),
        TIEMPO("Indique el tiempo deseado (Horas): "),
        OTRO_VEHICULO("Insertar otro vehiculo (s/n): "),
        CEDULA("Insertar cedula del conductor: "),
        CONFIRMACION(" Salida de vehículo (s/n) "),
        ELIMINAR_OTRO_VEHICULO("Va a salir otro vehiculo (s/n): "),
        NUEVO_TIEMPO("Ingresar nueva estancia de tiempo (Horas): ");

        private String valor;

        private ENTRADA(String v) {
            valor = v;
        }

        public String tx() {
            return valor;
        }
    }

    public enum ERROR {
        OPCION("Número de opción no válida."),
        PLACA("Placa no valida (MAYUSCULAS)"),
        COLOR("Solo se aceptan letras Ej: Azul"),
        TIEMPO("Limite de tiempo 8 horas"),
        VALOR_NO_VALIDO("Valor no válido"),
        CEDULA("Cedula no valida"),
        VEHICULO("Garage lleno, no se puede ingresar mas vehiculos"),
        VEHICULO_NO_EXISTE("En el garage no existe un vehiculo con esa PLACA.");

        private String valor;

        private ERROR(String v) {
            valor = v;
        }

        public String tx() {
            return valor;
        }
    }

    public enum NOTIF {
        DESPEDIDA("¡GRACIAS POR PREFERIRNOS!"),
        NUEVO_VEHICULO("Nuevo vehiculo ingresado"),
        PLACA("Placa: "),
        COLOR("Color del vehiculo: "),
        TIEMPO("Tiempo que dispuso (Horas):  "),
        CEDULA("Cedula : "),
        DATOS_MOD("***Nuevos datos***"),
        ELIMINADO("El vehiculo sale del garage"),
        DATOS_VEHICULO("***Datos Del Vehiculo***");

        private String valor;

        private NOTIF(String v) {
            valor = v;
        }

        public String tx() {
            return valor;
        }
    }

    public enum MENU {
        ENCABEZADO_MENU("     *****    MENU PRINCIPAL ***       "),
        OPCION1("1  INGRESAR VEHICULO"),
        OPCION2("2. SALIDA DEL VEHICULO"),
        OPCION3("3. MODIFICAR ESTANCIA DE TIEMPO"),
        OPCION4("4. VEHICULOS EN EL GARAGE"),
        OPCION5("5. SALIR");

        private String valor;

        private MENU(String v) {
            valor = v;
        }

        public String tx() {
            return valor;
        }
    }

}
