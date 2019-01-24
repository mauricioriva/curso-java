/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jframe;

/**
 *
 * @author mauricio
 */

import javax.swing.JOptionPane;
public class JFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //new Principal().setVisible(true); //Correr ventana principal.java
        //JOptionPane.showMessageDialog(null, "Este es un mensaje simple", "JOptionPane", JOptionPane.PLAIN_MESSAGE);
        //WARNING_MESS..
        //INFORMATION_MESS..
        //ERROR_MESS..
        //QUESTION_MESS..
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero", "Multiplicacion por 2", JOptionPane.INFORMATION_MESSAGE));
        String num = Integer.toString(numero * 2);
        JOptionPane.showMessageDialog(null, "El resultado es: " + num, "Multiplicacion", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
