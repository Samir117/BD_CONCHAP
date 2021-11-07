package Clases;

public class Persona {

    private String Nombre;
    private String Apellido;
    private int Edad;
    private String TipoDocumento;
    private String NumeroDocumento;
    private String Dirrecion;
    private String Numero_Contacto;
    private String Fecha_Nacimiento;
    private String Sexo;
    private String Contraseña;

    public Persona(String Nombre, String Apellido, int Edad, String TipoDocumento, String NumeroDocumento, String Dirrecion, String Numero_Contacto, String Fecha_Nacimiento, String Sexo, String Contraseña) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
        this.TipoDocumento = TipoDocumento;
        this.NumeroDocumento = NumeroDocumento;
        this.Dirrecion = Dirrecion;
        this.Numero_Contacto = Numero_Contacto;
        this.Fecha_Nacimiento = Fecha_Nacimiento;
        this.Sexo = Sexo;
        this.Contraseña = Contraseña;
    }

   


    public  Persona(){
        
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getTipoDocumento() {
        return TipoDocumento;
    }

    public void setTipoDocumento(String TipoDocumento) {
        this.TipoDocumento = TipoDocumento;
    }

    public String getNumeroDocumento() {
        return NumeroDocumento;
    }

    public void setNumeroDocumento(String NumeroDocumento) {
        this.NumeroDocumento = NumeroDocumento;
    }

    public String getDirrecion() {
        return Dirrecion;
    }

    public void setDirrecion(String Dirrecion) {
        this.Dirrecion = Dirrecion;
    }

    public String getNumero_Contacto() {
        return Numero_Contacto;
    }

    public void setNumero_Contacto(String Numero_Contacto) {
        this.Numero_Contacto = Numero_Contacto;
    }

    public String getFecha_Nacimiento() {
        return Fecha_Nacimiento;
    }

    public void setFecha_Nacimiento(String Fecha_Nacimiento) {
        this.Fecha_Nacimiento = Fecha_Nacimiento;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    @Override
    public String toString() {
        return "Persona{" + "Nombre=" + Nombre + ", Apellido=" + Apellido + ", Edad=" + Edad + ", TipoDocumento=" + TipoDocumento + ", NumeroDocumento=" + NumeroDocumento + ", Dirrecion=" + Dirrecion + ", Numero_Contacto=" + Numero_Contacto + ", Fecha_Nacimiento=" + Fecha_Nacimiento + ", Sexo=" + Sexo + ", Contrase\u00f1a=" + Contraseña + '}';
    }

    
    
}
