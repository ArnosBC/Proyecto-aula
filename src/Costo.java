/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jhon Bermudez
 */
public class Costo {
    private float costoTarifa;

    public Costo() {
    }

    public Costo(float costoTarifa) {
        this.costoTarifa = costoTarifa;
    }
    
    public float calcularCosto(float consumoTotal){
        return consumoTotal * costoTarifa;
    }
    

    public float getCostoTarifa() {
        return costoTarifa;
    }

    public void setCostoTarifa(float costoTarifa) {
        this.costoTarifa = costoTarifa;
    }
    
    
    
}
