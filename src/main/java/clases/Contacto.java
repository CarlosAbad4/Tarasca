/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class Contacto {
    
    //Creacion de metodo contactanos
     public void contactanos(String Wht, String Fac, String Tf, String Ce){
    
         //Variable resultado con los datos de contacto
        String resultado = Contacto.datosContacto(Wht, Fac, Tf, Ce);
        //Mensaje a pantalla con los datos
        JOptionPane.showMessageDialog(null, "Los datos del contacto son: " + resultado + "\nWhatsApp: " + Wht + " \nFacebook: " + Fac + "\nTelefono Fijo: " + Tf + "." + "\nCorreo Electronico: " + Ce);
          
    }
    
     //Se selecciona el contacto
    public static String datosContacto(String WhatsApp, String Facebook, String Telefono_fijo, String Correo_electronico){
        String contactos = "Radio Tarasca";
        String contactoElegido = contactos;
        return contactoElegido;
    }
    
    
   
    
}
