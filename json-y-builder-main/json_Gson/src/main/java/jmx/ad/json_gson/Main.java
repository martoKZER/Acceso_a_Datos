package jmx.ad.json_gson;


import com.google.gson.Gson;
import jmx.ad.json_gson.modelo.Equipo;
import jmx.ad.json_gson.modelo.Jugador;
import jmx.ad.json_gson.modelo.Telefono;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Telefono telefono = new Telefono("Samsung", "S21", 32, 256);
        Telefono telefono2 = new Telefono("Poco", "f3", 64, 256);
        Telefono telefono3 = new Telefono("Xiaomi", "12", 64, 512);

        Telefono[] lista = {telefono,telefono2, telefono3};
        String jsonString = new Gson().toJson(lista);
        System.out.println(jsonString);


        //Colección
        System.out.println();
        System.out.println("Coleccion");

        List<Telefono> listadoTelefonos = new ArrayList<>();
        listadoTelefonos.add(telefono);
        listadoTelefonos.add(telefono2);
        listadoTelefonos.add(telefono3);
        String jsonCollection = new Gson().toJson(listadoTelefonos);
        System.out.println(jsonCollection);


        Jugador j1 = new Jugador("De Gea", "Portero", 1);
        Jugador j2 = new Jugador("Phil Jones", "defensa", 4);
        Jugador j3 = new Jugador("Marcu Rashford", "delantero", 10);

        Equipo  munited = new Equipo();
        munited.setEstadio("Old Trafford");
        munited.setLocalidad("Manchester");
        munited.setNombre("Manchester United");
        munited.addJugador(j1);
        munited.addJugador(j2);
        munited.addJugador(j3);

        String jsonMunited = new Gson().toJson(munited);

        System.out.println(jsonMunited);//copio este sout
        //lo pego en la pagina: https://jsoncrack.com/editor


        //deserialización
        //usamos el mismo json generado...
        String jsonToObjetos = "{\"nombre\":\"Manchester United\",\"localidad\":\"Manchester\",\"estadio\":\"Old Trafford\",\"miembros\":[{\"nombre\": \"De Gea\",\"demarcacion\":\"Portero\",\"numero\": 1},    {      \"nombre\": \"Phil Jones\",      \"demarcacion\": \"defenda\",      \"numero\": 4},{\"nombre\": \"Marcu Rashford\",\"demarcacion\": \"delantero\",\"numero\": 10}  ]}";


        Equipo equipoDes = new Gson().fromJson(jsonToObjetos, Equipo.class);

        System.out.println("Obtenemos objetos del Json");
        //Mostramos los objetos
        System.out.println(equipoDes.toString());


        //con el deserializado se debe tener cuidado...
        //https://github.com/google/gson/blob/master/UserGuide.md#custom-serialization-and-deserialization
        //float 3.14, pero en españa usamos 3,14 podemos recibir un json con 3.14
        //podemos recibir un json con un string cuando esperamos un int o un float
        //int cantidad              y recibimos "cantidad":"vacio"



    }







}
