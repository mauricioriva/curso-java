/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jframe;

import javax.swing.JOptionPane;

/**
 *
 * @author mario
 */
public class JFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //FRAME
        new Principal().setVisible(true);
        
        //JOptionPane SHOW
        JOptionPane.showMessageDialog(null,"Es un mensaje Simple de Información");
        JOptionPane.showMessageDialog(null, "Este es un mensaje de Advertencia",
  "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
        
        //JoptionPane INPUT
        int numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un" +
  " numero para multiplicarlo por 2"));
        String num  = Integer.toString(numero*2);
        JOptionPane.showMessageDialog(null, "El resultado es: " + num, "Multiplicacion", JOptionPane.PLAIN_MESSAGE);
        
        //JOptionPane CONFIRM -- No lo alcanzamos a ver
        int resp=JOptionPane.showConfirmDialog(null,"Usas mucho el JOptionPane?"); //Muestra Dialogo
        //Si das YEs
        if (JOptionPane.OK_OPTION == resp)
        {
            //Desplega un mensaje de Afirmativo
            JOptionPane.showMessageDialog(null, "Afirmativo", "Respuesta", JOptionPane.PLAIN_MESSAGE);
        }
        else //Si no
        {
            //Despliega un mensaje de negativo
        JOptionPane.showMessageDialog(null, "Negativo", "Respuesta", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
