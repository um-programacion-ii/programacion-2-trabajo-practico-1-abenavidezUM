package com.gestionvehiculos;

/**
 * Clase responsable de imprimir la información de un Vehiculo.
 * Aplica el Principio de Responsabilidad Única (SRP).
 * Modificado para soportar la impresión específica de Camion (OCP) y Auto (LSP).
 */
public class VehiculoPrinter {

    /**
     * Imprime los detalles de un vehículo en la consola.
     * Si el vehículo es un Camion, imprime también si tiene acoplado.
     * Si el vehículo es un Auto, imprime también la cantidad de pasajeros.
     *
     * @param vehiculo El Vehiculo (o subclase como Camion, Auto) cuya información se va a imprimir.
     */
    public void imprimirVehiculo(Vehiculo vehiculo) {
        if (vehiculo == null) {
            System.out.println("Error: El vehículo proporcionado es nulo.");
            return;
        }

        // Imprime la información base común a todos los vehículos
        System.out.println("--- Información del Vehículo ---");
        System.out.println("Patente: " + vehiculo.getPatente());
        System.out.println("Marca: " + vehiculo.getMarca());
        System.out.println("Año: " + vehiculo.getAnio());
        System.out.println("Capacidad de Carga (Kg): " + vehiculo.getCapacidadCargaKg());

        // Verifica si es un Camion para imprimir información específica (OCP)
        if (vehiculo instanceof Camion) {
            Camion camion = (Camion) vehiculo; // Cast seguro
            System.out.println("Tiene Acoplado: " + (camion.isTieneAcoplado() ? "Sí" : "No"));
        }
        // Verifica si es un Auto para imprimir información específica (LSP)
        else if (vehiculo instanceof Auto) { // Usamos else if para evitar imprimir ambos si hubiera herencia múltiple (no es el caso aquí)
            Auto auto = (Auto) vehiculo; // Cast seguro
            System.out.println("Cantidad de Pasajeros: " + auto.getCantidadPasajeros());
        }

        System.out.println("-------------------------------------");
    }
} 