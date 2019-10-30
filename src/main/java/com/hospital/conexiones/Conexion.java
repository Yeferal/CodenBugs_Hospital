
package com.hospital.conexiones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Conexion {
    
    
    public Connection conect = null;
    public PreparedStatement insertar;
    public Statement stmt;
    public ResultSet resultado;
    
    private String driver = "com.mysql.cj.jdbc.Driver";
    private String user = "usuario";
    private String password = "123456";
    private String servidor = "jdbc:mysql://localhost:3306/hospital";
    
    public final String INSERT = "INSERT INTO ";
    public final String INTO = "INTO ";
    public final String VALUES = "VALUES ";
    public final String UPDATE = "UPDATE ";
    public final String SELECT = "SELECT ";
    public final String FROM = "FROM ";
    public final String WHERE ="WHERE ";
    public final String SET = "SET ";
    
    public final String administrador = "administrador ";
    public final String areas = "areas ";
    public final String habitacion = "habitacion ";
    public final String normativo = "normativo ";
    public final String recursosHumanos = "recursos_humanos ";
    public final String gerente = "gerente ";
    public final String tarifario = "tarifario ";
    public final String especialistas = "especialistas ";
    public final String paciente = "paciente ";
    public final String empleado = "empleado ";
    public final String pagos = "pagos ";
    public final String historiaLaboral = "historia_laboral ";
    public final String vacaciones = "vacaciones ";
    public final String asignacion = "asignacion ";
    public final String consulta = "consulta ";
    public final String cuenta = "cuenta ";
    public final String historialMedico = "historial_medico ";
    public final String medicamento = "medicamento ";
    public final String compraMedicamento = "compra_medicamento ";
    public final String ventaMedicamento = "venta_medicamento ";
    public final String usuarioTabla = "usuario ";
    
    
    public Conexion(){
        
    }
    //conecta a la base de datos
    public void conectar(){
        
        try {
            Class.forName(driver);
            conect = DriverManager.getConnection(servidor, user, password);
            System.out.println("Se conecto XD: "+conect.getCatalog());
        } catch (SQLException e) {
            System.out.println("No se Conecto");
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            System.out.println("Fallo de class");
        }
    }
    //desconecta de la base de datos
    public void desconectar(){
        try {
             //&& !conect.isClosed()
            if(conect != null && !conect.isClosed()){
            conect.close();
            System.out.println("Se cierrar conexion");
            }
        } catch (SQLException ex) {
            System.out.println("Fallo al cerrar conexion");
        }
    }
    
    
}
