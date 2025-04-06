package com.gestionvehiculos;

/**
 * Clase principal para probar la creación y visualización de Vehiculos.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Iniciando sistema de gestión de vehículos...");

        try {
            // Crear al menos 3 vehículos
            Vehiculo vehiculo1 = new Vehiculo("AB123CD", "Toyota", 2020, 500.0);
            Vehiculo vehiculo2 = new Vehiculo("EF456GH", "Ford", 2018, 1500.5);
            Vehiculo vehiculo3 = new Vehiculo("IJ789KL", "Chevrolet", 2022, 350.75);
            // Intento crear un vehículo con año inválido para probar validación
            // Vehiculo vehiculo4 = new Vehiculo("MN012OP", "Fiat", 1899, 400.0); // Descomentar para probar
            // Intento crear un vehículo con patente inválida
            // Vehiculo vehiculo5 = new Vehiculo("", "VW", 2021, 600.0); // Descomentar para probar
            // Intento crear un vehículo con capacidad inválida
            // Vehiculo vehiculo6 = new Vehiculo("QR345ST", "Renault", 2019, -100.0); // Descomentar para probar

            System.out.println("\nVehículos creados exitosamente:");

            // Imprimir información de los vehículos usando el método mostrarInformacion()
            vehiculo1.mostrarInformacion();
            vehiculo2.mostrarInformacion();
            vehiculo3.mostrarInformacion();

        } catch (IllegalArgumentException e) {
            System.err.println("\nError al crear un vehículo: " + e.getMessage());
        }

        System.out.println("\n...Finalizando sistema.");
    }
} 