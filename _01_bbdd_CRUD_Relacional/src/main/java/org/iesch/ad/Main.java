package org.iesch.ad;

import org.iesch.ad.controlador.MiControlador;
import org.iesch.ad.modelo.Person;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Realizamos nuestro primer CRUD");
        MiControlador miControlador = new MiControlador();
        // dame todas las personas.
        List<Person> list = miControlador.todasLasPersonas();
        //list.forEach(System.out::println);
        Person f = new Person(2, "Alberto","Carlos", "albertocarlos@yahoo.es","Male", "154.124.10.2",700F);

        System.out.println("Se inserta?? "+ miControlador.inserta(f));

        // dame todas las personas.
        //List lista = miControlador.todasLasPersonas();
    }
}
