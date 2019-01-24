/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.SQLException;


public class JDBC {

    
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            Conexion con = new Conexion();
            con.insertar(384954212, "Mauricio", "Computacion", 19);
            con.insertar(384954212, "Carlos", "Ing Electrica", 19);
            con.insertar(384154302, "Sofia", "Comunicacion", 21);
            con.insertar(384954902, "Ana", "Derecho", 20);
            con.seleccionar();
            con.eliminarPorNombre("Carlos");
            con.seleccionar();
            con.actualizar("Ana", 18);
            con.seleccionarPorNoCuenta(384154302);
            con.cerrar();
        }catch(SQLException sqle){
            System.err.println("Error");
        }
    }
    
}
