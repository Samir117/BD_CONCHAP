package Clases;
public class Docente extends Persona {


    private int Sueldo;

    public Docente(String Nombre, String Apellido, int Edad, String TipoDocumento, String NumeroDocumento, String Dirrecion, String Numero_Contacto, String Fecha_Nacimiento, String Sexo, String Contraseña) {
        super(Nombre, Apellido, Edad, TipoDocumento, NumeroDocumento, Dirrecion, Numero_Contacto, Fecha_Nacimiento, Sexo, Contraseña);
    }

    public Docente() {
    }




public void Docente(){
    
}

    public int getSueldo() {
        return Sueldo;
    }

    public void setSueldo(int Sueldo) {
        this.Sueldo = Sueldo;
    }

    @Override
    public String toString() {
        return "Docente{" + "Sueldo=" + Sueldo + '}';
    }

}
