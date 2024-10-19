/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jhon Bermudez
 */
public class DispositivoElectronico extends Dispositivo {
    private String tipoDispositivo;

    public DispositivoElectronico() {
    }

    public DispositivoElectronico(String nombre, float consumoEnergetico, String tipoDispositivo) {
        super(nombre, consumoEnergetico);
        this.tipoDispositivo = tipoDispositivo;
    }

    public String getTipoDispositivo() {
        return tipoDispositivo;
    }

    public void setTipoDispositivo(String tipoDispositivo) {
        this.tipoDispositivo = tipoDispositivo;
    }
    
    
    
}
