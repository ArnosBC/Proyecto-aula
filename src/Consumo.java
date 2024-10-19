
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jhon Bermudez
 */
public class Consumo {
    private float tiempoDeUso;
    private Persona persona;
    private ArrayList<Dispositivo> dispositivos;

    public Consumo() {
    }

    public Consumo(float tiempoDeUso, Persona persona, ArrayList<Dispositivo> dispositivos) {
        this.tiempoDeUso = tiempoDeUso;
        this.persona = persona;
        this.dispositivos = dispositivos;
    }
    
    public float calcularConsumoTotal(){
        float consumoTotal = 0;
        for(Dispositivo dispositivo : dispositivos){
            consumoTotal += dispositivo.getConsumoEnergetico() * tiempoDeUso;
        }
        persona.setConsumoTotal(consumoTotal);
        return consumoTotal;
    }

    public float getTiempoDeUso() {
        return tiempoDeUso;
    }

    public void setTiempoDeUso(float tiempoDeUso) {
        this.tiempoDeUso = tiempoDeUso;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public ArrayList<Dispositivo> getDispositivos() {
        return dispositivos;
    }

    public void setDispositivos(ArrayList<Dispositivo> dispositivos) {
        this.dispositivos = dispositivos;
    }
    
    
}
