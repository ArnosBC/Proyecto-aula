/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jhon Bermudez
 */
public class Dispositivo {
    private String nombre;
    private float consumoEnergetico;

    public Dispositivo() {
    }

    public Dispositivo(String nombre, float consumoEnergetico) {
        this.nombre = nombre;
        this.consumoEnergetico = consumoEnergetico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(float consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }
    
    @Override
    public String toString() {
        return nombre + " (" + consumoEnergetico + " kWh)";
    }
    
}
