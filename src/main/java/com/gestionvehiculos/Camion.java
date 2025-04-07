package com.gestionvehiculos;

/**
 * Representa un Camión, que es un tipo específico de Vehiculo.
 * Añade la característica de tener o no acoplado.
 */
public class Camion extends Vehiculo {

    private boolean tieneAcoplado;

    /**
     * Constructor para crear una nueva instancia de Camion.
     *
     * @param patente           La patente del camión.
     * @param marca             La marca del camión.
     * @param anio              El año de fabricación del camión.
     * @param capacidadCargaKg La capacidad de carga en kilogramos del camión.
     * @param tieneAcoplado     Indica si el camión tiene acoplado.
     */
    public Camion(String patente, String marca, int anio, double capacidadCargaKg, boolean tieneAcoplado) {
        // Llamada al constructor de la clase padre (Vehiculo)
        super(patente, marca, anio, capacidadCargaKg);
        this.tieneAcoplado = tieneAcoplado;
    }

    // --- Getter y Setter para tieneAcoplado ---

    /**
     * Verifica si el camión tiene acoplado.
     * @return true si tiene acoplado, false en caso contrario.
     */
    public boolean isTieneAcoplado() {
        return tieneAcoplado;
    }

    /**
     * Establece si el camión tiene acoplado.
     * @param tieneAcoplado El nuevo estado del acoplado.
     */
    public void setTieneAcoplado(boolean tieneAcoplado) {
        this.tieneAcoplado = tieneAcoplado;
    }

    // Podríamos sobreescribir otros métodos si fuera necesario,
    // pero para OCP en VehiculoPrinter, no es estrictamente necesario aquí.
} 