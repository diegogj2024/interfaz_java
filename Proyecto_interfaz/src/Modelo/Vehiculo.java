
package Modelo;

public class Vehiculo {
    private String serial_vehiculo;
    private String modelo_vehiculo;
    public Vehiculo(){
        this.modelo_vehiculo=" ";
        this.serial_vehiculo=" ";
    }

    public String getSerial_vehiculo() {
        return serial_vehiculo;
    }

    public String getModelo_vehiculo() {
        return modelo_vehiculo;
    }

    public void setSerial_vehiculo(String serial_vehiculo) {
        this.serial_vehiculo = serial_vehiculo;
    }

    public void setModelo_vehiculo(String modelo_vehiculo) {
        this.modelo_vehiculo = modelo_vehiculo;
    }
    
    public void Conexion_Database(){
        System.out.println("vehiculo: \n"+this.modelo_vehiculo+"\n"+this.serial_vehiculo);
    }
    
}
