package com.gestionvehiculos;

/**
 * Clase responsable de imprimir la información de un Vehiculo.
 * Aplica el Principio de Responsabilidad Única (SRP).
 */
public class VehiculoPrinter {

    /**
     * Imprime los detalles de un vehículo en la consola.
     *
     * @param vehiculo El Vehiculo cuya información se va a imprimir.
     */
    public void imprimirVehiculo(Vehiculo vehiculo) {
        if (vehiculo == null) {
            System.out.println("Error: El vehículo proporcionado es nulo.");
            return;
        }

        System.out.println("--- Información del Vehículo (SRP) ---");
        System.out.println("Patente: " + vehiculo.getPatente());
        System.out.println("Marca: " + vehiculo.getMarca());
        System.out.println("Año: " + vehiculo.getAnio());
        System.out.println("Capacidad de Carga (Kg): " + vehiculo.getCapacidadCargaKg());
        System.out.println("-------------------------------------");
    }
} 