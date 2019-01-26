package WEB;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mauricio
 */
public class Usuario {
    
    private String contrasena;
    private String nombre;
    
    public Usuario(String nombre, String contrasena){
        this.nombre = nombre;
        this.contrasena = contrasena;
    }

    /**
     * @return the contrasena
     */
    public String getContrasena() {
        return contrasena;
    }

    /**
     * @param contrasena the contrasena to set
     */
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public boolean equals(Object o){
        Usuario u = null;
        if(o instanceof Usuario){
            u = (Usuario)o;
            if(this.nombre.equals(u.getNombre()) && this.contrasena.equals(u.getContrasena())){
                return true;
            }
        }
        return false;
    }
 
   
}
