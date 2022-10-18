package jmx.ad.faster;

import com.fasterxml.jackson.databind.ObjectMapper;
import jmx.ad.faster.modelo.Equipo;
import jmx.ad.faster.modelo.Jugador;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        //https://github.com/FasterXML/jackson/
        //Serialización ejemplo
        ObjectMapper objectMapper = new ObjectMapper();
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
        try {
            //escribir a fichero
            objectMapper.writeValue(new File("data/M-united.json"), munited);


            //escribir por consola
            //https://mkyong.com/java/how-to-enable-pretty-print-json-output-jackson/
            String json = objectMapper.writeValueAsString(munited);
            System.out.println(json);
            System.out.println();
            //mas optimo
            System.out.println(objectMapper.writeValueAsString(munited));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        //Ejemplo deserialización!!!

        try {
            Equipo equipo = objectMapper.readValue(new File("data/M-united.json"), Equipo.class);
            System.out.println("\n\n**********************************************\nDeserializamos");
            System.out.println(equipo);
            //Tambien es valido con URL!!!! por supuesto tratando correctamente las excepciones.
            //Equipo equipo = objectMapper.readValue(new URL("file:data/M-united.json"), Equipo.class);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
