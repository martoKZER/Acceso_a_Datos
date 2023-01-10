
package org.iesch.ad.model;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.time.LocalDate;

@NoArgsConstructor@AllArgsConstructor@Builder@Data
@Entity //Representa la tajeta de identificación universitaria
public class IdCard {
    @Id
    int numero;
    String titulo;
    boolean activo;
    LocalDate fechaCaducidad;

    @OneToOne
    Person person;


    @Override
    public String toString() {
        return "IdCard{" +
                "numero=" + numero +
                ", titulo='" + titulo + '\'' +
                ", activo=" + activo +
                ", fechaCaducidad=" + fechaCaducidad +
                ", person=" +
                '}';
    }
}