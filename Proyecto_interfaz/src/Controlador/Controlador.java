package Controlador;

import Modelo.Persona;
import Modelo.Vehiculo;
import Vista.Formulario_registro;


public class Controlador {
    private Vehiculo objVehiculo;
    private Formulario_registro objFormulario_registro;
    private Persona objPersona;
    public Controlador(String modelo,String serial){
        this. objVehiculo=new Vehiculo();
        this.objVehiculo.setModelo_vehiculo(modelo);
        this.objVehiculo.setSerial_vehiculo(serial);
        this.objVehiculo.Conexion_Database();
    }
    
    public Controlador(String nombre,String cedula,String correo){
        this.objPersona=new Persona();
        this.objPersona.setNombre(nombre);
        this.objPersona.setCedula(cedula);
        this.objPersona.setCorreo(correo);
        this.objPersona.Conexion_Database();
    }
    public Controlador(){
        this.objFormulario_registro=new Formulario_registro();
        this.objFormulario_registro.setVisible(true);
    }
    
}
