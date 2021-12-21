/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresapersona;

/**
 *
 * @author GR6
 */
public class Persona {

    private String nombre;
    private int edad;

    private Direccion dirección;

    public Persona(String nombre, int edad, Direccion dirección) {
        this.nombre = nombre;
        this.edad = edad;
        this.dirección = dirección;
    }

    public Direccion getDirección() {
        return dirección;
    }

    public void setDirección(Direccion dirección) {
        this.dirección = dirección;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
