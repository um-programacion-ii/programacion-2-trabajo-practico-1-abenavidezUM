package com.gestionvehiculos;

/**
 * Representa un Auto, que es un tipo específico de Vehiculo.
 * Añade la característica de cantidad de pasajeros.
 */
public class Auto extends Vehiculo {

    private int cantidadPasajeros;

    /**
     * Constructor para crear una nueva instancia de Auto.
     * La capacidad de carga para un auto se podría considerar fija o derivada,
     * pero por simplicidad la pedimos como parámetro.
     *
     * @param patente           La patente del auto.
     * @param marca             La marca del auto.
     * @param anio              El año de fabricación del auto.
     * @param capacidadCargaKg La capacidad de carga en kilogramos (usualmente pequeña para autos).
     * @param cantidadPasajeros La cantidad máxima de pasajeros.
     */
    public Auto(String patente, String marca, int anio, double capacidadCargaKg, int cantidadPasajeros) {
        // Llamada al constructor de la clase padre (Vehiculo)
        super(patente, marca, anio, capacidadCargaKg);
        setCantidadPasajeros(cantidadPasajeros); // Usar setter para posible validación futura
    }

    // --- Getter y Setter para cantidadPasajeros ---

    /**
     * Obtiene la cantidad máxima de pasajeros del auto.
     * @return La cantidad de pasajeros.
     */
    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    /**
     * Establece la cantidad máxima de pasajeros del auto.
     * Podría incluir validación (ej: > 0).
     * @param cantidadPasajeros La nueva cantidad de pasajeros.
     */
    public void setCantidadPasajeros(int cantidadPasajeros) {
        // Ejemplo de validación simple (se podría mejorar)
        if (cantidadPasajeros <= 0) {
            throw new IllegalArgumentException("La cantidad de pasajeros debe ser positiva.");
        }
        this.cantidadPasajeros = cantidadPasajeros;
    }
} 