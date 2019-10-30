
package com.hospital.iniciosesion;

import com.hospital.conexiones.Conexion;
import com.mycompany.hospital.Usuario;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SesionUsuario extends Conexion{
    
    Usuario usuario = new Usuario();
    
    public boolean isExisteUsuario(String nombre){
        
        try {
            stmt = conect.createStatement();
            resultado = stmt.executeQuery(SELECT+"* "+FROM+empleado+WHERE+"nombre='"+nombre+"';");
            if(resultado.next()){
                return true;
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    public boolean isPasswordUsuario(String nombre,String pass){
        
        try {
            stmt = conect.createStatement();
            resultado = stmt.executeQuery(SELECT+"codigo "+FROM+empleado+WHERE+"nombre='"+nombre+"';");
            while (resultado.next()){                
                if(resultado.getString(1).equals(pass)){
                    return true;
                }            
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }
    
}
