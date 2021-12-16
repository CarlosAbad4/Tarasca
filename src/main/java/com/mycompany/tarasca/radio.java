/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tarasca;

import clases.Locutores;
import clases.Programacion;
import facade.Facade;
import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 * Patrones de diseño Facade y Prototype
 * Elaborado por Carlos Fernando Abad Garcia Y Luis Angel Alcantar Giron
 */
public class radio {
    
    //Clase main
    public static void main(String args[]){
        
        
        //Se pide ingresar el numero de la estacion
        String radio = JOptionPane.showInputDialog("Ingresa la estación");
        
        int radiocorrecta = 98;
        
        //Convierte el tipo de la variable para hacer la siguiente comparacion
        int radiointeger = Integer.parseInt(radio);
        
        //Ingresar el numero 98 en la ventana de dialogo, para continuar con el programa
        if(radiointeger == radiocorrecta) {
            JOptionPane.showMessageDialog(null, "Estas escuchando Radio Tarasca");
        }else{
            JOptionPane.showMessageDialog(null, "La frecuencia no es correcta");
            System.exit(0);
        }
        //Si la comparacion falla el programa no se ejecuta, si se cumple sigue con normalidad
        
        /*
        while(radiointeger != radiocorrecta){
            JOptionPane.showMessageDialog(null, "La frecuencia no es correcta");
            radio = JOptionPane.showInputDialog("Ingresa la estación");
        }
        
        JOptionPane.showMessageDialog(null, "Estas escuchando Radio Tarasca");
        */
        
        
        //Insercion de datos para conductores, haciendo uso del patron de diseño Prototype
        Locutores carlos = new Locutores("MOM9810152F8", "Maravatio Centro");
        carlos.setNombre("Carlos Fernando Abad Garcia");
        carlos.setApellido_paterno("Abad");
        carlos.setApellido_materno("Garcia");
        carlos.setEdad(20);
        carlos.setEstudios("Superior");
        carlos.setFecha_nacimiento("22-10-01");
        carlos.setNacionalidad("Mexicana");
        carlos.setSexo('H');
        carlos.setCurp("AAGC01HMNBRRA06");
        carlos.setPuesto("Locutor Mañana");
        carlos.setDireccion("Calle Lazaro Cardenas #74 Maravatio Centro");
        carlos.setAntiguedad("2 años 3 meses");
        carlos.setNss("563156178");
        
        //Se clonan los datos del locutor carlos
        Locutores luisAngel = (Locutores)carlos.clonar();
        
        //Se insertan nuevos valores a un segundo locutor
        luisAngel.setApellido_materno("Giron");
        luisAngel.setApellido_paterno("Alcantar");
        luisAngel.setNombre("Luis Angel");
        luisAngel.setEdad(19);
        luisAngel.setCurp("SEG3785859JFJF");
        luisAngel.setPuesto("Locutor Tarde");
        luisAngel.setDireccion("Av. Mayo #351 Colonia Lomas del Panteo");
        luisAngel.setAntiguedad("3 años");
        luisAngel.setNss("38734204345");
        
        //Se muestran los datos de los locutores
        JOptionPane.showMessageDialog(null, carlos.toString());
        JOptionPane.showMessageDialog(null, luisAngel.toString());
        
        //Se hace la comparacion de datos
        JOptionPane.showMessageDialog(null, carlos == luisAngel);
        
        //Insercion de datos para programaciones, haciendo uso del patron de diseño Prototype
        Programacion prog1 = new Programacion("2:00 p.m. a 6:00 p.m.", "4 Horas", "La Tarasca", "Lunes, Marts Miercoles");
        prog1.setConductor("Carlos");
        prog1.setCategoria("Peticiones del Publico");
        prog1.setTitulo("Sorteos");
        prog1.setEdad_recomendada("Para todo el publico");       
        
        //Se clonan los datos de la primera programacion
        Programacion prog2 = (Programacion)prog1.clonar();
        
        //Se insertan nuevos valores a una segunda programacion
        prog1.setConductor("Angel");
        prog1.setCategoria("Top Music");
        prog1.setTitulo("Lo mas escuchado del mes");
        prog1.setEdad_recomendada("Mayores de 18"); ;
        
        //Muestra los datos de los programas
        JOptionPane.showMessageDialog(null, prog1.toString());
        JOptionPane.showMessageDialog(null, prog2.toString());
        
        //Comparacion de datos
        JOptionPane.showMessageDialog(null, prog1 == prog2);
        
        
        //Llama a la interfaz facade
        Facade cliente_carlos = new Facade();
        cliente_carlos.contactoBuscando("+52 447 118 27 18", "@radiotarasca", "4471101987", "trasca@gmail.com");
        
    }
}
