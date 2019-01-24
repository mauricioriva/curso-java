/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class Conexion {
    
    private Connection con;
    
    public Conexion() throws SQLException{
        String url = "jdbc:mysql://localhost:3306/Universidad";
        String user = "root";
        String password = "";
        con = DriverManager.getConnection(url,user,password);
        if(con != null){
            System.out.println("Te has conectado a la base de datos");
        }else{
            SQLException sqle = new SQLException();
            throw sqle;
        }
    }
    
    public void insertar(int NoCuenta, String Nombre, String Carrera, int Edad) throws SQLException{
        String sql = "INSERT INTO Alumnos (NoCuenta, Nombre, Carrera, Edad) VALUES (?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, NoCuenta);
        ps.setString(2, Nombre);
        ps.setString(3, Carrera);
        ps.setInt(4, Edad);
        int filasInsertadas = ps.executeUpdate();
        if(filasInsertadas > 0){
            System.out.println("Se han insertado correctamente los datos en la tabla.");
        }else{
            System.out.println("Error");
        }
    }
    
    public void seleccionar()throws SQLException{
        String sql = "SELECT * FROM Alumnos";
        Statement st = con.createStatement();
        ResultSet resultado = st.executeQuery(sql);
        while(resultado.next()){
            int id = resultado.getInt("ID");
            int noCuenta = resultado.getInt("NoCuenta");
            String nombre = resultado.getString("Nombre");
            String carrera = resultado.getString("Carrera");
            int edad = resultado.getInt("Edad");
            System.out.printf("ID: %d %d %s - %s %d años\n",id,noCuenta,nombre,carrera,edad);
        }
    }
    
    public void seleccionarPorNoCuenta(int NoCuenta)throws SQLException{
        String sql = "SELECT * FROM Alumnos WHERE NoCuenta = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, NoCuenta);
        ResultSet resultado = ps.executeQuery();
        while(resultado.next()){
            int id = resultado.getInt("ID");
            int noCuenta = resultado.getInt("NoCuenta");
            String nombre = resultado.getString("Nombre");
            String carrera = resultado.getString("Carrera");
            int edad = resultado.getInt("Edad");
            System.out.printf("ID: %d %d %s - %s %d años\n",id,noCuenta,nombre,carrera,edad);
        }
        
    }
    
    public void eliminarPorNombre(String nombre) throws SQLException{
        String sql = "DELETE FROM Alumnos WHERE Nombre = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, nombre);
        int filasEliminadas = ps.executeUpdate();
        if(filasEliminadas > 0){
            System.out.println("Se han eliminado correctamente los datos en la tabla donde el nombre es: " + nombre);
        }else{
            System.out.println("Error");
        }
    }
    
    public void actualizar(String nombre, int edad) throws SQLException{
        String sql = "UPDATE Alumnos SET Edad = ? WHERE Nombre = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(2, nombre);
        ps.setInt(1, edad);
        int filasActualizadas = ps.executeUpdate();
        if(filasActualizadas > 0){
            System.out.println("Se ha actualizado la edad de " + nombre + " a " + edad + " años.");
        }else{
            System.out.println("Error");
        }
    }
    
    public void cerrar() throws SQLException{
        con.close();
    }
    
}
