package com.gestionvehiculos;

/**
 * Clase principal para probar la creación y visualización de Vehiculos, Camiones y Autos.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Iniciando sistema de gestión de vehículos (Etapa 4 - LSP)...");

        try {
            // Crear vehículos genéricos
            Vehiculo vehiculo1 = new Vehiculo("AB123CD", "Toyota", 2020, 500.0);

            // Crear Camiones
            Camion camion1 = new Camion("XYZ789", "Scania", 2019, 12000.0, true);

            // Crear Autos
            Auto auto1 = new Auto("AC345FG", "Fiat", 2021, 150.0, 5);
            Auto auto2 = new Auto("BD678HI", "Peugeot", 2023, 180.0, 4);
            // Auto auto3 = new Auto("CE901JK", "Renault", 2022, 160.0, 0); // Probar validación pasajeros


            System.out.println("\nVehículos creados exitosamente:");

            // Crear una instancia de VehiculoPrinter
            VehiculoPrinter printer = new VehiculoPrinter();

            // Imprimir información de todos los vehículos
            System.out.println("\nImprimiendo Vehículo Genérico:");
            printer.imprimirVehiculo(vehiculo1);

            System.out.println("\nImprimiendo Camión:");
            printer.imprimirVehiculo(camion1);

            System.out.println("\nImprimiendo Auto 1:");
            printer.imprimirVehiculo(auto1);

            System.out.println("\nImprimiendo Auto 2:");
            printer.imprimirVehiculo(auto2);

        } catch (IllegalArgumentException e) {
            System.err.println("\nError al crear un vehículo: " + e.getMessage());
        }

        System.out.println("\n...Finalizando sistema.");
    }
} 