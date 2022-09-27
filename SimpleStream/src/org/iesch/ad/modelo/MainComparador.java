package org.iesch.ad.modelo;

import java.util.*;

public class MainComparador {
    public static void main(String[] args) {
//        Persona p1 = new Persona("Pepe", 20);
//        Persona p2 = new Persona("Luis", 18);
//        Persona p3 = new Persona("Ana", 41);
//        Persona p4 = new Persona("Vivas", 35);
//
//        System.out.println("\nComparable");
//        List<Persona> lista = new ArrayList<>();
//        lista.add(p1);
//        lista.add(p2);
//        lista.add(p3);
//        lista.add(p4);
//
//        System.out.println("\nSin ordenar");
//        for (Persona p : lista)  System.out.println(p);
//
//        System.out.println("\nOrdenado");
//        for (Persona p : lista) System.out.println(p);
//
//        System.out.println("\nUsuario interfaz Comparator");
//        // Creo un objeto PersonaNombreComparator que implementa la clase Comparator.
//        PersonaNombreComparator pComparator = new PersonaNombreComparator();
//        // Y puedo usar el sort pasandole el PersonaNombreComparator
//        Collections.sort(lista, pComparator);
//        lista.stream().forEach(System.out::println);
//
//        System.out.println("\nCon programación funcional. Lambda");
//        Comparator<Persona> viejuno =(v1, v2) -> Integer.compare(v1.getEdad(), v2.getEdad());
//        Persona p5 = new Persona("Avelino", 85);
//        lista.add(p5);
//        Collections.sort(lista, viejuno);
//        //for (Persona p : lista) System.out.println(p);
//        lista.stream().forEach(System.out::println);

        System.out.println("Lista instrumentos");
        Instrumento i1 = new Instrumento("Cuerda", "guitarra", 45);
        Instrumento i2 = new Instrumento("Percusion", "batería", 99);
        Instrumento i3 = new Instrumento("Cuerda", "guitarra", 45);// lo mismo que i1
        List<Instrumento> instrumentos = new ArrayList<>();

        List<Instrumento> array = new ArrayList<>();
        array.add(i1);
        array.add(i2);
        array.add(i3);

        System.out.println("\nTreeset");
        TreeSet<Instrumento> treeSet = new TreeSet<>();
        treeSet.add(i1);
        treeSet.add(i2);
        treeSet.add(i3);
        treeSet.forEach(System.out::println);//No repetidos.

        System.out.println("\nTreemap String");

        TreeMap<Integer, Instrumento> map = new TreeMap<>();
        map.put(1, i1);
        map.put(2, i2);
        map.put(3, i3);

        //Muestra el 2
        System.out.println(map.get(2));
        // Muestra el 1
        System.out.println(map.get(1));
        // NO muestra el 3 porque es duplicado.
        System.out.println(map.get(3));

//        TreeMap<String, Instrumento> stringMap = new TreeMap<>();
//        stringMap.put("cuerda", i1);
//        stringMap.put("Percusion", i2);
//        stringMap.put("3", i3);
//
//        //Muestra el 2
//        System.out.println(map.get("Percusion"));
//        // Muestra el 1
//        System.out.println(map.get("cuerda"));
//        // Muestra el 3 porque ya no lo percibe como otro valor.
//        System.out.println(map.get("3"));
    }
}


