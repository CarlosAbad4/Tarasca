/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import interfaces.IProgramacion;

/**
 *
 * @author Acer
 */
public class Programacion implements IProgramacion{
    
    //Creacion de variables
    private String conductor;
    private String titulo;
    private String hora;
    private String edad_recomendada;
    private String duracion;
    private String canal ;
    private String dias_semana;
    private String categoria;
    
    //Creacion de metodo publico
    public Programacion() {
    }

    //Creacion de mtodo override
    @Override
    public String toString() {
        return "La programacion es: {" + "Conductor: " + conductor + "\nTitulo: " + titulo + "\nHora: " + hora + "\nEdad recomandada: " + edad_recomendada + "\nDuracion: " + duracion + "\nCanal: " + canal + "\nDias de la semana: " + dias_semana + "\nCategoria: " + categoria +  '}';
    }

    //Variablles que no cambian
    public Programacion(String hora, String duracion, String canal, String dias_semana) {
        this.hora = hora;
        this.duracion = duracion;
        this.canal = canal;
        this.dias_semana = dias_semana;
    }

    //Creacion de getter and setter
    public String getConductor() {
        return conductor;
    }

    public void setConductor(String conductor) {
        this.conductor = conductor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEdad_recomendada() {
        return edad_recomendada;
    }

    public void setEdad_recomendada(String edad_recomendada) {
        this.edad_recomendada = edad_recomendada;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

   
    //Creacion de metodo override para clonar programacion
    @Override
    public IProgramacion clonar() {
        Programacion programacion1 = null;
        try{
            programacion1 = (Programacion) clone();
        }catch(CloneNotSupportedException error){
            error.printStackTrace();
        }
        return programacion1;
    }
    
}
