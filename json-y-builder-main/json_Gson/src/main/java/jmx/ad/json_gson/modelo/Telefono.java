package jmx.ad.json_gson.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Telefono {

    String marca;
    String modelo;
    int ram;
    int almacenamiento;
}
