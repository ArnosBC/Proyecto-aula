
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jhon Bermudez
 */
public class Persona {
    private String cedula;
    private String nombreCompleto;
    private String correoElectronico;
    private String telefono;
    private String direccion;
    private ArrayList<Dispositivo> dispositivos = new ArrayList<>();
    private float consumoTotal;

    public Persona() {
    }

    public Persona(String cedula, String nombreCompleto, String correoElectronico, String telefono, String direccion) {
        this.cedula = cedula;
        this.nombreCompleto = nombreCompleto;
        this.correoElectronico = correoElectronico;
        this.telefono = telefono;
        this.direccion = direccion;
    }
    
    public void agregarDispositivo(Dispositivo dispositivo) {
        dispositivos.add(dispositivo);
    }

    public void eliminarDispositivo(Dispositivo dispositivo) {
        dispositivos.remove(dispositivo);
    }
    
    public float calcularConsumoTotal() {
        consumoTotal = 0;
        for (Dispositivo dispositivo : dispositivos) {
            consumoTotal += dispositivo.getConsumoEnergetico();
        }
        return consumoTotal;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public float getConsumoTotal() {
        return consumoTotal;
    }

    public void setConsumoTotal(float consumoTotal) {
        this.consumoTotal = consumoTotal;
    }
    
    
    
    
    
}
