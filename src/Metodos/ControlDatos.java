/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import Clases.Persona;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import JFrames.Registro;
import Conexion_BD.conexion;
import java.sql.ResultSet;

/**
 *
 * @author Samir Rojas
 */
public class ControlDatos {

    Persona persona;
    Registro admin;
    Connection cn;
    conexion c;
    PreparedStatement ps;
    String SQL;
    ResultSet rs;

    public ControlDatos() {
       persona = new Persona();
    }

    public void Registrar(String NOMBRE, String APELLIDO, int EDAD, String TIPO_DOCUMENTO,String NUMERO_DOCUMENTO,
            String DIRRECION, String NUMERO_CONTACTO, String FECHA_NACIMIENTO, String SEXO) throws SQLException {
        persona.setNombre(NOMBRE);
        persona.setApellido(APELLIDO);
        persona.setEdad(EDAD);
        persona.setTipoDocumento(TIPO_DOCUMENTO);
        persona.setNumeroDocumento(NUMERO_DOCUMENTO);
        persona.setDirrecion(DIRRECION);
        persona.setNumero_Contacto(NUMERO_CONTACTO);
        persona.setFecha_Nacimiento(FECHA_NACIMIENTO);
        persona.setSexo(SEXO);


        cn = DriverManager.getConnection("jdbc:mysql://localhost/conchap", "root", "");
        PreparedStatement pst = cn.prepareStatement("insert  into persona "
                + "(NOMBRE,APELLIDO,EDAD,TIPO_DOCUMENTO,NUMERO_DOCUMENTO,DIRRECION,NUMERO_CONTACTO,FECHA_NACIMIENTO,SEXO,CONTRASEÑA) "
                + "values  (?,?,?,?,?,?,?,?,?,?)");
       
        pst.setString(1, persona.getNombre());
        pst.setString(2, persona.getApellido());
        pst.setInt(3, persona.getEdad());
        pst.setString(4, persona.getTipoDocumento());
        pst.setString(5, persona.getNumeroDocumento());
        pst.setString(6, persona.getDirrecion());
        pst.setString(7, persona.getNumero_Contacto());
        pst.setString(8, persona.getFecha_Nacimiento());
        pst.setString(9, persona.getSexo());
        pst.setString(10, Contraseña());

        pst.executeUpdate();
        JOptionPane.showMessageDialog(null, "Registro Exitoso.");

    }

    
    public String Contraseña(){
        String password;
        password = persona.getNombre().substring(0, 3) + persona.getApellido().substring(0, 3) + persona.getNumeroDocumento().substring(0, 3);
        persona.setContraseña(password);
        return password;
        
        
    }
}
