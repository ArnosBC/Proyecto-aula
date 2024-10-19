/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jhon Bermudez
 */
public class TipsAhorro {
    private String mensaje;

    public TipsAhorro() {
    }

    public TipsAhorro(String mensaje) {
        this.mensaje = mensaje;
    }
    
    public void mostrarTips(){
        System.out.println("Tip de Ahorro: " + mensaje);
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    
}
