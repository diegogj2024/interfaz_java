package Modelo;

public class Persona {
    private String Nombre;
    private String Cedula;
    private String Correo;
    
    public Persona(){
        this.Nombre=" ";
        this.Cedula=" ";
        this.Correo=" ";
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }
    
     public void Conexion_Database(){
        System.out.println("Persona: \n"+this.Nombre+"\n"+this.Cedula+"\n"+this.Correo);
    }
}
