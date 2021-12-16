/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import interfaces.ILocutores;

/**
 *
 * @author Acer
 */
public class Locutores implements ILocutores{
    
    //Creacion de variables
    private String nombre;
    private String apellido_paterno;
    private String apellido_materno;
    private int edad;
    private String estudios;
    private String fecha_nacimiento;
    private String nacionalidad;
    private char sexo;
    private String curp;
    private String puesto;
    private String direccion;
    private String antiguedad;
    private String nss;
    private String rfc;
    private String numero_telefono;
    private String sucursal;
    
    //Metodo publico
    public Locutores() {
    }

    //Creacion de metodo publico
    @Override
    public String toString() {
        return "Los locutores son: {" + "Nombre: " + nombre + "\nApellido Paterno: " + apellido_paterno + "\nApellido Materno=" + apellido_materno + "\nEdad: " + edad + "\nEstudios: " + estudios + "\nFecha de nacimiento: " + fecha_nacimiento + "\nNacionalidad: " + nacionalidad + "\nSexo: " + sexo + "\nCURP: " + curp + "\nPuesto: " + puesto + "\nDireccion: " + direccion + "\nAntiguedad: " + antiguedad + "\nNSS: " + nss + "\nRFC: " + rfc + "\nNumero de telefono: " + numero_telefono + "\nSucursal: " + sucursal + '}';
    }

    //Variables que no cambian
    public Locutores(String rfc, String sucursal) {
        this.rfc = rfc;
        this.sucursal = sucursal;
    }

    //Creaccion de Getter and Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido_paterno() {
        return apellido_paterno;
    }

    public void setApellido_paterno(String apellido_paterno) {
        this.apellido_paterno = apellido_paterno;
    }

    public String getApellido_materno() {
        return apellido_materno;
    }

    public void setApellido_materno(String apellido_materno) {
        this.apellido_materno = apellido_materno;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEstudios() {
        return estudios;
    }

    public void setEstudios(String estudios) {
        this.estudios = estudios;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(String antiguedad) {
        this.antiguedad = antiguedad;
    }

    public String getNss() {
        return nss;
    }

    public void setNss(String nss) {
        this.nss = nss;
    }

    public String getNumero_telefono() {
        return numero_telefono;
    }

    public void setNumero_telefono(String numero_telefono) {
        this.numero_telefono = numero_telefono;
    }

    //Metodo override para clonar el locutor
    @Override
    public ILocutores clonar() {
        Locutores locutor1 = null;
        try{
            locutor1 = (Locutores) clone();
        }catch(CloneNotSupportedException error){
            error.printStackTrace();
        }
        return locutor1;
    }
    
}
