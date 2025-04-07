package com.gestionvehiculos;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase principal que demuestra la gestión de vehículos usando un ArrayList.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Iniciando sistema de gestión de vehículos (Etapa 5 - ArrayList)...");

        // Crear la lista para almacenar los vehículos
        List<Vehiculo> flota = new ArrayList<>();
        VehiculoPrinter printer = new VehiculoPrinter();

        try {
            // Crear e añadir vehículos a la lista
            System.out.println("Creando y añadiendo vehículos a la flota...");

            Vehiculo vehiculo1 = new Vehiculo("AB123CD", "Toyota", 2020, 500.0);
            flota.add(vehiculo1);
            System.out.println("- Añadido: Vehículo Toyota");

            Camion camion1 = new Camion("XYZ789", "Scania", 2019, 12000.0, true);
            flota.add(camion1);
            System.out.println("- Añadido: Camión Scania");

            Auto auto1 = new Auto("AC345FG", "Fiat", 2021, 150.0, 5);
            flota.add(auto1);
            System.out.println("- Añadido: Auto Fiat");

            Auto auto2 = new Auto("BD678HI", "Peugeot", 2023, 180.0, 4);
            flota.add(auto2);
            System.out.println("- Añadido: Auto Peugeot");

            Camion camion2 = new Camion("UVW456", "Volvo", 2021, 10000.0, false);
            flota.add(camion2);
            System.out.println("- Añadido: Camión Volvo");

            System.out.println("\n...Vehículos añadidos.");

        } catch (IllegalArgumentException e) {
            // Si hay un error al crear un vehículo, se notifica pero el programa continúa
            // con los vehículos que sí se pudieron añadir a la lista.
            System.err.println("\nError al crear e instanciar un vehículo: " + e.getMessage());
            System.err.println("El vehículo con error no fue añadido a la flota.");
        }

        // Imprimir información de todos los vehículos en la lista
        System.out.println("\n--- Imprimiendo información de la Flota Completa ---");
        if (flota.isEmpty()) {
            System.out.println("La flota está vacía.");
        } else {
            for (Vehiculo v : flota) {
                printer.imprimirVehiculo(v); // Llama al método polimórfico
            }
        }
        System.out.println("--- Fin de la impresión de la Flota ---");

        System.out.println("\n...Finalizando sistema.");
    }
} 