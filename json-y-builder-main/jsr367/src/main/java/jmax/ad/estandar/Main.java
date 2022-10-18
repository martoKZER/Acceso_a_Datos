package jmax.ad.estandar;

import jmax.ad.estandar.modelo.Equipo;
import jmax.ad.estandar.modelo.Jugador;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;

public class Main {

    //https://javaee.github.io/jsonb-spec/


    public static void main(String[] args) {
        String jsonToObjetos = "{\"nombre\":\"Manchester United\",\"localidad\":\"Manchester\",\"estadio\":\"Old Trafford\",\"miembros\":[{\"nombre\": \"De Gea\",\"demarcacion\":\"Portero\",\"numero\": 1},    {      \"nombre\": \"Phil Jones\",      \"demarcacion\": \"defenda\",      \"numero\": 4},{\"nombre\": \"Marcu Rashford\",\"demarcacion\": \"delantero\",\"numero\": 10}  ]}";



        Jugador j1 = new Jugador("De Gea", "Portero", 1);
        Jugador j2 = new Jugador("Phil Jones", "defenda", 4);
        Jugador j3 = new Jugador("Marcu Rashford", "delantero", 10);

        Equipo munited = new Equipo();
        munited.setEstadio("Old Trafford");
        munited.setLocalidad("Manchester");
        munited.setNombre("Manchester United");
        munited.addJugador(j1);
        munited.addJugador(j2);
        munited.addJugador(j3);


        System.out.println("jsonb-spec");


        Jsonb jsonb = JsonbBuilder.create();
        String jsonMunited = jsonb.toJson( munited);

        System.out.println(jsonMunited);


        //deserializar
        Equipo equipoManchester = jsonb.fromJson(jsonToObjetos, Equipo.class);

        System.out.println(equipoManchester);


        //revisar anotaciones:
        //https://javaee.github.io/jsonb-spec/users-guide.html

        //revisar adaptadores:
        //https://javaee.github.io/jsonb-spec/docs/user-guide.html#adapters


    }
}