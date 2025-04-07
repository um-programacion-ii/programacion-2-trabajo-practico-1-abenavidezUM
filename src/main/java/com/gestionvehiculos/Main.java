package com.gestionvehiculos;

/**
 * Clase principal para probar la creación y visualización de Vehiculos y Camiones.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Iniciando sistema de gestión de vehículos (Etapa 3 - OCP)...");

        try {
            // Crear vehículos genéricos
            Vehiculo vehiculo1 = new Vehiculo("AB123CD", "Toyota", 2020, 500.0);
            Vehiculo vehiculo2 = new Vehiculo("EF456GH", "Ford", 2018, 1500.5);

            // Crear un Camion
            Camion camion1 = new Camion("XYZ789", "Scania", 2019, 12000.0, true);
            Camion camion2 = new Camion("UVW456", "Volvo", 2021, 10000.0, false);

            System.out.println("\nVehículos creados exitosamente:");

            // Crear una instancia de VehiculoPrinter
            VehiculoPrinter printer = new VehiculoPrinter();

            // Imprimir información de todos los vehículos (incluyendo camiones)
            System.out.println("\nImprimiendo Vehículo Genérico 1:");
            printer.imprimirVehiculo(vehiculo1);

            System.out.println("\nImprimiendo Vehículo Genérico 2:");
            printer.imprimirVehiculo(vehiculo2);

            System.out.println("\nImprimiendo Camión 1:");
            printer.imprimirVehiculo(camion1);

            System.out.println("\nImprimiendo Camión 2:");
            printer.imprimirVehiculo(camion2);

        } catch (IllegalArgumentException e) {
            System.err.println("\nError al crear un vehículo: " + e.getMessage());
        }

        System.out.println("\n...Finalizando sistema.");
    }
} 