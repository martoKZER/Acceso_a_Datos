package jmx.ad.json_gson.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Equipo {

    String nombre;
    String localidad;
    String estadio;
    List<Jugador> miembros = new ArrayList<>();


    public void addJugador(Jugador j){
         miembros.add(j);

    }
}
