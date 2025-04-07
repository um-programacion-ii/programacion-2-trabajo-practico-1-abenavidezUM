package com.gestionvehiculos;

import java.time.Year;

/**
 * Representa un vehículo genérico con sus características básicas.
 * Incluye validaciones en el constructor y setters para asegurar la integridad de los datos.
 */
public class Vehiculo {

    private String patente;
    private String marca;
    private int anio;
    private double capacidadCargaKg;

    /**
     * Constructor para crear una nueva instancia de Vehiculo.
     * Valida los parámetros antes de asignar los valores.
     *
     * @param patente           La patente del vehículo (no puede ser nula ni vacía).
     * @param marca             La marca del vehículo.
     * @param anio              El año de fabricación del vehículo (debe ser mayor a 1900 y no mayor al año actual).
     * @param capacidadCargaKg La capacidad de carga en kilogramos (debe ser positiva).
     * @throws IllegalArgumentException Si alguno de los parámetros no cumple las validaciones.
     */
    public Vehiculo(String patente, String marca, int anio, double capacidadCargaKg) {
        setPatente(patente); // Usa el setter para validar
        this.marca = marca; // Asumiendo que marca no requiere validación compleja por ahora
        setAnio(anio);       // Usa el setter para validar
        setCapacidadCargaKg(capacidadCargaKg); // Usa el setter para validar
    }

    // --- Getters ---

    /**
     * Obtiene la patente del vehículo.
     * @return La patente del vehículo.
     */
    public String getPatente() {
        return patente;
    }

    /**
     * Obtiene la marca del vehículo.
     * @return La marca del vehículo.
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Obtiene el año de fabricación del vehículo.
     * @return El año de fabricación.
     */
    public int getAnio() {
        return anio;
    }

    /**
     * Obtiene la capacidad de carga en kilogramos.
     * @return La capacidad de carga.
     */
    public double getCapacidadCargaKg() {
        return capacidadCargaKg;
    }

    // --- Setters con Validación ---

    /**
     * Establece la patente del vehículo.
     * @param patente La nueva patente (no puede ser nula ni vacía).
     * @throws IllegalArgumentException Si la patente es nula o vacía.
     */
    public void setPatente(String patente) {
        if (patente == null || patente.trim().isEmpty()) {
            throw new IllegalArgumentException("La patente no puede ser nula ni vacía.");
        }
        this.patente = patente.trim();
    }

    /**
     * Establece la marca del vehículo.
     * @param marca La nueva marca.
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Establece el año de fabricación del vehículo.
     * @param anio El nuevo año (debe ser mayor a 1900 y no mayor al año actual).
     * @throws IllegalArgumentException Si el año no es válido.
     */
    public void setAnio(int anio) {
        int anioActual = Year.now().getValue();
        if (anio <= 1900 || anio > anioActual) {
            throw new IllegalArgumentException("El año debe ser mayor a 1900 y no mayor al año actual (" + anioActual + ").");
        }
        this.anio = anio;
    }

    /**
     * Establece la capacidad de carga en kilogramos.
     * @param capacidadCargaKg La nueva capacidad (debe ser positiva).
     * @throws IllegalArgumentException Si la capacidad no es positiva.
     */
    public void setCapacidadCargaKg(double capacidadCargaKg) {
        if (capacidadCargaKg <= 0) {
            throw new IllegalArgumentException("La capacidad de carga debe ser positiva.");
        }
        this.capacidadCargaKg = capacidadCargaKg;
    }

    // --- Métodos ---

    /**
     * Muestra la información completa del vehículo en la consola.
     * Este método será eliminado en etapas posteriores para cumplir con SRP.
     */
    // public void mostrarInformacion() {  <-- ELIMINADO
    //     System.out.println("--- Información del Vehículo ---"); <-- ELIMINADO
    //     System.out.println("Patente: " + patente); <-- ELIMINADO
    //     System.out.println("Marca: " + marca); <-- ELIMINADO
    //     System.out.println("Año: " + anio); <-- ELIMINADO
    //     System.out.println("Capacidad de Carga (Kg): " + capacidadCargaKg); <-- ELIMINADO
    //     System.out.println("---------------------------------"); <-- ELIMINADO
    // } <-- ELIMINADO
} 