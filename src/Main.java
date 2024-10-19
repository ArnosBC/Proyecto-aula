
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Jhon Bermudez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona = new Persona("12345", "Juan Perez", "juan@gmail.com", "123", "Carrera 5C #44-19 San Fernando");
        
        
        Dispositivo tv = new DispositivoElectronico("Televisor", 0.1f, "Electronico");
        Dispositivo nevera = new DispositivoElectronico("Nevera", 0.5f, "Electrodomestico");
        
        persona.agregarDispositivo(tv);
        persona.agregarDispositivo(nevera);
        
        ArrayList<Dispositivo> dispositivos = new ArrayList<>();
        dispositivos.add(tv);
        dispositivos.add(nevera);
        
        Consumo consumo = new Consumo(10, persona, dispositivos);
        float consumoTotal = consumo.calcularConsumoTotal();
        System.out.println("Consumo total: " + consumoTotal + " kWh");
        
        Costo costo = new Costo(0.12f);
        float costoTotal = costo.calcularCosto(consumoTotal);
        System.out.println("Costo total: $" + costoTotal);
        
         TipsAhorro tip = new TipsAhorro("Desconecta los dispositivos cuando no los uses para ahorrar energia");
        tip.mostrarTips();
    }
    
}
