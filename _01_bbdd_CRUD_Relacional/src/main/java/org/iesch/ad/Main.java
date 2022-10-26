package org.iesch.ad;

import org.iesch.ad.controlador.MiControlador;
import org.iesch.ad.modelo.Person;

import javax.management.remote.rmi.RMIConnection;
import java.sql.Connection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Realizamod nuestro primer CRUD");
        MiControlador miControlador = new MiControlador();
        // dame todas las personas.
        List<Person> list = miControlador.todasLasPersonas();
        //list.forEach(System.out::println);
        Person p = new Person(1100, "Chanchito","Cagon", "chanchi@aa.es","Trans", "192.168.1.2",800.F);
        miControlador.inserta(p);

        // dame todas las personas.
        //List lista = miControlador.todasLasPersonas();
    }
}
