/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import clases.Contacto;

/**
 *
 * @author Acer
 */
public class Facade {
    
    //Crea un metodo privado
    private Contacto contacto;
    
    //Crea un metodo publico
    public Facade(){
        contacto = new Contacto();
    }
    
    //Creacion de metodo con parametros
    public void contactoBuscando(String Wht, String Fac, String Tf, String Ce){
        contacto.contactanos(Wht, Fac, Tf, Ce);
    }
}
