package com.gestionvehiculos;

/**
 * Clase responsable de imprimir la información de un Vehiculo.
 * Aplica el Principio de Responsabilidad Única (SRP).
 * Modificado para soportar la impresión específica de Camion (OCP).
 */
public class VehiculoPrinter {

    /**
     * Imprime los detalles de un vehículo en la consola.
     * Si el vehículo es un Camion, imprime también si tiene acoplado.
     *
     * @param vehiculo El Vehiculo (o subclase como Camion) cuya información se va a imprimir.
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
            // Hacemos un cast seguro porque ya comprobamos el tipo
            Camion camion = (Camion) vehiculo;
            System.out.println("Tiene Acoplado: " + (camion.isTieneAcoplado() ? "Sí" : "No"));
        }

        System.out.println("-------------------------------------");
    }
} 