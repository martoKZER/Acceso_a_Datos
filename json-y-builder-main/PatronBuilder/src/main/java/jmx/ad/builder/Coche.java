package jmx.ad.builder;

import lombok.Builder;
import lombok.ToString;

@Builder(toBuilder = true) //Esto le dice a Lombok que añada el metodo toBuilder() a nuestra clase.
@ToString
public class Coche {

    String marca;
    String modelo;
    String matricula;
}
