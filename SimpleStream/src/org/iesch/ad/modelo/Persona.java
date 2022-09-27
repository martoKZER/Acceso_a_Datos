package org.iesch.ad.modelo;
public class Persona implements Comparable<Persona>{


    String nombre;

    int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
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
    @Override
    public String toString(){
        return "Persona{"+
                "edad="+ edad +
                "nombre: "+nombre+'\''+
                '}';
    }



    // devolver un 0 si son iguales
    // devolver 1 si this > que el argumento
    // devolver -1 si this < que el argumento
    @Override
    public int compareTo(Persona o) {
        return Integer.compare(this.edad, o.edad);
    }
}
