package jmx.ad.builder;
// librería lombok, crea t0d0 lo relacionador con el patron de desarrollo builder
import lombok.Builder;
import lombok.ToString;
// Con esta marca indicas al que lea esto (y a lombok) que debajo viene un pojo para completar el resto del patrón
@Builder
@ToString
public class PersonaBuilder {

    String nombre;
    String apellido;
    String telefono;
    String email;
}
